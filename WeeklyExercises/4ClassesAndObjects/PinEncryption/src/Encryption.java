import java.util.Random;
import java.util.Scanner;

public class Encryption {
	
	static String decToHex(int deca) {
		char[] hexaArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		String hexa = "";
		
		while (deca > 0) {
			hexa = hexaArray[deca%16] + hexa;
			deca = deca/16;
		}
		
		return hexa;
	}
	
	public static void main(String[] args) {
		int pin;
		int num1;
		int num2;
		String hexaPin;
		String hexaNum1;
		String hexaNum2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit pin: ");
		pin = scan.nextInt();
		
		Random generator = new Random();
		num1 = generator.nextInt(1001,65536);
		num2 = generator.nextInt(1001,65536);
		
		hexaPin = decToHex(pin);
		hexaNum1 = decToHex(num1);
		hexaNum2 = decToHex(num2);
		
		System.out.println("Your encrypted pin is: " + hexaNum1 + hexaPin + hexaNum2);
	}
}
