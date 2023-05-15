package Simulation;

import basis.Fenster;
import basis.Hilfe;
import basis.Knopf;

public class Kette {
    private Fenster fenster;
    private Knopf kEnde;

    Lampe lampe[] = new Lampe[10];

    public Kette() {
        fenster = new Fenster("Kette", 1000, 500);
        kEnde = new Knopf("Ende", 250, 450, 200, 20);
        kEnde.setzeKnopfLauscher(knopf -> this.fenster.gibFrei());

        lampe[0] = new Lampe(150, 100, 20);
        lampe[0].zeigeLampe(50, 50, 30);

        lampe[1] = new Lampe(150, 100, 20);
        lampe[1].zeigeLampe(100, 50, 30);

        lampe[2] = new Lampe(150, 100, 20);
        lampe[2].zeigeLampe(150, 50, 30);

        lampe[3] = new Lampe(150, 100, 20);
        lampe[3].zeigeLampe(200, 50, 30);

        lampe[4] = new Lampe(150, 100, 20);
        lampe[4].zeigeLampe(250, 50, 30);

        lampe[5] = new Lampe(150, 100, 20);
        lampe[5].zeigeLampe(300, 50, 30);

        lampe[6] = new Lampe(150, 100, 20);
        lampe[6].zeigeLampe(350, 50, 30);

        lampe[7] = new Lampe(150, 100, 20);
        lampe[7].zeigeLampe(400, 50, 30);

        lampe[8] = new Lampe(150, 100, 20);
        lampe[8].zeigeLampe(450, 50, 30);

        lampe[9] = new Lampe(150, 100, 20);
        lampe[9].zeigeLampe(500, 50, 30);

        this.fuehreAus();
    }

    public void fuehreAus() {
        for (int i = 0; i < 10; i++) {
            lampe[0].lampeEin();
            lampe[1].lampeAus();
            lampe[2].lampeAus();
            lampe[3].lampeAus();
            lampe[4].lampeAus();
            lampe[5].lampeAus();
            lampe[6].lampeAus();
            lampe[7].lampeAus();
            lampe[8].lampeAus();
            lampe[9].lampeAus();
            Hilfe.pause(300);
            lampe[0].lampeAus();
            lampe[1].lampeEin();
            Hilfe.pause(300);
            lampe[1].lampeAus();
            lampe[2].lampeEin();
            Hilfe.pause(300);
            lampe[2].lampeAus();
            lampe[3].lampeEin();
            Hilfe.pause(300);
            lampe[3].lampeAus();
            lampe[4].lampeEin();
            Hilfe.pause(300);
            lampe[4].lampeAus();
            lampe[5].lampeEin();
            Hilfe.pause(300);
            lampe[5].lampeAus();
            lampe[6].lampeEin();
            Hilfe.pause(300);
            lampe[6].lampeAus();
            lampe[7].lampeEin();
            Hilfe.pause(300);
            lampe[7].lampeAus();
            lampe[8].lampeEin();
            Hilfe.pause(300);
            lampe[8].lampeAus();
            lampe[9].lampeEin();
            Hilfe.pause(300);
            lampe[9].lampeAus();
            lampe[0].lampeEin();
        }
    }
}
