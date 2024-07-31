package com.telusko.javafundamentals;
interface Demo1111{
	void sum(int a,int b);
	void sub(int a,int b);
}
interface Demo2222{
	void sum(int a,int b);
}
//one interface can extends many interfaces
interface Demo3333 extends Demo2222, Demo1111{
	void sum(int a,int b);
}
public class Greet implements  Demo3333{

	public static void main(String[] args) {
		
		System.out.println("hello");
		Greet g=new Greet();
		g.sum(2, 3);
		g.sub(9, 8);

	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	

}
