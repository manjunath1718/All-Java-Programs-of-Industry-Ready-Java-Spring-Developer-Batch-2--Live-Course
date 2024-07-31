

import java.util.Scanner;

public class SimpleInterestCalc {

	double amount;
	int time;
	double rateOfInterest;
	double interest;
	Scanner sc=new Scanner(System.in);
	
	public void simpleInterest() {
		
		System.out.println("Enter Principle Amont");
		amount=sc.nextDouble();
		System.out.println("Enter Time");
		time=sc.nextInt();
		System.out.println("Enter Rate Of Interest");
		rateOfInterest=sc.nextDouble();
		
		interest=amount*time*rateOfInterest/100;
		System.out.println("Simple Interest = "+interest);
		}
	
	public static void main(String[] args) {
		
		
		new SimpleInterestCalc().simpleInterest();
		
		

	}

}
