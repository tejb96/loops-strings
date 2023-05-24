
/**
 * @author 
 *
 */
public class NewtonApp {
	
	private InteractiveCLI cli;
	
	public NewtonApp() {
		this.cli = new InteractiveCLI();
	}
	
	public void run() {
		cli.display("*** Calculate Square Root with Newton ***");
		
		cli.prompt("Enter a positive number, e.g. 25.3:");
		double N = cli.getKeyboardDouble();
		
		cli.prompt("Enter a maximum error, e.g. 0.001:");
		double maxErr = cli.getKeyboardDouble();
		
		cli.prompt("Enter an initial guess, e.g. 12.15:");
		double initialGuess = cli.getKeyboardDouble();
		
		NewtonSolver newtonSolve = new NewtonSolver(N, maxErr, initialGuess);
		
		cli.display("The square root of " + N + " is " + newtonSolve.sqrt());
		cli.display("Computed in " + newtonSolve.getIterations() + " iterations");

	}

	public static void main(String[] args) {
		
		NewtonApp app = new NewtonApp();
		app.run();
	}

}
