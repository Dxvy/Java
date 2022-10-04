import java.awt.*;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        System.out.println("0 - Quitter ");
        System.out.println("1 -  Méthode d'Archimède ");
        System.out.println("2 - Impots ");
        System.out.println("3 - Chance Euromillions ");
        System.out.println("4 - Jeu de Nim ");
        System.out.print("\nVotre choix: ");
        Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
        int choix = myChoice.nextInt();  // Read user input
        switch (choix) {
            case 0:
                System.out.println("Au revoir !");
                return;
            case 1:
                Exo1.main();
                break;
            case 2:
                Exo2.main();
                break;
            case 3:
                Exo3.main();
                break;
            case 4:
                Exo4.main();
                break;
            default:
                System.out.println("Choix invalide !");
                main(args);
        }
        System.out.println("\n\nVoulez-vous retourner au menu ? ");
        System.out.println("0 - Oui ");
        System.out.println("1 - Non ");
        System.out.print("\nVotre choix : ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int number = myObj.nextInt();  // Read user input
        System.out.println("\n");
       switch (number) {
            case 0:
                main(args);
                break;
            case 1:
                System.out.println("Au revoir !");
                return;
            default:
                System.out.println("Choix invalide !");
                main(args);
        }
    }
}