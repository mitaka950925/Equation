package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;


public class QuadraticEquation extends Equation {
Scanner scan=new Scanner(System.in);
double D;


public double getD() {
	return D;
}

public void setD(double d) {
	D = d;
}

public void getUserInput(){
		double coefficients[]=new double[5];
		boolean result=false;
		do{
			try{
				scan = new Scanner(System.in);
				System.out.println("Enter the coefficient before x^2: ");
				coefficients[0]=scan.nextDouble();
				if(coefficients[0]==0) throw new IllegalCoeficientException();
				System.out.println("Enter the coefficient before x: ");
				coefficients[1]=scan.nextDouble();
				System.out.println("Enter the free coefficient: ");
				coefficients[2]=scan.nextDouble();
				
				result=true;
			}
			catch(InputMismatchException  e){
				System.out.println("You didnt enter a number!!!");

			}
			catch(IllegalCoeficientException e){
				System.out.println("You cant enter 0 as the first coefficient");
			}
		}
		while(!result);
		setCoeficients(coefficients);
	}

	@Override
	public void solve() {
		double a=getCoeficients()[0];
		double b=getCoeficients()[1];
		double c=getCoeficients()[2];
		double[] sol=new double[3];
		double x1, x2;
		setD(b*b-4*a*c);

		
			x1=(-b+Math.sqrt(D))/2*a;
			x2=(-b-Math.sqrt(D))/2*a;
			sol[0]=x1;
			sol[1]=x2;
			setSolutions(sol);
			
		}

	

	@Override
	public void printSolution() {
if(getD()<0){
	System.out.println(" There are no real solutions");
	
}
else if (getD()==0){
System.out.println("X is equal to:"+getSolutions()[0]);
}
else{
	System.out.println("X1 is equal to:"+getSolutions()[0]);
	System.out.println("X2 is equal to:"+getSolutions()[1]);
	}
	
		
	}




}