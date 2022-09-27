import java.util.Scanner;
import java.awt.*;
import java.util.Scanner;  // Import the Scanner class

public class Exo1 {
    public static void main() {
        System.out.println("~~~~~~~~~~ Racines d'un nombre ~~~~~~~~~~");
        Label:
        do {
            System.out.println("\nEntrez une valeur positive (0 pour terminer) : ");
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            int number = myObj.nextInt();  // Read user input
            if (number == 0) {
                System.out.println("Fin du programme");
                return;
            } else if (number < 0) {
                System.out.println("Valeur négative non valable !");
                continue;
            } else {
                double result = Math.sqrt(number);
                System.out.print("La racine de " + number + " est : ");  // Output user input
                System.out.format("%.6f", result);
                System.out.println();
                continue;
            }
        } while (true);
    }
}