

import java.util.Scanner;

public class Calculator {

	public static  void addition(double n1,double n2) {

		System.out.println("Sum="+(n1+n2));

	}

	public static void substraction(double n1,double n2) {

		System.out.println("Difference="+(n1-n2));

	}

	public static  void multiplication(double n1,double n2) {

		System.out.println("Product="+(n1*n2));
	}

	public static  void division(double n1,double n2) {

		if(n2==0) {
			try {
				throw new ArithmeticException("Can't able to divide number by zero");
			}catch(ArithmeticException e) {
                   System.out.println(e.getMessage()); 
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}else {
			System.out.println("Div="+(n1/n2));
		}

	}

	public static void main(String[] args) {

		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("1:Press 1 to Addition");
			System.out.println("2:Press 2 to Substraction");
			System.out.println("3:Press 3 to Multiplication");
			System.out.println("4:Press 4 to Division");
			System.out.println("5:Press 6 to Exit");

			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			System.out.println("=========================================");
			double number1 = 0;
			double number2 = 0;


			if(choice==1 ||choice==2 ||choice==3 ||choice==4) {
				System.out.println("Enter number1");
				number1=sc.nextDouble();
				System.out.println("Enter number2");
				number2=sc.nextDouble();


			}

			switch(choice) {

			case 1->addition(number1,number2);
			case 2->substraction(number1, number2);
			case 3->multiplication(number1, number2);
			case 4->division(number1, number2);
			case 5->System.exit(0);
			default->System.out.println("Invalid Choice");

			}

		}

	}

}
