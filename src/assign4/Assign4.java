/**
 * assign4 is the package for class placement.
 */
package assign4;
// import statements
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * This class launches the program and presents the user with a menu
 * to choose what shape to create.
 * @author		Richard Barney
 * @version		1.0.0 April 2013
 */
public class Assign4 {
	/**
	 * main method as required by JVM.
	 * @param  args   standard command line parameters as a String array.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		OurShape[] shapes = new OurShape[100]; // array of OurShape objects
		int numberOfShapes = 0;
		int option = 6; // give the variable a invalid menu number
		// display welcome message
		System.out.println("Welcome to the Shapes Program!"
							+"\nThis program allows you to \"create\" five different shapes."
							+"\nA maximum of 100 shapes can be added before the program will "
							+"\nterminate itself. When the program ends, the number of shapes and "
							+"\ntheir values will be displayed.");
		while (option != 0 && numberOfShapes <= 99) { // loop menu as long as conditions are valid
			try {
				do { // keep displaying menu for invalid input
					System.out.println("Enter:"
										+"\n    1 to add a circle"
										+"\n    2 to add a sphere"
										+"\n    3 to add a cylinder"
										+"\n    4 to add a cube"
										+"\n    5 to add a rectangular prism"
										+"\n    0 to quit");
					option = input.nextInt();
				} while (option < 0 || option > 5);
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please enter a valid number.");
				input.nextLine();
			} // end try
			
			switch(option) {
				case 1:
					shapes[numberOfShapes] = new Circle();
					shapes[numberOfShapes].inputFromUser();
					++numberOfShapes;
					System.out.println("The circle has been added.");
					break;
				case 2:
					shapes[numberOfShapes] = new Sphere();
					shapes[numberOfShapes].inputFromUser();
					++numberOfShapes;
					System.out.println("The sphere has been added.");
					break;
				case 3:
					shapes[numberOfShapes] = new Cylinder();
					shapes[numberOfShapes].inputFromUser();
					++numberOfShapes;
					System.out.println("The cylinder has been added.");
					break;
				case 4:
					shapes[numberOfShapes] = new Cube();
					shapes[numberOfShapes].inputFromUser();
					++numberOfShapes;
					System.out.println("The cube has been added.");
					break;
				case 5:
					shapes[numberOfShapes] = new RectangularPrism();
					shapes[numberOfShapes].inputFromUser();
					++numberOfShapes;
					System.out.println("The rectangular prism has been added.");
					break;
			} // end switch
		} // end big while loop

		if (numberOfShapes >= 99) {
			System.out.println("100 shapes were added, ending program...");
		}
		//when stopped, display shapes
		if (option == 0 && numberOfShapes == 0) {
			System.out.print("Goodbye. No shapes were added.");
		}
		if ((option == 0 && numberOfShapes > 0) || numberOfShapes >= 99) {
			System.out.println("Goodbye. The shapes added were: ");
			for (int i = 0; i < numberOfShapes; i++) {
				System.out.println (shapes[i].toString() + shapes[i].calc());
			}
		}
	} // end method main
} // end class Assign4