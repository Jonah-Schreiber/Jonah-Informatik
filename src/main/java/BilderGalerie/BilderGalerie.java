package BilderGalerie;

import basis.*;

public class BilderGalerie {
    //Deklaration
    private Fenster f;
    private Bild b1, b2;
    private IgelStift s;

    public BilderGalerie() {
        //Erzeugen
        f = new Fenster("Galerie", 400, 300);
        f.setzeHintergrundFarbe(Farbe.GELB);
        s = new IgelStift();
        b1 = new Bild(10, 10, 150, 200);
        b1.setzeHintergrundFarbe(Farbe.HELLGRAU);
        b2 = new Bild(270, Hilfe.zufall(170, 210), 150, 150);
        b2.setzeHintergrundFarbe(Farbe.GRUEN);

        this.fuehreAus();
    }

    public void zeichneDreieck() {
        //Benutzen und Abbauen
        s.hoch();
        s.bewegeBis(50, 100);
        s.runter();
        s.bewegeUm(50);
        s.dreheUm(120);
        s.bewegeUm(50);
        s.dreheUm(120);
        s.bewegeUm(50);
        s.dreheUm(120);
    }

    public void zeichneScheibe() {
        s.hoch();
        s.bewegeBis(80, 80);
        s.zeichneKreis(30);
        s.zeichneKreis(20);
        s.zeichneKreis(10);
    }

    public void fuehreAus() {
        s.maleAuf(b1);
        this.zeichneDreieck();
        s.maleAuf(b2);
        this.zeichneScheibe();
        s.setzeSichtbar(false);
    }
}
