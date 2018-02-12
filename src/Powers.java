import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {

		System.out.println("Welcome to the Squares and Cubes table!"); // welcome prompt
		Scanner input = new Scanner(System.in);// to assist w/ user input
		System.out.println();// junkline
		String cont = "y";// counting words in a string

		while (cont.equalsIgnoreCase("y")) { // use while loop so that program only runs while the user continues to
												// enter y || Y

			System.out.println("Please enter an integer: "); // prompt for necessary input
			int num = input.nextInt(); // declare necessary variable

			System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
			System.out.println("======" + "  " + "======" + "  " + "======"); // mainly for organization in the output

			for (int i = 1; i <= num; i++) { // use the for loop so that program will only run up to the number the user
												// input
				int numSquared = (int) Math.pow(i, 2); // Math. method for finding squares and cubes
				int numCubed = (int) Math.pow(i, 3);

				String message = "\n" + i + "         " + numSquared + "         " + numCubed;

				System.out.println(message);
				System.out.println();
			}
			System.out.println("Continue? (y/n): ");
			cont = input.next();
		}

		input.close();
		System.out.println("Thanks for using the Squares and Cubes table. Goodbye.");// end program
	}

}
