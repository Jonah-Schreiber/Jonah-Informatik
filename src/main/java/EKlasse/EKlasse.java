package EKlasse;

import basis.Fenster;
import basis.IgelStift;

public class EKlasse {
    //Deklaration
    private Fenster fenster1;
    private IgelStift meinStift;

    public EKlasse() {
        //Erzeugen
        fenster1 = new Fenster(900, 900);
        meinStift = new IgelStift();

        this.zeichneAlles();
    }

    public void zeichneAlles() {
        this.zeichneBaum(100, 100);
        this.zeichneHaus(200, 100);
        this.zeichneE(300, 300);
        this.zeichneE(400, 400);
        this.zeichneBaum(500, 500);
        this.zeichneHaus(600, 600);
    }

    public void zeichneBaum(int x, int y) {
        //Benutzen und Abbauen
        meinStift.bewegeBis(x, y);
        meinStift.runter();
        meinStift.dreheUm(315);
        meinStift.bewegeUm(75);
        meinStift.dreheUm(225);
        meinStift.bewegeUm(40);
        meinStift.dreheUm(135);
        meinStift.bewegeUm(75);
        meinStift.dreheUm(225);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(90);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(35);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(90);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(225);
        meinStift.bewegeUm(75);
        meinStift.dreheUm(135);
        meinStift.bewegeUm(40);
        meinStift.dreheUm(225);
        meinStift.bewegeUm(75);
        meinStift.hoch();
        meinStift.dreheBis(0);
        meinStift.bewegeBis(0, 0);
    }

    public void zeichneE(int x, int y) {
        //Benutzen und Abbauen
        meinStift.bewegeBis(x, y);
        meinStift.runter();
        meinStift.bewegeUm(100);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(100);
        meinStift.dreheUm(90);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(90);
        meinStift.bewegeUm(100);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(100);
        meinStift.dreheUm(90);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(90);
        meinStift.bewegeUm(100);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(50);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(150);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(250);
        meinStift.dreheUm(270);
        meinStift.bewegeUm(50);
        meinStift.hoch();
        meinStift.dreheBis(0);
        meinStift.bewegeBis(0, 0);
    }

    public void zeichneHaus(int x, int y) {
        //Benutzen und Abbauen
        meinStift.bewegeBis(x, y);
        meinStift.runter();
        for (int i = 0; i < 3; i++) {
            meinStift.bewegeUm(75);
            meinStift.dreheUm(90);
        }
        meinStift.bewegeUm(75);
        meinStift.dreheUm(135);
        meinStift.bewegeUm(106);
        for (int i = 0; i < 2; i++) {
            meinStift.dreheUm(90);
            meinStift.bewegeUm(53);
        }
        meinStift.dreheUm(90);
        meinStift.bewegeUm(106);
        meinStift.hoch();
        meinStift.dreheBis(0);
        meinStift.bewegeBis(0, 0);
    }
}
