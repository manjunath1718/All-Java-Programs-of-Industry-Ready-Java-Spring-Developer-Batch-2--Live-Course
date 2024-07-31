package com.telusko.lambdaexpr;
interface Alpha2{

	void sum(int a);//SAM->Single abstract method

}
public class MainCls2 {

	public static void main(String[] args) {

		//		Alpha2 a21=(int a)->{
		//			
		//			System.out.println(a);
		//		};
		//         a21.sum(3);

		//		Alpha2 a21=(a)->System.out.println(a);
		//		a21.sum(3);

//		Alpha2 a21=(a)->System.out.println(a);
//		a21.sum(3);

		Alpha2 a21=a->System.out.println(a);
		a21.sum(3);

		
	}

}
