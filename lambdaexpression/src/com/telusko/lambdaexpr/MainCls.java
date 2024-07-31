package com.telusko.lambdaexpr;
//functional interface ->interface which have only one abstract method
interface Alpha{
	
	void display();//SAM->Single abstract method
	
	default void show() {
		System.out.println("default method");
	}
	static void m() {
		System.out.println("bye");
	}
}
public class MainCls {

	public static void main(String[] args) {
	
		
//		Alpha a=()->{		
//				System.out.println("hello");
//		};
	
		Alpha a=()-> System.out.println("hello");
        a.display();
//      a.show();
//      Alpha.m();
        
        Alpha a2=()-> System.out.println("good morning");
        a2.display();
        
	}

}
