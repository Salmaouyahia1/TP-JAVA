package TP3;
import java.util.Scanner;
public class EXERCICE1 {
	public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);
           int[] tableau = {1, 2, 3, 4, 5};
           System.out.println("Les éléments du tableau sont :");
           for (int i = 0; i < tableau.length; i++) {
                System.out.println("element " + i + ": " + tableau[i]);
        }

}
}