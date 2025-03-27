import java.util.Random;
import java.util.Scanner;

public class Roshambo {
	
	public static void main(String[] args) {
		String personPlay;    //User's play -- "R", "P", or "S" 
		String computerPlay = null;  //Computer's play -- "R", "P", or "S" 
        int computerInt;      //Randomly generated number used to determine 

        Scanner scan = new Scanner(System.in); 
        Random generator = new Random(); 

        //Get player's play -- note that this is stored as a string 
        personPlay = scan.nextLine(); 

        //Make player's play upper case for ease of comparison 
        personPlay = personPlay.toUpperCase();

        //Generate computer's play (0,1,2) 
        computerInt = generator.nextInt(3); 
 
        //Translate computer's randomly generated play to string 
        switch (computerInt) { 
        	case 0: 
        		computerPlay = "R"; 
        		break; 
        	case 1:  
        		computerPlay = "P"; 
        		break; 
        	case 2: 
        		computerPlay = "S"; 
        		break; 
        } 

        //Print computer's play 
        System.out.println(computerPlay); 

        //See who won.  Use nested if's instead of &&. 
        if (personPlay.equals(computerPlay))   
        	System.out.println("It's a tie!"); 

        else if (personPlay.equals("R")) 
            if (computerPlay.equals("S")) 
            	System.out.println("Rock crushes scissors.  You win!!"); 
            else 
                //...  Fill in rest of code 
            	System.out.println("Paper beats rock. You lose!!"); 
        else if (personPlay.equals("P"))
        	if (computerPlay.equals("S")) 
        		System.out.println("Scissors cutd paper.  You lose!!"); 
        	else 
        		System.out.println("Paper beats rock. You win!!"); 
        else if (personPlay.equals("S")) 
        	if (computerPlay.equals("R")) 
        		System.out.println("Rock crushes scissors.  You lose!!"); 
        	else 

      System.out.println("Scissors cuts paper. You win!!"); 
        
    } 

} 