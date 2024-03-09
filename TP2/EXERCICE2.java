package TP2;
import java.util.Scanner;
public class EXERCICE2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de X : ");
        int X = sc.nextInt();

        System.out.print("Entrez la valeur de N : ");
        int N = sc.nextInt();

        long R = 1;

        for (int i = 0; i < N; i++) {
            R*= X;
        }

        System.out.println("Le resultat est: " +R);
	}

}
