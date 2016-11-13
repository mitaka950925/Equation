package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEquation {


	public static void main(String[] args) {
		System.out.println("Enter 1 for Quadratic and 2 for Linear");
		Scanner scan=new Scanner(System.in);
		int a = 0;
			try {
				a=scan.nextInt();
			if (a!=1&&a!=2)
				throw new IllegalCoeficientException();
			}
			
			catch(IllegalCoeficientException c){
				System.out.println("Enter 1 or 2!");
			}
			catch(InputMismatchException e){
				System.out.println("Enter a number!");
			}
		
			
			
			if(a==1){
				QuadraticEquation q=new QuadraticEquation();
				q.getUserInput();
				q.solve();
				q.printSolution();
				
			}
			else{
				LinearEquation q=new LinearEquation();
				q.getUserInput();
				q.solve();
				q.printSolution();
			}

	}
}