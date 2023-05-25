package Bankprogramm;

public class Bankkonto {
    private String kontonummer;
    private String inhaber;
    private double kontostand;

    public Bankkonto(String kontonummer, String inhaber, double anfangsKontostand) {
        this.kontonummer = kontonummer;
        this.inhaber = inhaber;
        this.kontostand = anfangsKontostand;
    }


    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public void abheben(double betrag) {
        if (betrag <= kontostand) {
            kontostand -= betrag;
        } else {
            System.out.println("Nicht genügend Geld auf dem Konto");
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public String getInhaber() {
        return inhaber;
    }

    public static void main(String[] args) {
        Bankkonto konto = new Bankkonto("123456789", "Max Mustermann", 1000.0);
        System.out.println("Kontonummer: " + konto.getKontonummer());
        System.out.println("Inhaber: " + konto.getInhaber());
        System.out.println("Kontostand: " + konto.getKontostand());

        konto.einzahlen(500.0);
        System.out.println("Neuer Kontostand nach Einzahlung: " + konto.getKontostand());

        konto.abheben(200.0);
        System.out.println("Neuer Kontostand nach Abhebung: " + konto.getKontostand());

        konto.abheben(2000.0); // Versuch, mehr Geld abzuheben als vorhanden
    }
}

