/**
 * assign4 is the package for class placement.
 */
package assign4;
/**
 * This class calculates the volume of a sphere. It inherits
 * from the Circle class and implements the Calculatable interface.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public class Sphere extends Circle implements Calculatable{
	
	/** 
	 * Default constructor. Sets shapeName (called from superclass) to "sphere"
	 * and calcName (called from superclass) to "volume".
	 */
	public Sphere () {
		shapeName = "sphere";
		calcName = "volume";
	}
	
	/**
	 * Parameterized constructor.
	 * @param	radius		double that holds the radius value.
	 */
	public Sphere(double radius) {
		super(radius);
		shapeName = "sphere";
		calcName = "volume";
	}
	
	/** 
	 * Overridden method that calculates the volume of a sphere.
	 * @return the volume of a sphere as a double.
	 */
	@Override
	public double calc() {
		return PI * dimension * dimension * dimension * 4.0 / 3.0;
	}
} //bend class Sphere