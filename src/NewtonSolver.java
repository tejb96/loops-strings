
/**
 * A computational class that implements Newton's method for calculating the square root of a number while keeping track of iterations.
 * 
 * @author Tejpreet Bal
 * @version 1.0
 * @Date May 24, 2023
 */
public class NewtonSolver {
	
	private double N;
	private double maxError;
	private int iter;
	private double guess;

	/**
	 * Constructs a NewtonSolver object with the specified number, maximum error, and initial guess.
	 * 
	 * @param number The number to calculate the square root of.
	 * @param maxError The maximum allowable error between two consecutive computations.
	 * @param guess The initial guess for the square root.
	 */
	public NewtonSolver(double N, double maxError, double guess) {
		this.N = N;		
		this.maxError = maxError;
		this.guess = guess;
		this.iter = 0;
	}
	
	/**
	 * Calculates the square root of the specified number using Newton's method.
	 * It iteratively refines the guess until the difference between two consecutive guesses is less than the maximum error.
	 * 
	 * @return The calculated square root of the number.
	 */	
	public double sqrt() {
		double sqrtCalc = 0;
		double err;
		do {
			sqrtCalc = ((N / guess) + guess) / 2;
			err = guess - sqrtCalc;
			guess = sqrtCalc;
			iter++;
		} while (err > maxError);
		return sqrtCalc;
	}
	
	/**
	 * Returns the number of iterations performed to calculate the square root.
	 * 
	 * @return The number of iterations.
	 */
	public int getIterations() {
		return iter;
	}

}
