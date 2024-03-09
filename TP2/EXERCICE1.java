package TP2;
import java.util.Scanner;
	   
public class EXERCICE1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez le nombre N : ");
	        int N = scanner.nextInt();
	        System.out.println("Utilisation de while : ");
	        int sommeWhile = 0;
	        int produitWhile = 1;
	        int iWhile = 0;
	        while (iWhile < N) {
	            System.out.print("Entrez un entier : ");
	            int nombre = scanner.nextInt();
	            sommeWhile += nombre;
	            produitWhile *= nombre;
	            iWhile++;
	        }
	        double moyenneWhile = (double) sommeWhile / N;
	        afficherResultats(sommeWhile, produitWhile, moyenneWhile);
	        System.out.println("\nUtilisation de do-while : ");
	        int sommeDoWhile = 0;
	        int produitDoWhile = 1;
	        int iDoWhile = 0;
	        do {
	            System.out.print("Entrez un entier : ");
	            int nombre = scanner.nextInt();
	            sommeDoWhile += nombre;
	            produitDoWhile *= nombre;
	            iDoWhile++;
	        } while (iDoWhile < N);
	        double moyenneDoWhile = (double) sommeDoWhile / N;
	        afficherResultats(sommeDoWhile, produitDoWhile, moyenneDoWhile);
	        System.out.println("\nUtilisation de for : ");
	        int sommeFor = 0;
	        int produitFor = 1;
	        for (int iFor = 0; iFor < N; iFor++) {
	            System.out.print("Entrez un entier : ");
	            int nombre = scanner.nextInt();
	            sommeFor += nombre;
	            produitFor *= nombre;
	        }
	        double moyenneFor = (double) sommeFor / N;
	        afficherResultats(sommeFor, produitFor, moyenneFor);

	        scanner.close();
	    }

	    public static void afficherResultats(int somme, int produit, double moyenne){
	        System.out.println("Somme : " + somme);
	        System.out.println("Produit : " + produit);
	        System.out.println("Moyenne : " + moyenne);
	        

}
}