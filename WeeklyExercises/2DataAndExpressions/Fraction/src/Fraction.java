import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {
		int numer;
		int denom;
		float decimal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numerator: ");
	    numer = scan.nextInt();
	    
	    System.out.println("Enter denominator: ");
	    denom = scan.nextInt();
	    
	    decimal = (float) numer / denom;
	    
	    System.out.println("\nFraction as decimal: " + decimal);
	}

} 
