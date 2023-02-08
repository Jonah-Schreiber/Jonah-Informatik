package ArrayAnwendung;

import basis.*;

public class Verschluesselung implements KnopfLauscher {
    private Fenster fenster;
    private BeschriftungsFeld ueberSchriftEing, ueberSchriftAusg;
    private TextFeld eingabeFeld, ausgabeFeld;
    private Knopf code, decode;
    private String eingabe, ausgabe, abc, codierterText, decodierterText;
    private char aktuellerBuchstabe, neuerBuchstabe;
    private int key, positionImAlphabet, neuePositionImAlphabet;

    public Verschluesselung() {
        fenster = new Fenster(500, 150);

        ueberSchriftEing = new BeschriftungsFeld("Hier den Text eingeben", 10, 10, 200, 10);
        eingabeFeld = new TextFeld(10, 30, 200, 20);

        ueberSchriftAusg = new BeschriftungsFeld("Hier steht der verschlüsselte Text", 220, 10, 300, 10);
        ausgabeFeld = new TextFeld(220, 30, 200, 20);

        code = new Knopf("Verschlüsseln", 10, 60, 150, 20);
        code.setzeKnopfLauscher(this);

        decode = new Knopf("Entschlüsseln", 220, 60, 150, 20);
        decode.setzeKnopfLauscher(this);
        this.main();

        abc = "abcdefghijklmnopqrstuvwxyz";
        key = 3;
        codierterText = "";
        decodierterText = "";

    }

    public void main() {

    }

    public void verschluesseln() {
        for (int i = 0; i < eingabe.length(); i++) {
            aktuellerBuchstabe = eingabe.charAt(i);
            positionImAlphabet = abc.indexOf(aktuellerBuchstabe);
            neuePositionImAlphabet = positionImAlphabet + key;
            neuerBuchstabe = abc.charAt(neuePositionImAlphabet);
            codierterText = codierterText + neuerBuchstabe;

        }
        ausgabeFeld.setzeText(codierterText);
        eingabeFeld.setzeText("");
    }

    public void entschluesseln() {
        for (int i = 0; i < eingabe.length(); i++) {
            aktuellerBuchstabe = ausgabe.charAt(i);
            positionImAlphabet = abc.indexOf(aktuellerBuchstabe);
            neuePositionImAlphabet = positionImAlphabet - key;
            neuerBuchstabe = abc.charAt(neuePositionImAlphabet);
            decodierterText = decodierterText + neuerBuchstabe;

        }
        ausgabeFeld.setzeText("");
        eingabeFeld.setzeText(decodierterText);
    }


    @Override
    public void bearbeiteKnopfDruck(Knopf k) {
        if (k == code) {
            codierterText = "";
            eingabe = eingabeFeld.text();
            this.verschluesseln();
        }

        if (k == decode) {
            decodierterText = "";
            ausgabe = ausgabeFeld.text();
            this.entschluesseln();
        }
    }
}
