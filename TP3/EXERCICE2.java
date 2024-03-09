package TP3;
import java.util.Scanner;

public class EXERCICE2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] tableau = new int[10];
	        System.out.println("Veuillez entrer 10 entiers pour remplir le tableau :");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print("Entrez l'élément " + (i + 1) + " : ");
	            tableau[i] = scanner.nextInt();
	        }
	        System.out.println("Le tableau rempli est :");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.println("element " + (i + 1) + ": " + tableau[i]);
	        }
	        scanner.close();
		 
}
}