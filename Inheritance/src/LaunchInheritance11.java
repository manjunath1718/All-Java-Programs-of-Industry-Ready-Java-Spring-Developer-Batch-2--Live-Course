abstract class Animal2
{
	int age;
	//abstract double avg;CE
	
	public Animal2()
	{
		System.out.println("Constructor of parent abstract class");
	}
	public abstract void eat();
	public void sleep()
	{
		System.out.println("Animal needs to sleep");
	}
}
class Tiger1 extends Animal2
{
	public void eat()
	{
		System.out.println("Tiger hunts and  eats a lot");
	}
}

class Monkey extends Animal2
{
	public void eat()
	{
		System.out.println("Monkey steals and  eats a lot");
	}
}

class Deer extends Animal2
{
	public void eat()
	{
		System.out.println("Deer grazes eats a lot");
	}
}

class Forest
{
	public void permit(Animal2 ref)
	{
		ref.eat();//1:M
	}
}


public class LaunchInheritance11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger1 t=new Tiger1();
		Monkey m=new Monkey();
		Deer d=new Deer();
		
		Forest f=new Forest();
		f.permit(t);
		f.permit(m);
		f.permit(d);
		
	//	Animal2 animal=new Animal2();
		
		

	}

}
