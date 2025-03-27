import java.util.Scanner;

public class SquareCalculations {
	public static void main(String[] args) {
		
		int num;
		int perim;
		int area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
	    
	    num = scan.nextInt();
	     
	    perim = num * 4;
	    area = num * num;
	    
	    System.out.println("\nPerimeter: " + perim);
	    System.out.println("Area: " + area);
	}
}
