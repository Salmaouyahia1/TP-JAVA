package TP3;
import java.util.Scanner;

import java.util.Arrays;

public class EXERCICE7 {
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
        int somme = 0;
        for (int element : tableau) {
            somme += element;
        }
        System.out.println("La somme est: "+somme);
        double moyenne = (double) somme / taille;
        System.out.println("Le moyenne est: "+moyenne);
        int[] tableauCopie = Arrays.copyOf(tableau, taille);
        System.out.println("\nLe deuxième tableau (copie du premier) est :");
        afficherTableau(tableauCopie);
        Arrays.sort(tableau);
        System.out.println("\nLe tableau après classement croissant est :");
        afficherTableau(tableau);

        scanner.close();
    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("élément " + (i + 1) + ": " + tableau[i]);
        }

}
}
