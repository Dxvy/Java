import java.util.Scanner;

public class Exo5 {
    public static void main() {
        System.out.println("~~~~~~~~~~ Somme ~~~~~~~~~~");
        System.out.println("\nEntrez la taille du tableau (0 pour terminer) : ");
        Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
        int choix = myChoice.nextInt();  // Read user input
        if (choix < 0){
            System.out.println("Entrez une taille positive (0 pour terminer) :");
            Exo5.main();
        } else if (choix == 0) {
            System.out.println("Fin du programme");
            return;
        } else {
            float somme = 0;
            for (int i = 1; i <= choix; i++){
                System.out.println("Entre valeur " + i + " : ");
                Scanner myValue = new Scanner(System.in);  // Create a Scanner object
                float valeur = myValue.nextFloat();  // Read user input
                somme += valeur;
            }
            System.out.println("La somme du tableau est " + somme);
        }

    }
}