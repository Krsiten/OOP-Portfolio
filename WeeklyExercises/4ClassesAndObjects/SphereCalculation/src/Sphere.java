import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

public class Sphere {
	public static void main(String[] args) {
	float radi;
	float volu;
	float area;
	
	DecimalFormat fmt = new DecimalFormat("0.0000");
	
	Scanner scan = new Scanner(System.in);
	radi = scan.nextFloat();
	
	volu = (float) (4 * Math.PI * radi * 3 / 3);
	area = (float) (4 * Math.PI * radi * 2);
	System.out.println("Volume: " + fmt.format(volu));
	System.out.println("Area: " + fmt.format(area));
	}
}
