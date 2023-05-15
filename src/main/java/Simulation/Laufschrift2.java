package Simulation;

import basis.Fenster;
import basis.Hilfe;
import basis.Knopf;

public class Laufschrift2 {
    private Fenster fenster;
    private Knopf kEnde;
    private Lampe lampe[][];

    public Laufschrift2() {
        fenster = new Fenster("Laufschrift", 1000, 500);

        kEnde = new Knopf("Ende", 250, 450, 200, 20);
        kEnde.setzeKnopfLauscher(knopf -> this.fenster.gibFrei());

        lampe = new Lampe[15][10];

        this.fuehreAus();
    }

    public void fuehreAus() {
        Hilfe.kurzePause();
        for (int i = 0; i < lampe.length; i++) {
            for (int h = 0; h < lampe[0].length; h++) {
                lampe[i][h] = new Lampe(45 + i * 40, 45 + h * 40, 20);
                lampe[i][h].zeigeLampe(45 + i * 40, 45 + h * 40, 20);
            }
        }

        while (true) {
            Hilfe.kurzePause();
            for (int i = 0; i < lampe.length; i++) {
                Hilfe.pause(300);
                if (i == 14) {
                    //0,1
                    lampe[0][1].lampeAus();
                    lampe[i][1].lampeEin();

                    //0,2
                    lampe[0][2].lampeAus();
                    lampe[i][2].lampeEin();

                    //0,3
                    lampe[0][3].lampeAus();
                    lampe[i][3].lampeEin();

                    //0,4
                    lampe[0][4].lampeAus();
                    lampe[i][4].lampeEin();

                    //0,5
                    lampe[0][5].lampeAus();
                    lampe[i][5].lampeEin();

                    //1,2
                    lampe[1][2].lampeAus();

                    //2,3
                    lampe[2][3].lampeAus();
                    lampe[1][3].lampeEin();
                } else {
                    if (i == 13) {
                        //1,2
                        lampe[0][2].lampeAus();
                        lampe[i + 1][2].lampeEin();

                        //2,3
                        lampe[1][3].lampeAus();
                        lampe[0][3].lampeEin();
                        //arrr[i+1][3].lampeEin();
                    } else {
                        if (i == 12) {
                            //2,3
                            lampe[0][3].lampeAus();
                            lampe[i + 1][3].lampeEin();
                        } else {
                            lampe[i + 3][3].lampeAus();
                            lampe[i + 2][3].lampeEin();
                        }

                        //1,2
                        lampe[i + 2][2].lampeAus();
                    }
                    //links oben
                    lampe[i + 1][1].lampeAus();
                    lampe[i][1].lampeEin();

                    //eins drunter
                    lampe[i + 1][2].lampeAus();
                    lampe[i][2].lampeEin();

                    //zwei drunter
                    lampe[i + 1][3].lampeAus();
                    lampe[i][3].lampeEin();

                    //drei drunter
                    lampe[i + 1][4].lampeAus();
                    lampe[i][4].lampeEin();

                    //vier drunter
                    lampe[i + 1][5].lampeAus();
                    lampe[i][5].lampeEin();

                }
            }

        }
    }
}
