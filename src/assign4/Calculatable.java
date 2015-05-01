/**
 * assign4 is the package for class placement.
 */
package assign4;
/**
 * This interface is used to help calculate the area or volume 
 * of a shape.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public interface Calculatable {
	/** Static double containing first 5 digits of pi. */
	final double PI = 3.14159;
	/** 
	 * Method used to calculate a shape's area/volume.
	 * @return the shape's area/volume as a double.
	 */
	double calc();
} // end interface Calculatable
