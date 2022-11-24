
import basis.*;

public class Zahlenraten {
    Fenster fenster;
    BeschriftungsFeld titel;
    BeschriftungsFeld ein;
    BeschriftungsFeld erklaerung1, erklaerung2, erklaerung3, erklaerung4, erklaerung5;
    ZahlenFeld eingabe;
    BeschriftungsFeld aus;
    TextFeld kommentar;
    Knopf rateKnopf;
    Knopf neu, schließen;

    int gedachteZahl, ratezahl;


    public Zahlenraten() {
        fenster = new Fenster("Zahlenraten", 1000, 1000);
        titel = new BeschriftungsFeld("Zahlenraten", 45, 30, 150, 30);
        titel.setzeSchriftGroesse(20);
        ein = new BeschriftungsFeld("Welche Zahl ...", 35, 80, 150, 20);
        eingabe = new ZahlenFeld(80, 100, 40, 30);
        eingabe.setzeSchriftGroesse(20);
        eingabe.setzeFokus();
        aus = new BeschriftungsFeld("Bewertung", 70, 150, 100, 20);
        kommentar = new TextFeld(20, 170, 160, 30);
        kommentar.setzeBenutzbar(false);
        erklaerung1 = new BeschriftungsFeld("Zahl erraten! -> Abstand 0", 200, 100, 150, 20);
        erklaerung2 = new BeschriftungsFeld("sehr heiß -> Abstand < 5", 200, 120, 150, 20);
        erklaerung3 = new BeschriftungsFeld("heiß -> Abstand < 20", 200, 140, 150, 20);
        erklaerung4 = new BeschriftungsFeld("warm -> Abstand < 50", 200, 160, 150, 20);
        erklaerung5 = new BeschriftungsFeld("kalt -> Abstand > 50", 200, 180, 150, 20);
        rateKnopf = new Knopf("Raten", 10, 250, 150, 50);
        neu = new Knopf("neues Spiel", 150, 250, 150, 50);
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
            System.out.println("sehr heiß");
            kommentar.setzeText("sehr heiß");

        }
        else if (distance <= 20) {
            System.out.println("heiß");
            kommentar.setzeText("heiß");

        } else if (distance <= 50) {
            System.out.println("warm");
            kommentar.setzeText("warm");
        }
        else {
            System.out.println("kalt");

        }

    }

    private static int getAbstand(int rateZahl, int vergleichsZahl) {

        int zahl = Hilfe.betrag(rateZahl - vergleichsZahl);

        return zahl;
    }
}


