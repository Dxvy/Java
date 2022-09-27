import java.util.Scanner;

public class Exo6 {
    public static void main() {
        System.out.println("~~~~~~~~~~ Tableau ~~~~~~~~~~");
        System.out.print("\nEntrez la taille du tableau (0 pour terminer) : ");
        Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
        float average = 0;
        float average2 = 0;
        float somme = 0;
        float somme2 = 0;
        int choix = myChoice.nextInt();  // Read user input
        if (choix < 0){
            System.out.println("Entrez une taille positive (0 pour terminer) :");
            Exo6.main();
        } else if (choix == 0) {
            System.out.println("Fin du programme");
            return;
        } else {
            float[][] tab = new float[choix][choix];
            for (int i=1; i <= choix; i++){
                for (int j=1; j <= choix; j++){
                    System.out.print("\nEntre valeur [ "+ i + " , " + j + " ] :");
                    Scanner myValue = new Scanner(System.in);  // Create a Scanner object
                    float valeur = myValue.nextFloat();  // Read user input
                    tab[i-1][j-1] = (float) valeur;
                }
            }
            System.out.println("\n\n~~~~~~~~~~ Affichage du tableau ~~~~~~~~~~\n\n");
            for (int i=1; i <= choix; i++){
                for (int j=1; j <= choix; j++){
                    System.out.print(tab[i-1][j-1] + " | ");
                    average += tab[i-1][j-1];
                }
                average = average / choix;
                somme += average;
                System.out.printf("\u001B[35m" + "%-10.2f" + "\u001B[0m", Math.round(average * 100.0) / 100.0);
                average = 0;
                System.out.println();
            }
            for (int i=1; i <= choix; i++){
                for (int j=1; j <= choix; j++){
                    average2 += tab[j-1][i-1];
                }
                average2 = average2 / choix;
                somme2 += average2;
                System.out.printf("\u001B[31m" + "%-6s" + "\u001B[0m", Math.round(average2 * 100.0) / 100.0);
                average2 = 0;
            }
            System.out.print(somme);
            if (somme > somme2){
                System.out.println("\n\nLa somme des moyennes des lignes est supérieure à la somme des moyennes des colonnes");
            } else if (somme < somme2){
                System.out.println("\n\nLa somme des moyennes des lignes est inférieure à la somme des moyennes des colonnes");
            } else {

                System.out.println("\n\nLa somme des moyennes des lignes est égale à la somme des moyennes des colonnes");
            }
        }
    }
}

