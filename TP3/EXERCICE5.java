package TP3;
import java.util.Scanner;
public class EXERCICE5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        System.out.println("Veuillez entrer " + taille + " entiers pour remplir le tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        System.out.println("\nLe tableau avant inversion est :");
        afficherTableau(tableau);
        int debut = 0;
        int fin = taille - 1;
        while (debut < fin) {
            int temp = tableau[debut];
            tableau[debut] = tableau[fin];
            tableau[fin] = temp;
            debut++;
            fin--;
        }
        System.out.println("\nLe tableau après inversion est :");
        afficherTableau(tableau);
        scanner.close();
    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("élément " + (i + 1) + ": " + tableau[i]);
        }
}
}
