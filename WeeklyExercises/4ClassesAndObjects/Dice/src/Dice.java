import java.util.*;

public class Dice {

	public static void main(String[] args) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();;
		int dice1;
		int dice2;
		int dice1Total;
		int dice2Total;
		
		Random generator = new Random();		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many sides does teh first dice have?: ");
		dice1 = scan.nextInt();
		System.out.println("And the second?: ");
		dice2 = scan.nextInt();
		
		for (int x = 0; x < 3; x++) {
			rolls.add(generator.nextInt(1, dice1 + 1));
			rolls.add(generator.nextInt(1, dice2 + 1));
		}
		
		dice1Total = rolls.get(0) + rolls.get(2) + rolls.get(4);
		dice2Total = rolls.get(1) + rolls.get(3) + rolls.get(5);
		
		System.out.println("Die 1 first roll = " + rolls.get(0));
		System.out.println("Die 2 first roll = " + rolls.get(1));
		System.out.println("Die 1 second roll = " + rolls.get(2));
		System.out.println("Die 2 second roll = " + rolls.get(3));
		System.out.println("Die 1 third roll = " + rolls.get(4));
		System.out.println("Die 2 third roll = " + rolls.get(5));
		System.out.println("Die 1 rolled a total of " + dice1Total + " and rolled an average of " + ((float) dice1Total / 3));
		System.out.println("Die 2 rolled a total of " + dice2Total + " and rolled an average of " + ((float) dice2Total / 3));
		
		
	}

}
