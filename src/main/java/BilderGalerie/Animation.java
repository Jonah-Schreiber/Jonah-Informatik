package BilderGalerie;

import basis.*;

public class Animation {
    //Deklaration
    private Fenster f;
    private Bild b1, b2, b3, b4;
    private IgelStift s;

    public Animation() {
        //Erzeugen
        f = new Fenster("Hampelmanngalerie", 640, 200);
        f.setzeHintergrundFarbe(Farbe.GELB);
        s = new IgelStift();
        b1 = new Bild(100, 10, 100, 150);
        b1.setzeHintergrundFarbe(Farbe.GRUEN);
        b2 = new Bild(100, 10, 100, 150);
        b2.setzeHintergrundFarbe(Farbe.GRUEN);
        b3 = new Bild(100, 10, 100, 150);
        b3.setzeHintergrundFarbe(Farbe.GRUEN);

        this.maleBilder();
        this.zeigeVon1bis4();

    }

    public void zeigeVon1bis4() {
        for (int i = 0; i < 10; i++) {
            b2.setzeSichtbar(false);
            b3.setzeSichtbar(false);
            b1.setzeSichtbar(true);
            Hilfe.pause(300);
            b1.setzeSichtbar(false);
            b2.setzeSichtbar(true);
            Hilfe.pause(300);
            b2.setzeSichtbar(false);
            b3.setzeSichtbar(true);
            Hilfe.pause(300);

        }
    }

    public void maleBilder() {
        s.maleAuf(b1);
        this.zeichneP1();
        s.maleAuf(b2);
        this.zeichneP2();
        s.maleAuf(b3);
        this.zeichneP3();
        s.setzeSichtbar(false);

    }

    public void zeichneP1() {
        //Benutzen und Abbauen
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(40);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-80);
        s.bewegeUm(50);
    }

    public void zeichneP2() {
        //Benutzen und Abbauen
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(90);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-180);
        s.bewegeUm(50);
    }

    public void zeichneP3() {
        //Benutzen und Abbauen
        s.hoch();
        s.bewegeBis(50, 30);
        s.zeichneKreis(20);
        s.dreheBis(270);
        s.bewegeUm(20);
        s.runter();
        s.bewegeUm(40);
        s.dreheUm(30);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-60);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(30);
        s.bewegeUm(-30);
        s.dreheUm(120);
        s.bewegeUm(50);
        s.bewegeUm(-50);
        s.dreheUm(-200);
        s.bewegeUm(50);
    }

}
