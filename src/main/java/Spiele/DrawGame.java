package Spiele;

import basis.*;

public class DrawGame {
    // direkter Start des Spiels
    public static void main(String[] args) {
        new DrawGame();
    }
    private Fenster fenster;
    private BeschriftungsFeld hoelzerLabel, spielerLabel, entfernenLabel;
    private ZahlenFeld anzahlHoelzer, entfernteHoelzer;
    private TextFeld ergebnis;
    private Knopf entfernen, neuesSpiel, ende;
    //Variablen

    public DrawGame(){
        //Fenster
        fenster = new Fenster("Nimm-Spiel",1000,1000);
        //Beschriftungen
        hoelzerLabel = new BeschriftungsFeld("Aktuelle Anzahl Hölzer auf dem Stapel:");
        spielerLabel = new BeschriftungsFeld("Spieler X ist an der Reihe:");
        entfernenLabel = new BeschriftungsFeld("Anzahl der Hölzer, die entfernt werden soll");
        //Zahlenfelder
        anzahlHoelzer = new ZahlenFeld();
        entfernteHoelzer = new ZahlenFeld();
        //Textfelder
        ergebnis = new TextFeld();
        //Knöpfe
        entfernen = new Knopf();
        neuesSpiel = new Knopf();
        ende = new Knopf();

    }


}
