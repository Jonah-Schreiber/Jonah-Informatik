package ArrayAnwendung;

import basis.BeschriftungsFeld;
import basis.Fenster;
import basis.Knopf;
import basis.TextFeld;

public class Palindrom {


    private Fenster fenster;
    private TextFeld eingabe, ausgabe;
    private Knopf pruefen;
    private BeschriftungsFeld ergebnis;

    private String eingabeText, ausgabeText;


    public Palindrom() {
        fenster = new Fenster((500, 500);
        eingabe = new TextFeld(50, 50, 400, 30);
        ausgabe = new TextFeld(50, 100, 400, 30);
        pruefen = new Knopf("Prüfen", 50, 150, 100, 40);
        ergebnis = new BeschriftungsFeld("Der Text ist ein Palindrom:", 50, 200, 300, 30);
        pruefen.setzeKnopfLauscher(knopf -> this.pruefeEingabe());
    }

    public void pruefeEingabe() {
        ausgabeText = "";
        eingabeText = eingabe.text();
        //System.out.println(eingabeText);
        //System.out.println(eingabeText.length());
        for (int i = eingabeText.length() - 1; i >= 0; i--) ;
        {
            ausgabeText += String.valueOf(eingabeText.charAt(i));
        }
        //System.out.println(ausgabeText);
        ausgabe.setzeText(ausgabeText);
        if (eingabeText.equalsIgnoreCase(ausgabeText)) {
            ergebnis.setzeText("Der Text ist ein Palindrom: Ja");
        } else {
            ergebnis.setzeText("Der Text ist ein Palindrom: Nein");
        }
    }


}



