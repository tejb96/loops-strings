
/**
 * @author 
 *
 */
public class NewtonSolver {
	
	private double N;
	private double maxError;
	private int iter = 0;
	private double guess;

	
	public NewtonSolver(double N, double maxError, double guess) {
		this.N = N;		
		this.maxError = maxError;
		this.guess = guess;
	}
	
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
	
	public int getIterations() {
		return iter;
	}

}
