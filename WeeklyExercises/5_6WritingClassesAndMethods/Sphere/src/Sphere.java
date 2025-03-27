import java.lang.Math;

public class Sphere {
	float diameter;

	public Sphere(float input) {
		diameter = input;
	}
 
	public float getDiameter() {
		return diameter;
	}
	
	public void setDiameter(float input) {
		this.diameter = input;
	}

	public float calcVolume() {
		float volume = (float) ((4/3) * Math.PI * Math.pow((diameter/2), 3));
		return volume;
	}
	
	public float calcArea() {
		float area = (float) (4 * Math.PI * Math.pow((diameter/2), 2));
		return area;
	}
		
	public String toString() {
		float area = calcArea();
		float volume = calcVolume();
		
		String description = "The circle has a diameter of "
				+ diameter + ", a area of "
				+ area + ", and a volume of "
				+ volume + ".";
		return description;
	}
}
