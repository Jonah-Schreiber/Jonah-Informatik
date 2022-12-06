package Spiele;

import basis.*;

public class NimmSpiel {
    // direkter Start des Spiels
    public static void main(String[] args) {
        new NimmSpiel();
    }

    // Elemente
    private Fenster fenster;
    private Stift stift;
    private BeschriftungsFeld b1, b2, b3;
    private final Knopf k1, k2, k3;

    // Variablen
    private int anzahlHoelzer;
    private boolean spieler1;

    public NimmSpiel() {
        // Fenster
        fenster = new Fenster("Nimm-Spiel", 1000, 1000);
        // Beschriftungen
        b1 = new BeschriftungsFeld("Spieler 1", 200, 50, 200, 50);
        b1.setzeSchriftGroesse(25);
        b2 = new BeschriftungsFeld(anzahlHoelzer + " Hölzer", 200, 250, 100, 50);
        b2.setzeSchriftGroesse(25);
        b3 = new BeschriftungsFeld("", 190, 300, 200, 30);
        b3.setzeSchriftFarbe(Farbe.ROT);
        b3.setzeSchriftGroesse(20);
        // Knöpfe
        k1 = new Knopf("-1", 50, 150, 100, 40);
        k2 = new Knopf("-2", 200, 150, 100, 40);
        k3 = new Knopf("-3", 350, 150, 100, 40);
        k1.setzeKnopfLauscher(knopf -> ausfuehren(1));
        k2.setzeKnopfLauscher(knopf -> ausfuehren(2));
        k3.setzeKnopfLauscher(knopf -> ausfuehren(3));
        // Stift
        stift = new Stift();
        // Variablen
        spieler1 = true;
        anzahlHoelzer = Hilfe.zufall(10, 20);
    }

    public void ausfuehren(int minusAnzahl) {
        anzahlHoelzer -= minusAnzahl;
        b2.setzeText(anzahlHoelzer + " Hölzer");
        if (spieler1) {
            b1.setzeText("Spieler 2");
            spieler1 = false;
            this.ki();
        } else {
            b1.setzeText("Spieler 1");
            spieler1 = true;
        }
        this.gewinnerPruefen();

    }

    public void gewinnerPruefen() {
        if (anzahlHoelzer == 1) {
            if (spieler1) {
                b3.setzeText("Spieler 1 hat verloren.");
            } else {
                b3.setzeText("Spieler 2 hat verloren.");
            }
        }
    }

    public void ki() {
        Hilfe.pause(1000);
        if (anzahlHoelzer == 4) {
            ausfuehren(3);
        } else if (anzahlHoelzer == 3) {
            ausfuehren(2);
        } else if (anzahlHoelzer == 2) {
            ausfuehren(1);
        } else if (anzahlHoelzer == 5) {
            ausfuehren(Hilfe.zufall(1, 3));
        } else if (anzahlHoelzer == 6) {
            ausfuehren(1);
        } else if (anzahlHoelzer == 7) {
            ausfuehren(2);
        } else if (anzahlHoelzer == 1) {
            ausfuehren(1);
        } else if (anzahlHoelzer == 8) {
            ausfuehren(3);
        } else {
            ausfuehren(Hilfe.zufall(1, 3));
        }
    }
}