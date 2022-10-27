
import basis.*;

public class Zahlenraten {
    Fenster fenster;
    BeschriftungsFeld titel;
    BeschriftungsFeld ein;
    ZahlenFeld eingabe;
    BeschriftungsFeld aus;
    TextFeld kommentar;
    Knopf ende;
    Knopf neu;


    public Zahlenraten() {
        fenster = new Fenster("Zahlenraten", 500, 500);
        titel = new BeschriftungsFeld("Zahlenraten", 45, 30, 110, 30);
        titel.setzeSchriftGroesse(20);
        ein = new BeschriftungsFeld("Welche Zahl ...", 35, 80, 130, 20);
        eingabe = new ZahlenFeld(80, 100, 40, 30);
        eingabe.setzeSchriftGroesse(20);
        eingabe.setzeFokus();
        aus = new BeschriftungsFeld("Bewertung", 70, 150, 60, 20);
        kommentar = new TextFeld(20, 170, 160, 30);
        kommentar.setzeBenutzbar(false);
        ende = new Knopf("Ende", 10, 250, 50, 20);
        neu = new Knopf("Neu", 140, 250, 50, 20);
        gedachteZahl = Hilfe.zufall(1, 99);
        rateZahl = 0;


    }

    private int gedachteZahl

    {


    }

    private int rateZahl

    {

    }
}


