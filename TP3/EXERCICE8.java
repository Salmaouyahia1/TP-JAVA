package TP3;
import java.util.Scanner;

public class EXERCICE8 {
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
        int plusGrandEcart = calculerPlusGrandEcart(tableau);
        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);
        scanner.close();
    }
    public static int calculerPlusGrandEcart(int[] tableau) {
        int plusGrandEcart = 0;
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                int ecart = Math.abs(tableau[i] - tableau[j]);
                if (ecart > plusGrandEcart) {
                    plusGrandEcart = ecart;
                }
            }
        }
        return plusGrandEcart;
   

}
}