import java.util.*;

public class MilesToKilometers {
	public static void main(String[] args) {
		
		float miles;
		double kilom;
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Miles: ");
	    
	    miles = scan.nextFloat();
	    kilom = miles * 1.60934;
	    
	    System.out.println("\n" + kilom + " kilometeres");
	}

}
 