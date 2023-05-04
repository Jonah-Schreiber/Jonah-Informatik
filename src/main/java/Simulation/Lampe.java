package Simulation;

import basis.Farbe;
import basis.Muster;
import basis.Stift;

import java.awt.*;

public class Lampe {
    private Stift stift;
    private int xwert, ywert, radius;
    private Color farbe;

    public Lampe(int x, int y, int r) {

        stift = new Stift();
        // farbe=Farbe.rgb(Hilfe.zufall(150,250), Hilfe.zufall(150,250),Hilfe.zufall(150,250));
        farbe = Farbe.rgb(0, 0, 255);
    }

    public void zeigeLampe(int x, int y, int r) {
        xwert = x;
        ywert = y;
        radius = r;

        stift.normal();
        stift.setzeFuellMuster(Muster.GEFUELLT);
        stift.setzeFarbe(farbe);
        stift.kreis(xwert, ywert, radius);
    }

    public void loesche() {
        stift.setzeFuellMuster(Muster.GEFUELLT);
        stift.radiere();
        stift.kreis(xwert, ywert, radius + 1);
    }

    public void setztePosition(int x, int y) {
        this.loesche();
        xwert = x;
        ywert = y;
        this.zeigeLampe(xwert, ywert, radius);
    }

    public void lampeAus() {
        this.loesche();
        stift.normal();
        stift.setzeFuellMuster(Muster.DURCHSICHTIG);
        stift.kreis(xwert, ywert, radius);
    }

    public void lampeEin() {
        this.zeigeLampe(xwert, ywert, radius);
    }

}

