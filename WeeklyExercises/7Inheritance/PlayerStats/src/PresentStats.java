
public class PresentStats {

	public static void main(String[] args) {
		FootballStats fb1 = new FootballStats("Andre", "Onana", 0, 0, 5, 2, 3);
		FootballStats fb2 = new FootballStats("Declan", "Rice", 16, 15, 7, 5, 2);
		BasketballStats bb1 = new BasketballStats("James", "Harden", 37, 10, 11, 2, 5, 8, 6, 2);
		BasketballStats bb2 = new BasketballStats("Paul", "George", 24, 11, 10, 1, 2, 9, 5, 4);
		TennisStats t1 = new TennisStats("Hamad", "Medjedovic", 19, 113, 137, 20, 12, 8);
		TennisStats t2 = new TennisStats("Iga", "Swiatek", 23, 1, 200, 30, 12, 18);
		
		
		fb1.PrintFbStats();
		System.out.println("\n");
		fb2.PrintFbStats();
		System.out.println("\n");
		
		bb1.PrintBbStats();
		System.out.println("\n");
		bb2.PrintBbStats();
		System.out.println("\n");
		
		t1.PrintTStats();
		System.out.println("\n");
		t2.PrintTStats();
		System.out.println("\n");
		
		bb2.generalStats();
	}

}
