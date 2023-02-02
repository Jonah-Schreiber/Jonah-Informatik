package ArrayAnwendung;

import basis.BeschriftungsFeld;
import basis.Fenster;
import basis.Knopf;
import basis.TextFeld;

public class Verschlüsselung {


    private Fenster fenster;
    private BeschriftungsFeld ueberSchriftEing, ueberSchriftAusg;
    private TextFeld eingabeFeld, ausgabeFeld;
    private Knopf code, decode;
    private String eingabe, ausgabe, abc, codierterText, decodierterText;
    private char aktuellerBuchstabe, neuerBuchstabe;
    private int key, positionImAlphabet, neuePositionImAlphabet;

    public Verschlüsselung() {
        fenster = new Fenster(500, 150);

        ueberSchriftEing = new BeschriftungsFeld("Hier den Text eingeben", 10, 10, 200, 10);
        eingabeFeld = new TextFeld(10, 30, 200, 20);

        ueberSchriftAusg = new BeschriftungsFeld("Hier steht der verschlüsselte Text", 220, 10, 300, 10);
        ausgabeFeld = new TextFeld(220, 30, 200, 20);

        code = new Knopf("Verschlüsseln", 10, 60, 150, 20);

        decode = new Knopf("Entschlüsseln", 220, 60, 150, 20);


        abc = "abcdefghijklmnopqrstuvwxyz";
        key = 3;
        codierterText = "";
        decodierterText = "";

    }


        public static void main (String[]args){
            String plaintext = "Guten Tag!";
            int key = 3;

            String ciphertext = code(plaintext, key);
            System.out.println("Klartext: " + plaintext + " ---> " + ciphertext);

            String decoded = decode(ciphertext, key);
            System.out.println("Geheimtext: " + ciphertext + " ---> " + decoded);
        }



// Klartext mit dem Schlüssel verschlüsseln
        public static String code (String plaintext,int key){
            String ciphertext = "";
            plaintext = plaintext.toLowerCase(); //Alles in Kleinbuchstaben umwandeln
            for (int i = 0; i < plaintext.length(); i++) {
                //Buchstaben verschieben und an Geheimtext haengen
                char next = plaintext.charAt(i);
                ciphertext = ciphertext + shift(next, key);
            }
            return ciphertext;
        }
// Verschiebt den Buchstaben um die angegebene Verschiebung (key)
        public static char shift ( char letter, int shift){
            //Buchstaben als Zahl behandeln
            if (letter >= 'a' && letter <= 'z') { //Sonderzeichen nicht veraendern
                letter += shift;
                while (letter > 'z') {
                    letter -= 26;
                }
            }
            return letter;
        }



        // Entschlüsselt den Geheimtext mit dem angegebenen Schlüssel
        public static String decode (String ciphertext,int key){
            String decoded = "";
            ciphertext = ciphertext.toLowerCase(); //Alles in Kleinbuchstaben umwandeln
            for (int i = 0; i < ciphertext.length(); i++) {
                //Jeden Buchstaben verschieben und zwar um (26-Schluessel(key)) Stellen
                //und an entschluesselten Text anhaengen
                char next = ciphertext.charAt(i);
                decoded = decoded + shift(next, 26 - key);
            }
            return decoded;
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










