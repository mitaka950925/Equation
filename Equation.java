package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Equation implements Solvable {
	private double[] coeficients;
	private double[] solutions;
	private Scanner scan;

	public abstract void solve();
	public abstract void printSolution();
	public abstract void getUserInput();

	public double[] getCoeficients() {
		return coeficients;
	}
		
	
	
	
	public void setCoeficients(double[] coefficients) {
		

		this.coeficients=coefficients;

	}
	
	
	

	
	
	public double[] getSolutions() {
		return solutions;
	}
	public void setSolutions(double[] solutions) {
		this.solutions = solutions;
	}

}