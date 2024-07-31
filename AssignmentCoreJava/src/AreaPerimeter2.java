import java.util.Scanner;

interface Shapes{

	public void area();
	public void perimeter();

}
class Traingle implements Shapes{
	public static final double PI=3.14;
	double base;
	double height;
	double side1;
	double side2;
	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		
		System.out.println("Enter height of Traingle");
		height=sc.nextDouble();
		System.out.println("Enter base of Traingle");
		base=sc.nextDouble();
		System.out.println("Area  of Traingle = "+0.5*height*base);

	}
	
	public void perimeter() {
		System.out.println("Enter Side1 of Traingle");
		side1=sc.nextDouble();
		System.out.println("Enter Side2 of Traingle");
		side2=sc.nextDouble();
		System.out.println("Enter base of Traingle");
		base=sc.nextDouble();
		System.out.println("Perimeter  of Circle = "+(side1+side2+base));


	}
	

}
class Square implements Shapes{
	double side;
	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		
		System.out.println("Enter  Length of Side");
		double side=sc.nextDouble();
		
		System.out.println("Area  of Square = "+side*side);

	}
	
	public void perimeter() {
		

		System.out.println("Enter  Length of Side");
		double side=sc.nextDouble();
		
		System.out.println("perimeter  of Square = "+4*side);


	}
	
}
public class AreaPerimeter2 {

	public static void main(String[] args) {
		
		Square s=new Square();
		s.area();
		s.perimeter();
		
		Traingle t=new Traingle();
		t.area();
		t.perimeter();
		

	}

}
