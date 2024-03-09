package TP2;
import java.util.Scanner;
public class EXERCICE5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la valeur de n : ");
        int n = sc.nextInt();

        long factorialWhile = 1;
        int k = 1; 

        while (k <= n) {
            factorialWhile *= k;
            k++;
        }

        System.out.println("Factoriel avec while : " + factorialWhile);

        long factorialFor = 1;

        for (int j = 1; j <= n; j++) {
            factorialFor *= j;
        }

        System.out.println("Factoriel avec for : " + factorialFor);
        
	}
}	