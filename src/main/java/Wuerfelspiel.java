import basis.*;
public class Wuerfelspiel {
    private Fenster f;
    private BeschriftungsFeld b1, b2, b3;
    private ZahlenFeld z1, z2, z3;
    private Knopf k1, k2, k3, k4;

    private int zahl1, zahl2, zahl3;
    private int punktzahl;
    private int anzahl;

public Wuerfelspiel(){
    f = new Fenster(1000, 1000);
    b1 = new BeschriftungsFeld("Gib hier ein wie oft du würfeln möchtest:", 10, 50, 350,50);
    b2 = new BeschriftungsFeld("Hier werden deine Punkte angezeigt:", 10, 150, 350, 50);
    b3 = new BeschriftungsFeld("Hier werden deine gewürfelten Zahlen angezeigt", 10, 250, 350, 50);
    z1 = new ZahlenFeld(450, 50, 100, 50);
    z2 = new ZahlenFeld(450, 150, 100, 50);
    z3 = new ZahlenFeld(450, 250, 100, 50);
    k1 = new Knopf("Würfeln", 10, 750, 200, 50);
    k2 = new Knopf("Ende", 750, 750, 200, 50);
    k3 = new Knopf("Wechsel", 250, 750, 200 , 50);
    k4 = new Knopf("neues Spiel", 500, 750, 200, 50);
    anzahl = 0;
    punktzahl = 0;
}
public void fuehreAus(){
anzahl = z1.ganzZahl();
if(anzahl > 0);
}
public void wuerfeln(){

zahl1 = Hilfe.zufall (1,6);
zahl2 = Hilfe.zufall(1,6);
zahl3 = Hilfe.zufall(1, 6);
}
public void ende(){
    if (k2.wurdeGedrueckt());
}
}
