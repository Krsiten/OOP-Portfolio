import java.util.Scanner;

public class BulbOnOff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lightbulb On: True/False");
		Bulb bulb1 = new Bulb(scan.nextBoolean());

		System.out.println("Lightbulb On: True/False");
		Bulb bulb2 = new Bulb(scan.nextBoolean());

		System.out.println("Lightbulb Off");
		Bulb bulb3 = new Bulb(false);

		System.out.println("Bulb 1:\n" + bulb1.switchOn());
		System.out.println("Bulb 2:\n" + bulb2.switchOn());
		System.out.println("Bulb 3:\n" + bulb3.switchOn());
		
		
		bulb3.setOnOff(true);
		System.out.println("UPDATED:\n\nBulb 1:\n" + bulb1.switchOn());
		System.out.println("Bulb 2:\n" + bulb2.switchOn());
		System.out.println("Bulb 3:\n" + bulb3.switchOn());
	}

}
