package TP2;
import java.util.Scanner;
public class EXERCICE6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Entrez un nombre : ");
        int nbr = sc.nextInt();

        if (nbr < 2) {
            System.out.println(nbr + " n'est pas un nombre premier.");
        } else {
            int i = 2;
            while (i <= Math.sqrt(nbr) && nbr % i != 0) {
                i++;
            }

            if (i > Math.sqrt(nbr)) {
                System.out.println(nbr + " est un nombre premier.");
            } else {
                System.out.println(nbr + " n'est pas un nombre premier.");
            }
        }

        System.out.print("Entrez la valeur de N : ");
        int N = sc.nextInt();

        System.out.println("Nombres premiers entre 1 et " + N + " :");
        for (int i = 1; i <= N; i++) {
            if (i < 2) {
                System.out.print(i + " ");
            } else {
                int j = 2;
                while (j <= Math.sqrt(i) && i % j != 0) {
                    j++;
                }

                if (j > Math.sqrt(i)) {
                    System.out.print(i + " ");
                }
            }
        }

	}

}