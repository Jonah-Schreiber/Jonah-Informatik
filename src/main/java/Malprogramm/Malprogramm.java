package Malprogramm;

import basis.*;

import javax.swing.*;
import java.awt.*;

public class Malprogramm {

    Fenster fenster;
    IgelStift stift;



    public Malprogramm() {
        fenster = new Fenster("Jonah-Paint", 500, 500);
        stift = new IgelStift();
        stift.setzeLinienBreite(10);
        stift.setzeFarbe(Farbe.BLAU);

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
                stift.hoch();
            }

            @Override
            public void bearbeiteMausLos(Object o, int i, int i1) {
                stift.hoch();
            }

            @Override
            public void bearbeiteMausLosRechts(Object o, int i, int i1) {
                stift.normal();
                stift.hoch();
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

        String[] colorSelection = {"blau", "grün", "schwarz", "gelb"};
        JComboBox colorBox = new JComboBox<>(colorSelection);

        colorBox.addActionListener(e -> {

            switch (colorBox.getSelectedItem().toString()) {

                case "blau": {            stift.setzeFarbe(Farbe.BLAU);
                    break;
                }
                case "grün": {            stift.setzeFarbe(Farbe.GRÜN);
                    break;

                }
                case "schwarz": {            stift.setzeFarbe(Farbe.SCHWARZ);
                    break;

                }
                case "gelb": {            stift.setzeFarbe(Farbe.GELB);
                    break;

                }


            }

        });

        jFrame.getContentPane().add(colorBox);


        jFrame.setLayout(new FlowLayout());

        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    //Rückgabemethode für Tastenlauscher
    //Änderung Radierer
    public TastenLauscher getTastaturListener() {
        return new TastenLauscher() {
            @Override
            public void bearbeiteTaste(Komponente komponente, char c) {

                switch (c) {
                    case ('r'):
                        stift.radiere();
                        break;
                    case ('+'):
                        stift.setzeLinienBreite(stift.linienBreite() + 5);
                        break;
                    case ('-'):
                        if (stift.linienBreite() == 5) {return;}
                        stift.setzeLinienBreite(stift.linienBreite() - 5);
                        break;
                    case('b'):
                        zeichneBaum((int) stift.hPosition(), (int) stift.vPosition());
                        break;
                    case ('h'):
                        zeichneHaus((int) stift.hPosition(), (int) stift.vPosition());
                        break;
                    case ('e'):
                        zeichneE((int) stift.hPosition(), (int) stift.vPosition());
                        break;

                }
            }

        };
    }


    // Baum
    public void zeichneBaum(int x, int y) {
        //Benutzen und Abbauen
        stift.bewegeBis(x, y);
        stift.runter();
        stift.dreheUm(315);
        stift.bewegeUm(75);
        stift.dreheUm(225);
        stift.bewegeUm(40);
        stift.dreheUm(135);
        stift.bewegeUm(75);
        stift.dreheUm(225);
        stift.bewegeUm(50);
        stift.dreheUm(90);
        stift.bewegeUm(50);
        stift.dreheUm(270);
        stift.bewegeUm(35);
        stift.dreheUm(270);
        stift.bewegeUm(50);
        stift.dreheUm(90);
        stift.bewegeUm(50);
        stift.dreheUm(225);
        stift.bewegeUm(75);
        stift.dreheUm(135);
        stift.bewegeUm(40);
        stift.dreheUm(225);
        stift.bewegeUm(75);
        stift.hoch();
        stift.dreheBis(0);
        stift.bewegeBis(0, 0);
    }

    //Haus
    public void zeichneHaus(int x, int y) {
        //Benutzen und Abbauen
        stift.bewegeBis(x, y);
        stift.runter();
        for (int i = 0; i < 3; i++) {
            stift.bewegeUm(75);
            stift.dreheUm(90);
        }
        stift.bewegeUm(75);
        stift.dreheUm(135);
        stift.bewegeUm(106);
        for (int i = 0; i < 2; i++) {
            stift.dreheUm(90);
            stift.bewegeUm(53);
        }
        stift.dreheUm(90);
        stift.bewegeUm(106);
        stift.hoch();
        stift.dreheBis(0);
        stift.bewegeBis(0, 0);
    }

    //Buchstabe
    public void zeichneE(int x, int y) {
        //Benutzen und Abbauen
        stift.bewegeBis(x, y);
        stift.runter();
        stift.bewegeUm(100);
        stift.dreheUm(270);
        stift.bewegeUm(50);
        stift.dreheUm(270);
        stift.bewegeUm(100);
        stift.dreheUm(90);
        stift.bewegeUm(50);
        stift.dreheUm(90);
        stift.bewegeUm(100);
        stift.dreheUm(270);
        stift.bewegeUm(50);
        stift.dreheUm(270);
        stift.bewegeUm(100);
        stift.dreheUm(90);
        stift.bewegeUm(50);
        stift.dreheUm(90);
        stift.bewegeUm(100);
        stift.dreheUm(270);
        stift.bewegeUm(50);
        stift.dreheUm(270);
        stift.bewegeUm(150);
        stift.dreheUm(270);
        stift.bewegeUm(250);
        stift.dreheUm(270);
        stift.bewegeUm(50);
        stift.hoch();
        stift.dreheBis(0);
        stift.bewegeBis(0, 0);
    }

}
