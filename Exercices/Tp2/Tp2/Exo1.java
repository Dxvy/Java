import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exo1 {

    static class Archimede {
        public static double Cn(double X, double Y) {
            double result = 2 * X * Y / (X + Y) ;
            return result;
        }
        public static double In(double X, double Y) {
            double result = sqrt(X * Y);
            return result;
        }
        public static double[] An() {
            double X = 4;
            double Y = 2*sqrt(2);
            Scanner myChoice = new Scanner(System.in);  // Create a Scanner object
            System.out.print("N : ");
            int N = myChoice.nextInt();  // Read user input
            double[] result = new double[2];
            for (int i = 1; i <= N; i++) {
                 X = Cn(X, Y);
                 Y = In(X, Y);
            }
            return new double[]{X, Y};
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
        System.out.println("\nQuelle méthode voulez-vous lancer? \n0 - Quitter \n1 - Cn \n2 - In \n3 - An");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int number = myObj.nextInt();  // Read user input
        if (number == 1){
            System.out.println("\nCn = " + Archimede.Cn(X, Y));
        } else if (number == 2){
            System.out.println("\nIn = " + Archimede.In(X, Y));
        }
        else if(number == 3){
            System.out.println(" \n An : " + Arrays.toString(Archimede.An()));
        }
        else if (number == 0){
            return;
        } else {
            System.out.println("Choix invalide !");
            main();
        }

    }
}
