import java.util.*;

public class TableOfStudentGrades {

	public static void main(String[] args) {	
		String border = "///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
						"==          Student Points          ==\n" +
						"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n" +
						"Name		Labs	Bonus	Total\n" +
						"----		----	-----	-----";
		 
		//functions like a dictionary, can be used to map keys and values.
		Map<String, Integer> points = new HashMap<>();
		
		Map<String, Integer> bonusPoints = new HashMap<>();
		
		points.put("Kristen", 32);
		points.put("Bob", 15);
		points.put("Jimmy", 23);
		points.put("Chris", 30);
		points.put("Ethan", 5);
		
		bonusPoints.put("Kristen", 10);
		bonusPoints.put("Bob", 5);
		bonusPoints.put("Jimmy", 4);
		bonusPoints.put("Chris", 12);
		bonusPoints.put("Ethan", 2);
		
		System.out.println(border);
		for (String x : points.keySet()) {
			
			String name = x;
			Integer labs = points.get(x);
			
			Integer bonus = bonusPoints.get(x);
			
			Integer total = labs + bonus;
			
			System.out.println(name + "		" + labs + "	" + bonus + "	" + total);
		}		
	}  
}
