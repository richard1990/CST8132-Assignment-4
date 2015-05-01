/**
 * assign4 is the package for class placement.
 */
package assign4;
/**
 * This class calculates the volume of a cube. It inherits
 * from the OurShape class and implements the Calculatable interface.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public class Cube extends OurShape implements Calculatable {

	/** 
	 * Default constructor. Sets shapeName (called from superclass) to "cube".
	 */
	public Cube() {
		shapeName = "cube";
	}
	
	/** 
	 * Overridden method that calculates the volume of a cube.
	 * @return the volume of a cube as a double.
	 */
	@Override
	public double calc() {
		return dimension * dimension * dimension;
	}
	
	/**
	 * Overridden toString method that returns the shape name, dimension, 
	 * and volume of the cube.
	 */
	@Override
	public String toString() {
		return super.toString() +" with volume ";
	}
} // end class Cube