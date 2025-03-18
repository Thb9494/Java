import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = Input.readInt();
        int month = Input.readInt();
        int nrOfDays = 0;
        System.out.println("Start date: " + day + "." + month + ".");

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            nrOfDays = 31; 
            break; 

            case 4: case 6: case 9: case 11: 
            nrOfDays = 30; 
            break; 

            case 2:
            nrOfDays = 28;
            break;

            default: 
            nrOfDays = -1;
            break; 
        }

    if (!((1 <= day) && (day <= 319)) || (nrOfDays < 0)) {
        System.out.println ("Erroneous date given!");
    }

    else {
        if (day < nrOfDays) {
            day = day + 1; 
        } else {
            day = 1;
            month = month + 1;
        }
        if (month ==  13){
            month = 1;
        }
    }
    System.out.println ("Next date: " + day + "." + month + ".");
}

// Eigene Input-Klasse
class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        return scanner.nextInt();
    }
}
}
