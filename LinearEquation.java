package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  LinearEquation extends  QuadraticEquation {

	private Scanner scan;
	
	
	public void getUserInput(){
		double coefficients[]=new double[5];
		boolean result=false;
		do{
			try{
				scan = new Scanner(System.in);
				System.out.println("Enter the coefficient before x: ");
				coefficients[0]=scan.nextDouble();
				System.out.println("Enter the free coefficient: ");
				coefficients[1]=scan.nextDouble();
				
				result=true;
			}
			catch(InputMismatchException  e){
				System.out.println("You didnt enter a number!!!");

			}
		}
		while(!result);
		setCoeficients(coefficients);
	}
	
	@Override
	public void solve() {
		double a=getCoeficients()[0];
		double b=getCoeficients()[1];
		scan = new Scanner(System.in);
		boolean result=false;
		do{
			try{
				if(a==0) throw new IllegalCoeficientException();
				result=true;
			} catch(IllegalCoeficientException exc){
				System.out.println("Your equation is not linear");
				System.out.println("Enter a new coefficient before x: ");
				a=scan.nextDouble();

			}}
		while(!result);
		double[] solution=new double[1];
		solution[0]=(-b)/a;
		setSolutions(solution);

	}

	@Override
	public void printSolution() {
		System.out.println("The answer to the Linear equation is: " + getSolutions()[0]);
	}










}