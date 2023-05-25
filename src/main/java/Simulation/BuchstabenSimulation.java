package Simulation;


import basis.Fenster;
import basis.Hilfe;

public class BuchstabenSimulation {
    public static void main(String[] args) {
        new BuchstabenSimulation();
    }

    Fenster fenster = new Fenster(800, 800);
    Lampe lampe[][] = new Lampe[11][11];

    public BuchstabenSimulation() {
        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++) {
                lampe[x][y] = new Lampe (35 + x * 70, 35 + y * 70);
            }
        }

        while (true) {
            for (int i = 0; i < 9; i++) {
                buchstabeHAn(i, 2);
                Hilfe.pause(1000);
                buchstabeHAus(i, 2);
                Hilfe.pause(10);
            }
        }

    }

    public void buchstabeHAn(int x, int y) {
        lampe[x][y].lampeEin();
        lampe[x][y + 1].lampeEin();
        lampe[x][y + 2].lampeEin();
        lampe[x][y + 3].lampeEin();
        lampe[x][y + 4].lampeEin();
        lampe[x + 1][y + 2].lampeEin();
        lampe[x + 2][y].lampeEin();
        lampe[x + 2][y + 1].lampeEin();
        lampe[x + 2][y + 2].lampeEin();
        lampe[x + 2][y + 3].lampeEin();
        lampe[x + 2][y + 4].lampeEin();
    }

    public void buchstabeHAus(int x, int y) {
        lampe[x][y].lampeAus();
        lampe[x][y + 1].lampeAus();
        lampe[x][y + 2].lampeAus();
        lampe[x][y + 3].lampeAus();
        lampe[x][y + 4].lampeAus();
        lampe[x + 1][y + 2].lampeAus();
        lampe[x + 2][y].lampeAus();
        lampe[x + 2][y + 1].lampeAus();
        lampe[x + 2][y + 2].lampeAus();
        lampe[x + 2][y + 3].lampeAus();
        lampe[x + 2][y + 4].lampeAus();
    }


}
