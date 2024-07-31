import java.util.Scanner;

class Farmer{
	
	float pa;
	float td;
	float si;
	
	static float ri;
	
	static
	{
		ri=2.5f;
	}
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the loan amount required: ");
		pa=scan.nextFloat();
		
		System.out.println("Please enter the time duration required: ");
		td=scan.nextFloat();
	}
	
	void compute()
	{
		si=pa*td*ri/100.0f;
	}
	
	void disp()
	{
		System.out.println("The SI is : "+ si);
	}
}
public class LaunchStaticApplication {

	public static void main(String[] args) 
	{
		System.out.println("Farmer1:");
		Farmer f1=new Farmer();
		f1.input();
		f1.compute();
		f1.disp();
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Farmer2:");
		Farmer f2=new Farmer();
		f2.input();
		f2.compute();
		f2.disp();
		
		System.out.println();
		System.out.println("*******************************");
		
		System.out.println("Farmer3:");
		Farmer f3=new Farmer();
		f3.input();
		f3.compute();
		f3.disp();

	}

}
