import java.util.Scanner;

public class Exo2 {
    public static void main() {
        double N = 1;
        System.out.println("~~~~~~~~~~ Impots ~~~~~~~~~~");
        Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Salaire : ");
        int salaire = myChoice.nextInt();  // Read user input
        System.out.print("Nombre d'enfants : ");
        int enfants = myChoice.nextInt();  // Read user input
        N += 0.5 * enfants;
        System.out.print("Etes vous martié ou pacsé ? (0 - Oui / 1 - Non) : ");
        int pacs = myChoice.nextInt();  // Read user input
        N = (pacs == 0) ? N + 1 : N;
        salaire = (int) (salaire / N);
        double impots = 0;
        if (salaire < 0){
            System.out.println("Salaire doit être positif !");
            return;
        } else if (salaire <= 10225){
            System.out.println("Impots = 0 €");
        } else if (salaire <= 26070){
            impots = N * ( 0.11 * (salaire - 10225));
            System.out.println("Impots = " + impots + " €");
        } else if (salaire <= 74545){
            impots = N * (0.3 * (salaire - 26070) + 0.11 * (26070 - 10225));
            System.out.println("Impots = " + impots + " €");
        } else if (salaire <= 160336){
            impots = N * (0.41 * (salaire - 74545) + 0.3 * (74545 - 26070) + 0.11 * (26070 - 10225));
            System.out.println("Impots = " + impots + " €");
        } else {
            impots = N * (0.45 * (salaire - 160336) + 0.41 * (160336 - 74545) + 0.3 * (74545 - 26070) + 0.11 * (26070 - 10225));
            System.out.println("Impots = " + Math.round(impots*100.0)/100.0 + " €");
        }
    }
}
