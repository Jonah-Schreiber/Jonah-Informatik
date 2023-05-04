package Simulation;


import basis.Fenster;
import basis.Hilfe;
import basis.Knopf;
import basis.Maus;

public class Simulationsumgebung {
    private Fenster fenster;
    private Knopf kEnde, kSchalterEin, kSchalterAus;
    private Lampe lampe1, lampe2;
    private Maus maus;

    public Simulationsumgebung(){
        fenster = new Fenster("Lichtertümpel",500,500);
        maus = new Maus();
        kEnde = new Knopf("Ende",420,450,50,20);
        kSchalterEin = new Knopf("SchalterEin", 30,450,50,20);
        kSchalterAus = new Knopf("SchalterAus", )
        lampe1 = new Lampe(100, 50, 10);
        lampe2 = new Lampe(150, 100, 20);
    }
    public void fuehreAus(){
        while (! kEnde.wurdeGedrueckt()) {
            if (lampe1.zeigeLampe(maus.hPosition(), maus.vPosition()); {
                lampe1.setztePosition(Hilfe.zufall(100,200),Hilfe.zufall(100,200));
            }
            //if (lampe2.zeigeLampe(maus.hPosition(), maus.vPosition())) {
                //lampe2.blinke();
            }
            if (kSchalterEin.wurdeGedrueckt()) {
                lampe1.lampeEin();
                lampe2.lampeEin();
            }
        }
        fenster.gibFrei();
    }

    }

