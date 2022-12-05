package Spiele;

import basis.*;

public class DrawGame {
    // direkter Start des Spiels
    public static void main(String[] args) {
        new DrawGame();
    }
    private Fenster fenster;
    private BeschriftungsFeld hoelzerLabel, spielerLabel, entfernenLabel;
    private ZahlenFeld anzahlHoelzer, entfernteHoelzer, spieler;
    private TextFeld ergebnis;
    private Knopf entfernen, neuesSpiel, ende;
    //Variablen

    public DrawGame(){
        //Fenster
        fenster = new Fenster("Nimm-Spiel",1000,1000);
        //Beschriftungen
        hoelzerLabel = new BeschriftungsFeld("Aktuelle Anzahl Hölzer auf dem Stapel:", 50, 50, 300, 20);
        spielerLabel = new BeschriftungsFeld("Spieler X ist an der Reihe:", 50, 100, 300, 20);
        entfernenLabel = new BeschriftungsFeld("Anzahl der Hölzer, die entfernt werden soll (1-3):", 50, 150, 300, 20);
        //Zahlenfelder
        anzahlHoelzer = new ZahlenFeld(350, 50, 150, 20);
        entfernteHoelzer = new ZahlenFeld(350, 150, 150, 20);
        spieler = new ZahlenFeld(350, 100 , 150, 20);
        //Textfelder
        ergebnis = new TextFeld(350, 200, 300, 20);
        //Knöpfe
        entfernen = new Knopf("entfernen", 10, 250, 150, 50);
        neuesSpiel = new Knopf("neues Spiel", 180, 250, 150, 50);
        ende = new Knopf("Ende", 350, 250, 150, 50);
    }


}
