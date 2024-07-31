package com.telusko.lambdaexpr;
interface Alpha3{
	
	int sum(int a,int b);//SAM->Single abstract method
	
}
public class MainCls3 {

	public static void main(String[] args) {
		
//		Alpha3 a3=(a,b)->{ 
//			return a+b;
//		};
		
//		Alpha3 a3=(a,b)->{ return a+b;
//			
//		};
		
		Alpha3 a3=(a,b)->a+b;//we cannot write return statement as 1st line in lambda Expression	
		System.out.println(a3.sum(3, 6));
	
		

	}

}
