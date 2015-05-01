/**
 * assign4 is the package for class placement.
 */
package assign4;
// import statements
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This class calculates the volume of a rectangular prism. It inherits
 * from the OurShape class and implements the Calculatable interface.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public class RectangularPrism extends OurShape implements Calculatable {

	/** Double to store the value of a rectangular prism's width. */
	private double width;
	/** Double to store the value of a rectangular prism's height. */
	private double height;
	
	/**
	 * Default constructor. Sets shapeName (called from superclass) to
	 * "rectangular prism" and dimensionName to "length."
	 */
	public RectangularPrism() {
		shapeName = "rectangular prism";
		dimensionName = "length";
	}
	
	/** inputFromUser asks user to input length, width, and height and loops if they are all the same */
	@Override
	public void inputFromUser() {
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		super.inputFromUser(); // get length

		do { // keep looping as long as data is invalid
			try {
				do {
					System.out.print("Enter the width: ");
					width = input.nextDouble();
				} while (width < 1);
				continueLoop = false; // if data is valid, set continueLoop to false
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter a valid width.");
				input.nextLine();
			}
		} while (continueLoop);

		continueLoop = true;
		do { // keep looping as long as data is invalid
			try {
				do {
					// if the height, width, and length are the same, then the
					// shape is not a rectangular prism, so tell the user to re-enter
					// a valid height
					if (height == width && width == dimension) {
						System.out.print("Please enter a height different from the width and length: ");
					}
					else {
						System.out.print("Enter the height: ");
					}
					height = input.nextDouble();
				} while (height < 1 || (height == width && width == dimension));
				continueLoop = false; // if data is valid, set continueLoop to false
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter a valid height.");
				input.nextLine();
			}
		} while (continueLoop);
	} // end method inputFromUser
	
	/** 
	 * Overridden method that calculates the volume of a rectangular prism.
	 * @return the volume of a rectangular prism as a double.
	 */
	@Override
	public double calc() {
		return dimension * width * height;
	}
	
	/**
	 * Overridden toString method that returns the shape name, length,
	 * width, height, and volume of the rectangular prism.
	 */
	@Override
	public String toString() {
		return shapeName +" with length " +dimension +" and width " +width +" and height " +height +" with volume ";
	}
} // end class RectangularPrism