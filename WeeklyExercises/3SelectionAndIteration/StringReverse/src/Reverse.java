
import java.util.Scanner; 

public class Reverse { 
	public static void main(String[] args) { 

		String input; 
		String output = ""; 

		Scanner scan = new Scanner(System.in); 

		System.out.println("Enter Text Here: "); 
 
		input = scan.nextLine(); 
		
		String [] splitString = input.split(" "); 

		for (String x : splitString) { 
			StringBuffer buffer= new StringBuffer(x); 

			buffer.reverse(); 

			output += (buffer + " "); 
	} 

		System.out.println("\n" + output); 

	} 
} 