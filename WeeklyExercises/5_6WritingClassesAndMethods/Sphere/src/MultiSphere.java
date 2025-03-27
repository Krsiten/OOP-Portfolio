import java.util.Scanner;

public class MultiSphere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Diameter of sphere 1");
		Sphere sphere1 = new Sphere(scan.nextFloat());

		System.out.println("Enter Diameter of sphere 2");
		Sphere sphere2 = new Sphere(scan.nextFloat());

		System.out.println("Enter Diameter of sphere 3");
		Sphere sphere3 = new Sphere(scan.nextFloat());
		
		System.out.println(sphere1.toString());
		System.out.println(sphere2.toString());
		System.out.println(sphere3.toString());
	}

}
