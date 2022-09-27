import java.util.Scanner;

public class Exo3 {
    public static void restart(){
        System.out.println("Voulez-vous recommencer [oO] ? N : ");
        Scanner St = new Scanner(System.in);  // Create a Scanner object
        String answer = St.nextLine();  // Read user input
        int comparaison = answer.compareToIgnoreCase("o");
        if (comparaison == 0){
            Exo3.main();
        } else {
            return;
        }
    }
    public static void main() {
        System.out.println("~~~~~~~~~~ Nombre binaire ~~~~~~~~~~");
        System.out.println("\nVoulez-vous convertir : ");
        System.out.println("1- un nombre décimal en binaire");
        System.out.println("2- un nombre binaire en décimal");
        System.out.println("0- Quitter");
        System.out.println("Rentrer votre choix :");
        Scanner Nb = new Scanner(System.in);  // Create a Scanner object
        int choix = Nb.nextInt();  // Read user input
        if (choix == 1) {
            System.out.println("Rentrer un nombre décimal :");
            Scanner D = new Scanner(System.in);  // Create a Scanner object
            int nbr = D.nextInt();  // Read user input
            String result = Integer.toBinaryString(nbr);
            System.out.println("Résultat : " + nbr + " vos " + result + " en décimal");
            restart();
        } else if (choix == 2) {
            System.out.println("Rentrer un nombre binaire :");
            Scanner D = new Scanner(System.in);  // Create a Scanner object
            String nbr = D.nextLine();  // Read user input
            int result = Integer.parseInt(nbr, 2);
            System.out.println("Résultat : " + nbr + " vos " + result + " en décimal");
            restart();
        } else if (choix == 0) {
            return;
        } else {
            System.out.println("Choix invalide !");
            Exo3.main();
        }
    }
}
