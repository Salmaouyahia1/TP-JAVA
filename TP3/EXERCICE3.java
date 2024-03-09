package TP3;
import java.util.Scanner;

public class EXERCICE3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taille;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = scanner.nextInt();
        } while (taille < 10 || taille > 50);
        int[] tableau = new int[taille];
        System.out.println("Veuillez entrer " + taille + " entiers pour remplir le tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        System.out.println("Le tableau rempli est :");
        for (int i = 0; i < taille; i++) {
            System.out.println("élément " + (i + 1) + ": " + tableau[i]);
        }
        scanner.close();

}
}