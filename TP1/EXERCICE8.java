package TP1;
import java.util.Scanner;
public class EXERCICE8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a%b;
            a =temp;
        }
        
        System.out.println("Le pgcd est: "+a);


	}

}