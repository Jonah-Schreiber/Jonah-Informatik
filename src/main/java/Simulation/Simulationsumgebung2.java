package Simulation;

import basis.Fenster;
import basis.Hilfe;
import basis.Knopf;
import basis.Maus;

public class Simulationsumgebung2 {
    private Fenster fenster;
    private Knopf ende, vor;

    private Maus maus;
    private Lampe arrr[][];

    public Simulationsumgebung2() {
        fenster = new Fenster("Lichtwechsel", 1600, 1500);

        maus = new Maus();

        ende = new Knopf("Ende", 420, 1000, 100, 30);

        arrr = new Lampe[15][10];
        this.fuehreAus();
    }

    public void fuehreAus() {
        Hilfe.kurzePause();
        for (int i = 0; i < arrr.length; i++) {
            for (int h = 0; h < arrr[0].length; h++) {
                arrr[i][h] = new Lampe(45 + i * 80, 45 + h * 80, 35);
                arrr[i][h].zeigeLampe(45 + i * 80, 45 + h * 80, 35);
            }
        }

        while (true) {
            Hilfe.kurzePause();
            for (int i = 0; i < arrr.length; i++) {
                Hilfe.pause(300);
                if (i == 14) {
                    //0,1
                    arrr[0][1].lampeAus();
                    arrr[i][1].lampeEin();

                    //0,2
                    arrr[0][2].lampeAus();
                    arrr[i][2].lampeEin();

                    //0,3
                    arrr[0][3].lampeAus();
                    arrr[i][3].lampeEin();

                    //0,4
                    arrr[0][4].lampeAus();
                    arrr[i][4].lampeEin();

                    //0,5
                    arrr[0][5].lampeAus();
                    arrr[i][5].lampeEin();

                    //1,2
                    arrr[1][2].lampeAus();

                    //2,3
                    arrr[2][3].lampeAus();
                    arrr[1][3].lampeEin();
                } else {
                    if (i == 13) {
                        //1,2
                        arrr[0][2].lampeAus();
                        arrr[i + 1][2].lampeEin();

                        //2,3
                        arrr[1][3].lampeAus();
                        arrr[0][3].lampeEin();
                        //arrr[i+1][3].lampeEin();
                    } else {
                        if (i == 12) {
                            //2,3
                            arrr[0][3].lampeAus();
                            arrr[i + 1][3].lampeEin();
                        } else {
                            arrr[i + 3][3].lampeAus();
                            arrr[i + 2][3].lampeEin();
                        }

                        //1,2
                        arrr[i + 2][2].lampeAus();
                    }
                    //links oben
                    arrr[i + 1][1].lampeAus();
                    arrr[i][1].lampeEin();

                    //eins drunter
                    arrr[i + 1][2].lampeAus();
                    arrr[i][2].lampeEin();

                    //zwei drunter
                    arrr[i + 1][3].lampeAus();
                    arrr[i][3].lampeEin();

                    //drei drunter
                    arrr[i + 1][4].lampeAus();
                    arrr[i][4].lampeEin();

                    //vier drunter
                    arrr[i + 1][5].lampeAus();
                    arrr[i][5].lampeEin();

                }
            }
            if (ende.wurdeGedrueckt()) {
                fenster.gibFrei();
            }
        }
    }
}


