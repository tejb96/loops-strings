
/**
 * Class representing command-line interface to compute 
 * the square root and returns the number of iterations it took
 * .
 * @author Tejpreet Bal
 * @version 1.0
 * @Date May 24, 2023
 *
 */
public class NewtonApp {
	
	private InteractiveCLI cli;
	
	/**
	 * Initializes the command line interface by Constructing a NewtonApp object.
	 */
	public NewtonApp() {
		this.cli = new InteractiveCLI();
	}
	
	/**
	 * Prompts the user for input, performs the square root calculation using Newton's method,
	 * and displays the result and number of iterations.
	 */
	public void run() {
		cli.display("*** Calculate Square Root with Newton ***");
		
		cli.prompt("Enter a positive number, e.g. 25.3:");
		double N = cli.getKeyboardDouble();
		
		cli.prompt("Enter a maximum error, e.g. 0.001:");
		double maxErr = cli.getKeyboardDouble();
		
		cli.prompt("Enter an initial guess, e.g. 12.15:");
		double initialGuess = cli.getKeyboardDouble();
		
		cli.display("You entered number = " + N + " error = " + maxErr + " initial guess = " + initialGuess);
		
		NewtonSolver newtonSolve = new NewtonSolver(N, maxErr, initialGuess);
		
		cli.display('\n' + "The square root of " + N + " is " + '\n' + newtonSolve.sqrt());
		cli.display('\n' + "Computed in " + newtonSolve.getIterations() + " iterations");
	}

	
	/**
	 * The main method that starts the application.
	 * Creates a NewtonApp object and runs the application.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		
		NewtonApp app = new NewtonApp();
		app.run();
	}

}
