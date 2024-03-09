package TP1;
import java.util.Scanner;
public class EXERCICE5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("donnet un entier dont vous voulez calculer le factorielle");
	       int n =scanner.nextInt();
	       int fact=1;
	       for (int i=1;i<=n;i++){
	           fact=fact*i;
	       }
	       System.out.println("le factorielle est:"+fact);
	 
	        }
}
