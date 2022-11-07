
import basis.*;

public class Zahlenraten {
    Fenster fenster;
    BeschriftungsFeld titel;
    BeschriftungsFeld ein;
    ZahlenFeld eingabe;
    BeschriftungsFeld aus;
    TextFeld kommentar;
    Knopf rateKnopf;
    Knopf neu;

    int gedachteZahl, ratezahl;


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
        rateKnopf = new Knopf("Raten", 10, 250, 150, 20);
        neu = new Knopf("Start", 160, 250, 150, 20);
        gedachteZahl = Hilfe.zufall(0, 100);
        ratezahl = 0;
        System.out.println("Zufallszahl ist" + gedachteZahl);

        rateKnopf.setzeKnopfLauscher(new KnopfLauscher() {
            @Override
            public void bearbeiteKnopfDruck(Knopf knopf) {
                raten();
            }
        });

        neu.setzeKnopfLauscher(new KnopfLauscher() {
            @Override
            public void bearbeiteKnopfDruck(Knopf knopf) {
                gedachteZahl = Hilfe.zufall(0, 100);
                kommentar.setzeText("Neue Zahl generiert!");
            }
        });

    }


    private void raten() {

        int distance = getAbstand(eingabe.ganzZahl(), gedachteZahl);

        System.out.println(distance);

        if (distance == 0) {
            System.out.println("Zahl erraten!");
            kommentar.setzeText("Zahl erraten!");

        }
        else if (distance <= 5) {
            System.out.println("heiß!");
            kommentar.setzeText("heiß");

        }
        else {
            System.out.println("kalt du sau!");

        }

    }

    private static int getAbstand(int rateZahl, int vergleichsZahl) {

        int zahl = Hilfe.betrag(rateZahl - vergleichsZahl);

        return zahl;
    }
}


