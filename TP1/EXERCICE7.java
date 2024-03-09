package TP1;
import java.util.Scanner;
public class EXERCICE7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Donnez les valeurs de a, b et c :");
	       float a =scanner.nextFloat();
	       float b =scanner.nextFloat();
	       float c =scanner.nextFloat();
	double delta = Math.pow(b, 2) - 4 * a * c;
	if (delta > 0) {
	    double sol_1 = (-b - Math.sqrt(delta)) / (2 * a);
	    double sol_2 = (-b + Math.sqrt(delta)) / (2 * a);
	    System.out.println("L'équation admet deux solutions distinctes :");
	    System.out.println("Solution 1 : " + sol_1);
	    System.out.println("Solution 2 : " + sol_2);
	} else if (delta == 0) {
	    double sol = -b / (2 * a);
	    System.out.println("L'équation admet une seule solution : " + sol);
	} else {
	    System.out.println("L'équation n'admet pas de solutions réelles.");
	}

}
	}
