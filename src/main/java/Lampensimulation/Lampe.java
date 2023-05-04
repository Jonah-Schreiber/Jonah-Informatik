package Lampensimulation;

import basis.*;

public class Lampe {
    private Stift stift = new Stift();

    private boolean isOn = false;
    private int xwert, ywert, radius;
    private Bild bild = new Bild();

    public Lampe(int x, int y, int r) {
        xwert = x;
        ywert = y;
        radius = r;

        bild.setzeMausLauscherStandard(getMausLauscher());
        this.zeigeLampe();
    }

    private MausLauscherStandard getMausLauscher() {
        return new MausLauscherStandard() {
            @Override
            public void bearbeiteMausDruck(Object o, int i, int i1) {
                isOn = !isOn;
                System.out.println("Schalter!");
                zeigeLampe();
            }

            @Override
            public void bearbeiteMausDruckRechts(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausLos(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausLosRechts(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausBewegt(Object o, int i, int i1) {

            }

            @Override
            public void bearbeiteMausGezogen(Object o, int i, int i1) {

            }
        };
    }

    public void zeigeLampe() {

        stift.normal();
        if (isOn) {
            stift.setzeFuellMuster(Muster.GEFUELLT);
        } else {
            stift.setzeFuellMuster(Muster.DURCHSICHTIG);
        }
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
        this.zeigeLampe();
    }

    public void lampeAn() {
        this.zeigeLampe();
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
