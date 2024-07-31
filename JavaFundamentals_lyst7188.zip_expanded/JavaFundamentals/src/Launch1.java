
class Demo{
	int i=5;
	void disp() {
		System.out.println("hi");
	}
}
public class Launch1 extends Demo {

	
	void disp() {
		
		System.out.println(super.i);
		i=8;
		System.out.println(i);
		super.disp();
		System.out.println("hi good morning");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=17;
		
		System.out.println("age");//age
		System.out.println(age);//17
		Launch1 l=new Launch1();
		l.disp();
		
		
		
		
	}

}
