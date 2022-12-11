package Arrays;

import basis.*;

public class TestArray {
    // Elemente
    private Fenster fenster;
    private BeschriftungsFeld anweisung;
    private Knopf neu, ok, ende;
    private TextFeld ausgabe1, eingabe1;

    // Variablen
    private String eingabe, ausgabe;

    //Konstruktor
    public TestArray(){
        //Fenster
        fenster = new Fenster(1000, 1000);
        //Beschriftungsfeld
        anweisung = new BeschriftungsFeld("Namen hier eingeben:", 50, 50 , 300, 50);
        anweisung.setzeSchriftGroesse(30);
        //Knöpfe
        ok = new Knopf("OK", 50, 500, 200, 50);
        ende = new Knopf("Ende", 350, 500, 200, 50);
        
    }
}
