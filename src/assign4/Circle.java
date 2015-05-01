/**
 * assign4 is the package for class placement.
 */
package assign4;
/**
 * This class calculates the area of a circle. It inherits
 * from the OurShape class and implements the Calculatable interface.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public class Circle extends OurShape implements Calculatable {
	
	/** String containing the name of what is being calculated (area or volume). */
	protected String calcName;
	
	/** 
	 * Default constructor. Sets shapeName (called from superclass) to "circle",
	 * dimensionName to "radius", and calcName (called from superclass) to "volume".
	 */
	public Circle () {
		shapeName = "circle";
		dimensionName = "radius";
		calcName = "area";
	}
	
	/**
	 * Parameterized constructor.
	 * @param	radius		double that holds the radius value.
	 */
	public Circle (double radius) {
		super(radius);
		shapeName = "circle";
		dimensionName = "radius";
		calcName = "area";
	}
	
	/** 
	 * Overridden method that calculates the area of a circle.
	 * @return the area of a circle as a double.
	 */
	@Override
	public double calc() {
		return PI * dimension * dimension;
	}
	
	/**
	 * Overridden toString method that returns the shape name, radius,
	 * and area of the circle.
	 */
	@Override
	public String toString() {
		return super.toString() +" with " +calcName +" ";
	}
} // end class Circle