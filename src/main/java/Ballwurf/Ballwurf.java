package Ballwurf;

import basis.Bild;
import basis.Farbe;
import basis.Fenster;
import basis.Hilfe;

import java.io.IOException;

public class Ballwurf {
    //Deklaration
    private Fenster f;
    private Bild werfer1, werfer2, ball;

    public Ballwurf() throws IOException {
        //Erzeugen
        f = new Fenster("Ballwurf", 500, 300);
        f.setzeHintergrundFarbe(Farbe.WEISS);
        werfer1 = new Bild(new java.io.File("./repo/de/Bilder/Besbol Gif (19).gif").getCanonicalPath());
        werfer1.setzePosition(10, 100);
        werfer2 = new Bild(new java.io.File("./repo/de/Bilder/Besbol Gif (21).gif").getCanonicalPath());
        werfer2.setzePosition(400, 100);
        ball = new Bild(new java.io.File("./repo/de/Bilder/Besbol Gif (5).gif").getCanonicalPath());
        ball.setzePosition(48, 95);

        this.fuehreAus();
    }

    public void fuehreAus() {

        while (true) {
            this.wurfNachRechts();
            Hilfe.warte(100);
            this.wurfNachLinks();
            Hilfe.warte(100);
        }

    }

    public void wurfNachRechts() {

        while (ball.hPosition() < 420) {
            ball.setzePosition(ball.hPosition() + 0.001, ball.vPosition());
        }

    }

    public void wurfNachLinks() {

        while (ball.hPosition() > 48) {
            ball.setzePosition(ball.hPosition() - 0.001, ball.vPosition());
        }

    }
}
