import java.util.Scanner;

class Shape{

	public void area() {

	}
	public void perimeter() {

	}

}
class Circle extends Shape{
	static final double PI=3.14;
	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		
		System.out.println("Enter Radius of Circle");
		double r=sc.nextDouble();
		System.out.println("Area  of Circle = "+PI*r*r);

	}
	
	public void perimeter() {
		
		System.out.println("Enter Radius of Circle");
		double r=sc.nextDouble();
		System.out.println("Perimeter  of Circle = "+2*PI*r);


	}
	

}
class Rectangle extends Shape{
	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		
		System.out.println("Enter Length of Rectangle");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth of Rectangle");
		double b=sc.nextDouble();
		System.out.println("Area  of Rectangle = "+l*b);

	}
	
	public void perimeter() {
		

		System.out.println("Enter Length of Rectangle");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth of Rectangle");
		double b=sc.nextDouble();
		System.out.println("Perimeter  of Rectangle = "+2*(l+b));


	}
	
}
public class AreaPerimeter1 {

	public static void main(String[] args) {

		Shape r1=new Rectangle();
		r1.perimeter();
		r1.area();
		
		Shape c1=new Circle();
		c1.perimeter();
		c1.area();
		
		

	}

}
