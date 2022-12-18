package Arrays;

import basis.BeschriftungsFeld;
import basis.Fenster;
import basis.Knopf;
import basis.ZahlenFeld;

import javax.swing.*;
import java.util.Arrays;

public class TestArray {
    public Fenster fenster;
    public String[] tiere;
    public BeschriftungsFeld b1, b2;
    public Knopf ok;

    public ZahlenFeld eingabeAnzahl;

    public TestArray() {
        // Fenster
        fenster = new Fenster("Arrays", 500, 500);
        //Beschriftungsfeld
        b1 = new BeschriftungsFeld("", 100, 100, 300, 20);
        b2 = new BeschriftungsFeld("Wie viel Tiere möchten Sie eingeben?:", 100, 250, 300, 20);
        //Zahlenfeld
        eingabeAnzahl = new ZahlenFeld(100, 300, 100, 50);
        //eingabeTiere.setzeTextFeldLauscher();
        //Knopf
        ok = new Knopf("OK", 100, 350, 100, 50);
        ok.setzeKnopfLauscher(knopf -> eingabeTiere());

    }

    public void fuehreAus() {
        tiere = new String[3];

        tiere[0] = "Hund";
        tiere[1] = "Katze";
        tiere[2] = "Maus";
        System.out.println(tiere[0] + ", " + tiere[1] + ", " + tiere[2]);
        b1.setzeText(tiere[0] + ", " + tiere[1] + ", " + tiere[2]);
    }

    public void eingabeTiere() {

        tiere = new String[eingabeAnzahl.ganzZahl()];
        for (int i = 0; i < eingabeAnzahl.ganzZahl(); i++) {
            tiere[i] = JOptionPane.showInputDialog("Wähle Tier Nr." + (i + 1));
            b1.setzeText(Arrays.toString(tiere));
        }

        //b1.setzeText(tiere[0] + ", " + tiere[1] + ", " + tiere[2]);
    }
}


