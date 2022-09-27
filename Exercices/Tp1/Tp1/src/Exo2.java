import java.util.Scanner;
import java.awt.*;
import java.util.Scanner;  // Import the Scanner class

public class Exo2 {
    public static void main() {
        System.out.println("~~~~~~~~~~ Arbre de noel  ~~~~~~~~~~");
        System.out.println("\nHauteur de l'arbre souhaité : ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int number = myObj.nextInt();  // Read user input
        int star = 7;
        int star1 =1;
        for (int i1 = 0; i1 < number; i1++){
            System.out.println();
            for (int i = 0; i < star; i++){
                System.out.print("=");
            }
            for (int i = 0; i < star1; i++){
                System.out.print("*");
            }
            for (int i = 0; i < star; i++){
                System.out.print("=");
            }
            star--;
            star1+=2;
        }
        System.out.println("""

                =======*=======
                ======***======""");
    }
}
