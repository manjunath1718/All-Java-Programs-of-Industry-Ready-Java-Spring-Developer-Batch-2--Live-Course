package exceptionhandling;

import java.io.IOException;

//class Parent
//{
//	public void eat()
//	{
//		//
//		//
//	}
//
//}
//class Child1 extends Parent
//{
////	public void eat()throws ArithmeticException  //valid
////	{
////		//
////		// valid
////	}
////	public void eat()throws IOException  //invalid
////	{
////		//
////		// Invalid
////	}
//	
//	//if method in parent doesn;t throw an exception then overrding method in child class can throw unchecked exception but not chekced exception
//	
//}

////////////////////////////////////////////////////////////
//class Parent
//{
//	public void eat() throws ArithmeticException
//	{
//		//
//		//
//	}
//
//}
//class Child extends Parent
//{
////	public void eat() throws ArithmeticException //valid
////	{
////		//
////		//
//////	}
////	public void eat() //valid
////	{
////		//
////		//
////	}
////	}
//	public void eat() throws IOException
//	{
//		//
//		//
//	}
//}
class Parent
{
	public void eat() throws IOException
	{
		//
		//
	}

}
class Child1 extends Parent
{


//	public void eat() throws IOException //valid
//	{
//		//
//		//
//	}
	
//	public void eat() //valid 
//	{
//		//
//		//
//	}
	public void eat() throws ArithmeticException
	{
		//
		//
	}
}
public class LaunchEH8 {

	public static void main(String[] args) {
		

	}

}
