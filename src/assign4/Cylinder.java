/**
 * assign4 is the package for class placement.
 */
package assign4;
// import statements
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This class calculates the volume of a cylinder. It inherits
 * from the Circle class and implements the Calculatable interface.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public class Cylinder extends Circle implements Calculatable {
	
	/** Double to store the cylinder's length. */
	protected double length;
	
	/** 
	 * Default constructor. Sets shapeName (called from superclass) to "cylinder"
	 * and calcName (called from superclass) to "volume".
	 */
	public Cylinder () {
		shapeName = "cylinder";
		calcName = "volume";
	}
	
	/**
	 * Parameterized constructor.
	 * @param	radius		double that holds the radius value.
	 * @param	length		double that holds the cylinder's length.
	 */
	public Cylinder (double radius, double length) {
		super(radius);
		shapeName = "cylinder";
		calcName = "volume";
		this.length = length;
	}
	
	/** 
	 * Overridden void method that allows user to input the length, 
	 * makes use of the inputFromUser method in the superclass.
	 */
	@Override
	public void inputFromUser() {
		Scanner input = new Scanner (System.in);
		boolean continueLoop = true;
		super.inputFromUser(); // get radius
		do { // keep looping as long as data is invalid
			try {
				do {
					System.out.print("Enter the length: ");
					length = input.nextDouble();
				} while (length < 1);
				continueLoop = false; // if data is valid, set continueLoop to false
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter a valid length.");
				input.nextLine();
			}
		} while (continueLoop);
	}

	/** 
	 * Overridden method that calculates the volume of a cylinder.
	 * @return the volume of a cylinder as a double.
	 */
	@Override
	public double calc() {
		return PI * dimension * dimension * length;
	}
	
	/** 
	 * Overridden toString method that returns the shape's name, radius, length, 
	 * and volume of the cylinder.
	 */
	@Override
	public String toString() {
		return shapeName +" with " +dimensionName +" " +dimension +" and length " +length +" with " +calcName +" ";
	}
}
//end class Cylinder