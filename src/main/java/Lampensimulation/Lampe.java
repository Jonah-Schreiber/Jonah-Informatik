package Lampensimulation;

import basis.Farbe;
import basis.Hilfe;
import basis.Muster;
import basis.Stift;

public class Lampe {
    private Stift stift;
    private int xwert, ywert, radius;


    public Lampe() {

    }

    public void zeigeLampe(int x, int y, int r) {
        xwert = x;
        ywert = y;
        radius = r;
        stift.normal();
        stift.setzeFuellMuster(Muster.GEFUELLT);
        stift.setzeFarbe(Farbe.MAGENTA);
        stift.kreis(xwert, ywert, radius);
    }

    public void loesche() {
        stift.setzeFuellMuster(Muster.GEFUELLT);
        stift.radiere();
        stift.kreis(xwert, ywert, radius + 1);
    }

    public void setzePosition(int x, int y) {
        this.loesche();
        xwert = x;
        ywert = y;
        this.zeigeLampe(xwert, ywert, radius);
    }

    public void lampeAn() {
        this.zeigeLampe(xwert, ywert, radius);
    }

    public void lampeAus() {
        this.loesche();
        stift.normal();
        stift.setzeFuellMuster(Muster.DURCHSICHTIG);
        stift.kreis(xwert, ywert, radius);
    }

    public void lampeBlinken() {
        for (int i = 0; i < 10; i++) {
            this.lampeAn();
            Hilfe.pause(1000);
            this.lampeAus();
            Hilfe.pause(1000);
        }
    }
}
