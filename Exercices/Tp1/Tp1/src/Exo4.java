import java.util.Scanner;

public class Exo4 {
    public static void main() {
        System.out.println("~~~~~~~~~~ Suite ~~~~~~~~~~");
        System.out.println("\nEntrez le nombre de terme de la suite à calculer n avec n > 0 : ");
        Scanner D = new Scanner(System.in);  // Create a Scanner object
        int nbr = D.nextInt();  // Read user input
        if (nbr < 0) {
            System.out.println("Choix invalide !");
            Exo4.main();
        } else if (nbr == 0) {
            return;
        } else if (nbr == 1){
            System.out.println("U1 = 1");
            Exo4.main();
        } else {
            int i = 1;
            double U = 1;
            double index = 2;
            do {
                U = U + (1 / index);
                i++;
                index++;
            } while (index <= nbr);
            System.out.println("U" + i + " est : " + U);
            Exo4.main();
        }
    }
}
