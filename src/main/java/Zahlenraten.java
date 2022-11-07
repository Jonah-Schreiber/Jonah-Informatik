
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

    int gedachteZahl;


    public Zahlenraten() {
        fenster = new Fenster("Zahlenraten", 500, 500);
        titel = new BeschriftungsFeld("Zahlenraten", 45, 30, 150, 30);
        titel.setzeSchriftGroesse(20);
        ein = new BeschriftungsFeld("Welche Zahl ...", 35, 80, 150, 20);
        eingabe = new ZahlenFeld(80, 100, 40, 30);
        eingabe.setzeSchriftGroesse(20);
        eingabe.setzeFokus();
        aus = new BeschriftungsFeld("Bewertung", 70, 150, 100, 20);
        kommentar = new TextFeld(20, 170, 160, 30);
        kommentar.setzeBenutzbar(false);
        ende = new Knopf("Raten", 10, 250, 150, 20);
        neu = new Knopf("Start", 160, 250, 150, 20);
        gedachteZahl = Hilfe.zufall(1, 100);
        int rateZahl = 0;


    }

    private void raten() {

        int distance = getAbstand(eingabe.ganzZahl(), gedachteZahl);
        /*
        if distance == 0 {
            System.out.println("Zahl erraten");
        }
        //if-Abfragen ob Abstand groß oder klein oder mittel ist
        */

    }

    private static int getAbstand(int rateZahl, int vergleichsZahl) {

        int distance = 0;


        return distance;
    }
}


