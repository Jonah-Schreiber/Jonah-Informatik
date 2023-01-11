package ArrayAnwendung;
import basis.*;

public class Sortieren1 {

        //Code um Klasse direkt hier ausführbar zu machen
        public static void main(String[] args) {
            Sortieren1 sort = new Sortieren1();
        }

        //Variablen
        Fenster fenster;
        Stift pencil;
        int[] intArr = new int[100];

        public Sortieren1() {
            //Anzeige Fenster
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

            this.insertionsort();
            //this.selectionSort
        }


        //Die Methode hast du aus dem Internet, oder?
        public void bubblesort() {

            for (int i = 0; i < intArr.length ; i++) {
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

        public void selectionSort() {
            for (int i = 0; i < intArr.length; i++) {
                for (int j = i + 1; j < intArr.length; j++) {
                    if (intArr[i] > intArr[j]){
                        swap(i,j);
                    }
                }
            }
            //For-I Schleife
            //-- Sortiermethoden-Dings
            this.drawArray();
            Hilfe.pause(100);
            //Immer am Ende der Schleife -> drawArray() & Hilfe.pause
        }
        public static int [] insertionsort(int[] intArr) {
            int [] sorted = insertionsort(intArr);
            int copy;
            for (int i = 1; i < intArr.length; i++) {
                copy = sorted [i] ;
                int j = i;
                while (j > 0 && sorted [j - 1] > copy) {
                    sorted [j] = sorted[ j - 1];
                    j--;
                }
                sorted [j] = copy;
            }
            return  sorted;
        }

        public void swap(int i, int i1) {
            int temp = intArr[i];
            intArr[i] = intArr[i1];
            intArr[i1] = temp;
        }

        //Überlege dir hier einmal eine Methode, um das Array zeichnen zu lassen
        public void drawArray() {
            fenster.loescheAlles();
            for (int i = 0; i < intArr.length; i++) {
                pencil.bewegeBis(20 + i * 3, 200);
                pencil.runter();
                pencil.zeichneRechteck(2,intArr[i]);
                pencil.hoch();
            }
        }

    }
    Footer
© 2023 GitHub, Inc.
            Footer navigation
    Terms
            Privacy
    Security
            Status
    Docs
    Contact GitHub
    Pricing
            API
    Training
            Blog
    About


}
