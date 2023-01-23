package ArrayAnwendung;

import basis.Fenster;
import basis.Hilfe;
import basis.Stift;

public class Sortieren1 {

    // Klasse direkt hier ausführbar machen
    public static void main(String[] args) {
        Sortieren1 sortieren1 = new Sortieren1();
    }

    // Elemente
    Fenster fenster;
    Stift pencil;

    // Variablen
    int[] intArr = new int[100];

    public Sortieren1() {
        //Fenster
        fenster = new Fenster("Arrays", 500, 500);
        pencil = new Stift();

        //Initialisierung des Arrays in den Konstruktor verschoben
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Hilfe.zufall(0, 100);
        }

        //Methode zum Zeichen des Arrays
        this.drawArray();

        Hilfe.pause(50);


        //Starten der Sortiermethode
        //this.bubblesort();
        this.selectionSort();
    }


    // Bubblesort Methode
    public void bubblesort() {

        for (int i = 0; i < intArr.length; i++) {
            //Bsp. die erste Zahl im Array ist 5

            //Vergleich der ersten Zahl im Array mit jeder anderen Zahl - Durchschieben der Zahl bis irgendwas größer ist
            for (int j = 0; j < intArr.length; j++) {

                //Vergleich zwischen Zahlen
                if (intArr[i] < intArr[j]) {
                    //Tausch wenn größer/kleiner
                    swap(i, j);
                }
            }

            this.drawArray();
            Hilfe.pause(100);
        }

    }

    // Selectionsort Methode
    public void selectionSort() {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    swap(i, j);
                }
            }
        }
        //For-I Schleife
        this.drawArray();
        Hilfe.pause(100);
        //Immer am Ende der Schleife -> drawArray() & Hilfe.pause
    }


    // Tausch Methode
    public void swap(int i, int i1) {
        int temp = intArr[i];
        intArr[i] = intArr[i1];
        intArr[i1] = temp;
    }

    // Zeichnen Methode
    public void drawArray() {
        fenster.loescheAlles();
        for (int i = 0; i < intArr.length; i++) {
            pencil.bewegeBis(20 + i * 3, 200);
            pencil.runter();
            pencil.zeichneRechteck(2, intArr[i]);
            pencil.hoch();
        }
    }

}
