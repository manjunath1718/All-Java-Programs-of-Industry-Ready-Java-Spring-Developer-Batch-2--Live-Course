package com.telusko.lambdaexpr;
interface Alpha4{
	
	float sum(float a,int b);//SAM->Single abstract method
	
}
public class MainCls4 {

	public static void main(String[] args) {
		
		Alpha4 a1=(a,b)-> a+b;
		  
		System.out.println(a1.sum( (float) 5.5, 4));

	}

}
