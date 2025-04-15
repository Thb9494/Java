public class RekursionLoesung {
 // Fakultät berechnen
    // Fakultät ist definiert als n! = n * (n-1) * (n-2) * ... * 1
    // 0! = 1

    // Hier die Methode fakultaet erstellen

    public static int fakultaet(int n) {
        if (n == 0) {
            return 1; // Abbruchbedingung
        } else {
            return n * fakultaet(n - 1); // Rekursiver Aufruf
        }
    }

 // Fibonacci-Zahl berechnen
    // fib(0) = 0
    // fib(1) = 1
    // sonst: fib(n) = fib (n-1) + fib (n-2)

    public static int calcFib(int n) {

        if (n == 0) { // Rekursionsanker
            return 0;
        } else if (n == 1) { // Rekursionsanker
            return 1;
        } else {
            return calcFib(n - 1) + calcFib(n - 2);
        }
    }

    public static void main(String[] args) {
     // Fakulstaet
        System.out.println("bitte geben sie eine Zahl ein");
        int number = Main.Input.readInt();
        // hier prüfen ob die Zahl >1 ist (mit while-Schleife)
        while (number < 0) {
            System.out.println("bitte Zahl >= 0 eingeben");
            number = Main.Input.readInt();
        }

        // hier die Fibonacci-Zahl ausgeben
        int ergebnis = fakultaet(number);
        System.out.println(number + "! = " + ergebnis);

     // Fibonacci
        System.out.println("bitte geben sie eine Zahl ein");
        int numberFib = Main.Input.readInt();
        // prüfen ob zahl > 0
        if (numberFib < 1) {
            System.out.println("bitte Zahl > 0 eingeben");
            numberFib = Main.Input.readInt();
        }

        // hier Ergebnis berechnen und ausgeben
        int fib = calcFib(numberFib);
        System.out.println("die Fbonacci-Zahl von " + numberFib + " ist " + fib);
    }

}
