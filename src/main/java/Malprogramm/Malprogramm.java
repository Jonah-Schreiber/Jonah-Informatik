package Malprogramm;

import basis.*;

import javax.swing.*;
import java.awt.*;

public class Malprogramm {

    Fenster fenster;
    IgelStift stift;
    Tastatur tastatur;

    public Malprogramm() {
        fenster = new Fenster("Jonah-Paint", 500, 500);
        stift = new IgelStift();
        stift.setzeLinienBreite(10);
        stift.setzeFarbe(Farbe.CYAN);

        //Setzen des Mauslauschers
        fenster.setzeMausLauscherStandard(this.getMouseListener());

        //Programm schließt bei schließen des Fensters
        fenster.getMeinJFrame().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Setzen des Tastenlauschers
        fenster.setzeTastenLauscher(this.getTastaturListener());

        this.addGui();
    }

    //Rückgabemethode für Mauslauscher
    public MausLauscherStandard getMouseListener() {
        return new MausLauscherStandard() {
            @Override
            public void bearbeiteMausDruck(Object o, int i, int i1) {
                stift.runter();
            }

            @Override
            public void bearbeiteMausDruckRechts(Object o, int i, int i1) {
                stift.normal();
            }

            @Override
            public void bearbeiteMausLos(Object o, int i, int i1) {
                stift.hoch();
            }

            @Override
            public void bearbeiteMausLosRechts(Object o, int i, int i1) {
                stift.normal();
            }

            @Override
            public void bearbeiteMausBewegt(Object o, int i, int i1) {
                stift.bewegeBis(i, i1);
            }

            @Override
            public void bearbeiteMausGezogen(Object o, int i, int i1) {

            }
        };
    }

    public void addGui() {

        JFrame jFrame = new JFrame("Kontrollfenster");
        jFrame.setSize(200, 100);

        JButton leeren = new JButton("löschen");
        leeren.addActionListener(e -> fenster.loescheAlles());

        jFrame.getContentPane().add(leeren);
        jFrame.setLayout(new FlowLayout());

        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
    //Rückgabemethode für Tastenlauscher

    public TastenLauscher getTastaturListener() {
        return new TastenLauscher() {
            @Override
            public void bearbeiteTaste(Komponente komponente, char c) {
                if (c == 'r') {
                    stift.radiere();
                }
            }
        };
    }
}
