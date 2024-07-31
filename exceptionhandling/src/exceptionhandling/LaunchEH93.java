package exceptionhandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public UnderAgeException(String msg) {
		super(msg);
	}
}
class OverAgeException extends Exception{
	public OverAgeException(String msg) {
		super(msg);
	}
}
class Applicant{
	int age;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
	    age=sc.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException{
		if(age<18) {
			
			UnderAgeException e=new UnderAgeException("You're too young have patience");
			System.out.println(e.getMessage());
			throw e;
		}
		else if(age>60){
			OverAgeException e=new OverAgeException("You're too old Time is near Carefull!");
			System.out.println(e.getMessage());
			throw e;
		}
		else {
			System.out.println("You are elegible! Kindly proceed with License Application");
		}
	}
}
class RTO{
	public void initiate() {
		Applicant a=new Applicant();
		try {
			a.input();
			a.verify();	
		}
		catch(UnderAgeException | OverAgeException e) {
			try {
				a.input();
				a.verify();	
			}
			catch(UnderAgeException | OverAgeException e1) {
				try {
					a.input();
					a.verify();	
				}
				catch(UnderAgeException | OverAgeException e2) {
					System.out.println("You're Blocked From applying further");
				}
			}
		}
		
	}
}
public class LaunchEH93 {

	public static void main(String[] args) {
		System.out.println("Welcome To RTO");
		RTO rto=new RTO();
		rto.initiate();

	}

}
