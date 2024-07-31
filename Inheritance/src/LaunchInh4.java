//class Demo1 extends Demo2
//{
//	
//}
//
//class Demo2 extends Demo1
//{
//	
//} cyclic Inheritance

class Demo11 
{
	
	static int a=3;
	final static void disp() {
		System.out.println("aaaaaaaaaaa");
	}
	
}

class Demo22 extends Demo11
{
	
//	static void disp() {
//		System.out.println("bbbbbbbbbbbb");
//	}
	
//	 void disp() {
//		System.out.println("aaaaaaaaaaa");
//	}
	
} 
public class LaunchInh4 
{

	public static void main(String[] args) 
	{
		
		Demo22 d=new Demo22();
		d.disp();
		System.out.println(Demo22.a);
	}

}
