import java.util.Random;

public class Card {
	String[] deck = {"Hearts", "Spades", "diamonds", "clubs"};
	int value;
	String house;
	
	Random generator = new Random();	
	
	public Card() {
		value = generator.nextInt(1,15);
		house = deck[generator.nextInt(0,3)];
	}

	public String getHouse() {
		return house;
	}
	
	public String getValue() {
		return house;
	}

	public String toString() {
		getHouse();
		getValue();
		
		return ("House: " + house + "\n" +
				"Value: " + value);
	}
}