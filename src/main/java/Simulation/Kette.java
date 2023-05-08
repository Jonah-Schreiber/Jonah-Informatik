package Simulation;

import basis.Fenster;
import basis.Knopf;
import basis.ZahlenFeld;

public class Kette {
    private Fenster fenster;
    private Knopf kEnde, kSchalterEin, kSchalterAus;
    Lampe lampe[] = new Lampe[10];

    public Kette() {
        fenster = new Fenster("Simulationsumgebung", 1000, 500);
        kEnde = new Knopf("Ende", 30, 450, 200, 20);
        kEnde.setzeKnopfLauscher(knopf -> this.fenster.gibFrei());
        lampe[0] = new Lampe(100, 50, 10);
        lampe[0].zeigeLampe(50, 50, 20);
        rivate Fenster fenster;
        private Knopf kEnde, kSchalterEin, kSchalterAus;
        ZahlenFeld lampenwahl;
        Lampe lampe[] = new Lampe[2];


    public void kette(){

    }
}
