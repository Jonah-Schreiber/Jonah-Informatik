import basis.*;

import javax.swing.*;

public class Wuerfelspiel {

    //Methode zum direkten Starten des Programms
    public static void main(String[] args) {
        new Wuerfelspiel();
    }

    //Variabeln

    //Fenster Variable entfernt, da nie darauf zugegriffen werden muss

    //Variablen explizit bennenen, um besser darüber nachzudenken

    private Fenster window;
    private BeschriftungsFeld activePlayerLabel;
    private BeschriftungsFeld activeDice;
    private BeschriftungsFeld score1Label;
    private BeschriftungsFeld score2Label;
    private ZahlenFeld diceCount;

    ////Variablen die man fürs Spiel braucht:

    //Ist true, wenn erster Spieler da ist
    boolean player1 = true;
    //vereinfachte Speicherung der gewürfelten Zahlen
    int number1, number2, number3, number4, number5, number6;
    //Speicherung der Punkte
    int score1 = 0, score2 = 0;
    //Speicherung der Würfelanzahl
    int diceNumber;


    public Wuerfelspiel() {
        //Fenster
        window = new Fenster(650, 550);
        //Beschriftungen
        BeschriftungsFeld diceCountLabel = new BeschriftungsFeld("Gib hier ein wie oft du würfeln möchtest:", 50, 50, 350, 50);
        BeschriftungsFeld scoreLabel = new BeschriftungsFeld("Hier werden deine Punkte angezeigt:", 50, 150, 350, 50);
        BeschriftungsFeld activeDiceLabel = new BeschriftungsFeld("Hier werden deine gewürfelten Zahlen angezeigt", 50, 250, 350, 50);
        activePlayerLabel = new BeschriftungsFeld("Spieler 1 ist am Zug", 85, 400, 350, 50);
        //Zahlen neben Beschriftungen
        diceCount = new ZahlenFeld(500, 50, 100, 50);
        score1Label = new BeschriftungsFeld("Spieler-1: 0", 500, 150, 100, 50);
        score2Label = new BeschriftungsFeld("Spieler-2: 0", 500, 175, 100, 50);

        activeDice = new BeschriftungsFeld("", 500, 250, 100, 50);
        //Knöpfe
        Knopf diceButton = new Knopf("Würfeln", 50, 450, 200, 50);
        Knopf resetButton = new Knopf("neues Spiel", 400, 450, 200, 50);
        Knopf playerSwitchButton = new Knopf("Wechsel", 50, 350, 200, 50);
        Knopf endButton = new Knopf("Ende", 400, 350, 200, 50);

        //Knöpfe mit Methoden verbinden
        diceButton.setzeKnopfLauscher(knopf -> rollDice());
        resetButton.setzeKnopfLauscher(knopf -> newGame());
        playerSwitchButton.setzeKnopfLauscher(knopf -> switchPlayer());
        endButton.setzeKnopfLauscher(knopf -> endGame());

    }

    //Methode beim Klicken des Würfelbuttons
    public void rollDice() {
        //Prüfen ob die Zahl zwischen 1 und 6 liegt
        if (diceCount.ganzZahl() > 6 || diceCount.ganzZahl() < 1) {
            JOptionPane.showMessageDialog(null, "Bitte gib eine Zahl zwischen 1 und 6 ein!");
        }
        //Speicherung Würfel Variable
        diceNumber = diceCount.ganzZahl();
        //Setzen der Würfel-Würfe für alle Würfelvariablen
        setNumbers();
        //Prüfen auf 2 gleiche Zahlen
        checkSimilarNumbers();
        //Aktualisieren der Punkte
        refreshScore();
        //Automatische Spielerwechsel
        switchPlayer();

    }
    //Setzen der Scorelabels je nach Variable, die Punktestand enthält
    public void refreshScore() {
        score1Label.setzeText("Spieler-1: " + score1);
        score2Label.setzeText("Spieler-2: " + score2);
    }

    public void checkSimilarNumbers() {
        //Prüfen ob 2 gleiche Zahlen vorhanden sind
        if (number1 == number2) {}
        else if (number2 == number3 || number1 == number3) {
            if (player1) {
                score1 = 2;
            } else {
                score2 = 2;
            }
        }
        else if (number3 == number4 || number2 == number4 || number1 == number4) {
            if (player1) {
                score1 = 3;
            } else {
                score2 = 3;
            }
        }
        else if (number4 == number5 || number3 == number5 || number2 == number5 || number1 == number5) {
            if (player1) {
                score1 = 4;
            } else {
                score2 = 4;
            }
        }
        else if (number5 == number6 || number4 == number6 || number3 == number6 || number2 == number6 || number1 == number6) {
            if (player1) {
                score1 = 5;
            } else {
                score2 = 5;
            }
        }
    }
    //Setzen der Würfel-Würfe für alle Eingaben im Zahlenfeld

    public void setNumbers() {
        switch (diceNumber) {
            case 1 -> {
                number1 = getRandomNumber();
                activeDice.setzeText("" + number1);
            }
            case 2 -> {
                number1 = getRandomNumber();
                number2 = getRandomNumber();
                activeDice.setzeText("" + number1 + ", " + number2);
            }
            case 3 -> {
                number1 = getRandomNumber();
                number2 = getRandomNumber();
                number3 = getRandomNumber();
                activeDice.setzeText("" + number1 + ", " + number2 + ", " + number3);
            }
            case 4 -> {
                number1 = getRandomNumber();
                number2 = getRandomNumber();
                number3 = getRandomNumber();
                number4 = getRandomNumber();
                activeDice.setzeText("" + number1 + ", " + number2 + ", " + number3 + ", " + number4);
            }
            case 5 -> {
                number1 = getRandomNumber();
                number2 = getRandomNumber();
                number3 = getRandomNumber();
                number4 = getRandomNumber();
                number5 = getRandomNumber();
                activeDice.setzeText("" + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5);
            }
            case 6 -> {
                number1 = getRandomNumber();
                number2 = getRandomNumber();
                number3 = getRandomNumber();
                number4 = getRandomNumber();
                number5 = getRandomNumber();
                number6 = getRandomNumber();
                activeDice.setzeText("" + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6);
            }
        }
    }

    //Methode zum Reset des Spiels
    public void newGame() {
        //Setzen der Punkte auf 0
        score1 = 0;
        score2 = 0;
        //Setzen des Spieler auf Spieler 1
        if (!player1) {
            switchPlayer();
        }
        //Leeren der Textfelder
        activeDice.setzeText("");
        refreshScore();
        diceCount.setzeText("");

    }

    //Methode zum Wechseln des Spielers
    public void switchPlayer() {
        //Variable wird umgedreht
        player1 = !player1;
        //Text wird aktualisiert
        if (player1) {
            activePlayerLabel.setzeText("Spieler 1 ist am Zug");
        } else {
            activePlayerLabel.setzeText("Spieler 2 ist am Zug");
        }
    }

    //Würfel-Methode für Zufallszahl
    public int getRandomNumber() {
        return Hilfe.zufall(1, 6);
    }

    //Methode um Fenster zu schließen
    public void endGame() {
        window.gibFrei();
    }


}


