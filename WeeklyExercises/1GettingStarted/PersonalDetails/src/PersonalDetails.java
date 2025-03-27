import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		
		String name;
		String address;
		String age;
		String mobile;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = scan.nextLine();
		
		System.out.println("Enter Address: ");
		address = scan.nextLine();
		
		System.out.println("Enter Age: ");
		age = scan.nextLine();
		
		System.out.println("Enter Phone Number: ");
		mobile = scan.nextLine();
		
		System.out.println("\nName: " + name);
		System.out.println("Addres: " + address);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + mobile);
	}
} 
