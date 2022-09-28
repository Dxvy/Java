import java.util.Scanner;

public class Exo1 {

    static class Archimede {
        public static double Cn(double X, double Y) {
            double result = 2 * X * Y / (X + Y) ;
            System.out.println("\nCn = " + result);
            return result;
        }
        public static double In(double X, double Y) {
            double result = Math.sqrt(X * Y);
            System.out.println("\nIn = " + result);
            return result;
        }
    }
    public static void main() {
        System.out.println("~~~~~~~~~~ Méthode d'Archimède ~~~~~~~~~~");
        Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
        System.out.print("X : ");
        int X = myChoice.nextInt();  // Read user input
        if (X < 0){
            System.out.println("X doit être positif !");
            return;
        }
        System.out.print("Y : ");
        int Y = myChoice.nextInt();  // Read user input
        if (Y < 0){
            System.out.println("Y doit être positif !");
        }
        System.out.println("\nQuelle méthode voulez-vous lancer? \n0 - Quitter \n1 - Cn \n2 - In");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int number = myObj.nextInt();  // Read user input
        if (number == 1){
            Archimede.Cn(X, Y);
        } else if (number == 2){
            Archimede.In( X, Y);
        } else if (number == 0){
            return;
        } else {
            System.out.println("Choix invalide !");
            main();
        }

    }
}
