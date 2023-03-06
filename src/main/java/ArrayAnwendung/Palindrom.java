package ArrayAnwendung;

import basis.*;

public class Palindrom {


    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Fenster fenster;
    private TextFeld eingabeFeld, ausgabeFeld;
    private Knopf ok, ende;
    private BeschriftungsFeld ueberschrift, textEingabe;

    private int positionImAlpahbet;
    private char aktBuchstabe, neuBuchstabe;
    private String eingabe, Eingabe, abc, text, neuertext, a, b;


    public Palindrom() {
        // Instanzvariable initialisieren
        fenster = new Fenster(500, 150);

        ueberschrift = new BeschriftungsFeld("Hier den Text eingeben", 10, 10, 200, 10);
        textEingabe = new BeschriftungsFeld("Hier steht das Palindrom", 220, 10, 200, 20);

        ok = new Knopf("OK", 10, 60, 150, 20);
        //ok.setzeKnopfLauscher(this);
        ende = new Knopf("Ende", 10, 120, 150, 20);

        eingabeFeld = new TextFeld(10, 30, 200, 20);
        ausgabeFeld = new TextFeld(220, 30, 200, 20);

        abc = "abcdefghijklmnopqrstuvwxyz";
        text = "";
        neuertext = "";


    }


    public void main() {
        while (!ende.wurdeGedrueckt()) {
            Hilfe.kurzePause();
            this.start();

        }
        fenster.gibFrei();
    }

    public void start() {
        if (ok.wurdeGedrueckt()) {
            //System.out.println("test");
            String a = "eingabe";
            String b = "Eingabe";
            if (a.equals(b)) {
                //int length(a)==
                System.out.println("sind gleich (Großschreibung berücksichtigt)");
            } //Ergebnis false

            if (a.equalsIgnoreCase(b)) {
                System.out.println("sind gleich (Großschreibung nicht berücksichtigt)");
            } //ergebnis True


        }


    }

    }


