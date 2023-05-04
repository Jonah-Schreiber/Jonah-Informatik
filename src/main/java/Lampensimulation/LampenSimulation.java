package Lampensimulation;

import basis.Fenster;

public class LampenSimulation {
    private Fenster fenster;
    private Lampe lampe1;


    Fenster window = new Fenster(900, 500);

    public LampenSimulation() {
        Lampe lampe = new Lampe(500, 200, 25);
    }
}
