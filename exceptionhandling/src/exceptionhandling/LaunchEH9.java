package exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

class Parent1{
	public void eat() throws ArithmeticException
	{
		//
		//
	}

}
class Child extends Parent1{
//	public void eat() throws ArithmeticException //valid
//	{
//		//
//		//
//	}
//	public void eat() //valid
	{
		//
		//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter a value");
		int b=sc.nextInt();
		System.out.println(a/b);
	}

//	public void eat() throws IOException//Invalid
//	{
//		//
//		//
//	}
}
public class LaunchEH9 {

	public static void main(String[] args) {
		Parent1 c=new Child();
		try {
			c.eat();
		}catch(ArithmeticException e){
			System.out.println("handled");
		}
		

	}

}
