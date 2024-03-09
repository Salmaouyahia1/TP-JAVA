package TP12;
import java.util.Scanner;
public class EXERCICE2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	System.out.print("Entrez l'heure : ");
    int heure = scanner.nextInt();
    System.out.print("Entrez les minutes : ");
    int minutes = scanner.nextInt();
    int nouvelleHeure = (heure + (minutes + 1) / 60) % 24;
    int nouvellesMinutes = (minutes + 1) % 60;
    System.out.println("Dans une minute, il sera " + nouvelleHeure + " heure(s) " + nouvellesMinutes + ".");
    
    

}
}