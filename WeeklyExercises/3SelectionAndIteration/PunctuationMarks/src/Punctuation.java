
public class Punctuation {
	public static void main(String[] args) {
		
		int comma = 0;
		int period = 0;
		int hyphen = 0;
		
		String poem = "Mary had a little lamb, her fleece was as white as snow, "
				+ "and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
		
		System.out.println(poem);
		
		char[] charArray = poem.toCharArray();


		for (char n : charArray) {
			if (n == ',') {
				comma += 1;
			} else if (n == '.') {
				period += 1;
			} else if (n == '-') {
				hyphen += 1;
			}
		}
		
		System.out.println("\nComma: " + comma);
		System.out.println("Period: " + period);
		System.out.println("Hyphen: " + hyphen);
		
	}
} 
