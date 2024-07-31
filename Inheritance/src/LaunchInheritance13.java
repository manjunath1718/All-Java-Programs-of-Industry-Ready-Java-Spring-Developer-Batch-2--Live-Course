class Alpha2
{
	public static void disp()
	{
		System.out.println("static method in parent class");
	}
}

class Beta2 extends Alpha2
{
	public static void disp()
	{
		System.out.println("static method in child class");
	}
	
}


public class LaunchInheritance13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beta2.disp();

	}

}
