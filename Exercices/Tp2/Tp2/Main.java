import java.awt.*;
import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        System.out.println("0 - Quitter ");
        System.out.println("1 -  Méthode d'Archimède 1/2 ");
        System.out.println("2 -  Méthode d'Archimède 2/2 ");
        System.out.println("3 - Impots ");
        System.out.println("4 - Chance Euromillions ");
        System.out.println("5 - Jeu de Nim ");
        System.out.print("\nVotre choix: ");
        Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
        int choix = myChoice.nextInt();  // Read user input
        if (choix == 1) {
            Exo1.main();
        } else if (choix == 2) {
            Exo2.main();
        } else if (choix == 3) {
            Exo3.main();
        } else if (choix == 4) {
            Exo4.main();
        }else if (choix == 5){
            Exo5.main();
        } else if (choix == 0){
            return;
        } else {
            System.out.println("Choix invalide !");
            main(args);
        }
        System.out.println("\n\nVoulez-vous retourner au menu ? ");
        System.out.println("0 - Oui ");
        System.out.println("1 - Non ");
        System.out.println("Votre choix : ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int number = myObj.nextInt();  // Read user input
        if (number == 0){
            main(args);
        } else {
            return;
        }
    }
}