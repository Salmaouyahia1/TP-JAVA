package TP2;
import java.util.Scanner;
public class EXERCICE3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la valeur de N : ");
        int N = sc.nextInt();

        double SH = 0;

        for (int i = 1; i <= N; i++) {
            SH += 1.0 / i;
        }

        System.out.println("La somme des premiers termes de la série harmonique est : " +SH);

	}

}