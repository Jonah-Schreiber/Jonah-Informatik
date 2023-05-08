package Simulation;


import basis.*;

public class Simulationsumgebung {
    private Fenster fenster;
    private Knopf kEnde, kSchalterEin, kSchalterAus;
    ZahlenFeld lampenwahl;
    Lampe lampe[] = new Lampe[2];

    public Simulationsumgebung() {
        fenster = new Fenster("Simulationsumgebung", 1000, 500);
        lampenwahl = new ZahlenFeld(30, 350, 100, 25);
        kEnde = new Knopf("Ende", 250, 450, 200, 20);
        kEnde.setzeKnopfLauscher(knopf -> this.fenster.gibFrei());
        kSchalterEin = new Knopf("Lampe einschalten", 30, 380, 200, 20);
        kSchalterEin.setzeKnopfLauscher(knopf -> this.lampeSchalterEin());
        kSchalterAus = new Knopf("Lampe ausschalten", 30, 450, 200, 20);
        kSchalterAus.setzeKnopfLauscher(knopf -> this.lampeSchalterAus());
        lampe[0] = new Lampe(100, 50, 10);
        lampe[0].zeigeLampe(50, 50, 20);
        lampe[1] = new Lampe(150, 100, 20);
        lampe[1].zeigeLampe(100, 200, 30);
    }

    public void lampeSchalterAus(){
        var ausgewaehlteLampe = lampenwahl.ganzZahl();
        lampe[ausgewaehlteLampe-1].loesche();
        System.out.println("wurde ausgeführt");
    }

    public void lampeSchalterEin(){
        var ausgewaehlteLampe = lampenwahl.ganzZahl();
        lampe[ausgewaehlteLampe-1].lampeEin();
    }
}



