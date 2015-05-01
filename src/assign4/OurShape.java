/**
 * assign4 is the package for class placement.
 */
package assign4;
// import statements
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This abstract class is used to help calculate the volume or area
 * of shapes.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public abstract class OurShape implements Calculatable {
	
	/** Double to store the value of a shape's dimension. */
	protected double dimension;
	/** String to store the shape's name. */
	protected String shapeName = "shape";
	/** String to store the dimension name (e.g. radius) */
	protected String dimensionName = "dimension";
	
	/** 
	 * Default constructor.
	 */
	public OurShape () {
	}
	/**
	 * Parameterized constructor.
	 * @param	dimension		double that holds the dimension value.
	 */
	public OurShape(double dimension){
		this.dimension = dimension;
	} 
	
	/** 
	 * Get method that returns the dimension.
	 * @return the dimension as a double.
	 */
	public double getDimension () { return dimension; }
	/** 
	 * Get method that returns the shape's name.
	 * @return the shape's name as a String.
	 */
	public String getShapeName() { return shapeName; }
	/** 
	 * Get method that returns the dimension name.
	 * @return the dimension name as a String.
	 */
	public String getDimensionName() { return dimensionName; }
	
	/**
	 * Set method that sets the dimension as a double.
	 * @param	dimension	double containing the dimension.
	 */
	public void setDimension(double dimension) { this.dimension = dimension; }
	/**
	 * Set method that sets the shape's name as a String.
	 * @param	shapeName	String containing the shape's name.
	 */
	public void setShapeName(String shapeName) { this.shapeName = shapeName; }
	/**
	 * Set method that sets the dimension name as a String.
	 * @param	dimensionName	String containing the dimension name.
	 */
	public void setDimensionName(String dimensionName) { this.dimensionName = dimensionName; }
	
	/** 
	 * Void method that allows user to input dimension.
	 */
	public void inputFromUser() {
		Scanner input = new Scanner (System.in);
		boolean continueLoop = true;
		do { // keep looping as long as data is invalid
			try {
				do {
					System.out.print("Enter the " +dimensionName +": ");
					dimension = input.nextDouble();
				} while (dimension < 1);
				continueLoop = false; // if data is valid, set continueLoop to false
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter a valid " +dimensionName +".");
				input.nextLine();
			}
		} while (continueLoop);
	}
	
	//public double calc(){
	//	return dimension;
	//}		
	
	/**
	 * toString method that returns the shape name, dimension
	 * name, and dimension value.
	 */
	public String toString() {
		return shapeName + " with " + dimensionName + " " + dimension;	
	}
}
//end class OurShape