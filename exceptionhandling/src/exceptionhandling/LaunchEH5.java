package exceptionhandling;

import java.util.Scanner;

class Alpha1{
	public void beta() throws Exception{	
		System.out.println("Application started");
		Scanner scan=new Scanner(System.in);
		try{
			System.out.println("Please enter the numerator to divide");
			int n1=scan.nextInt();
			System.out.println("please enter the denominator to divide");
			int n2=scan.nextInt();

			int res=n1/n2;

			System.out.println("Result is : "+res);
		}
		catch(Exception e){
			System.out.println("Exception is handled in alpha class beta method only");
			try {
				throw e;//throw is used to invoke exception
			}catch(Exception e1) {
				System.out.println("invoked exception handled");
			}
			
		}
		finally{
			System.out.println("Application terminated smoothly ---> finally");
		}

	}
}
public class LaunchEH5 {

	public static void main(String[] args) {

		System.out.println("Main method app started");

		Alpha1 a=new Alpha1();
		try{
			a.beta();
		}
		catch(Exception e){
			System.out.println("Exception caught at main");
		}
		System.out.println("main method concluded");
	}

}
