class Animal //extends Object
{
	private int age;
	
	 void eat()
	{
		System.out.println("Animal eats a lot");
	}
}

class Tiger extends Animal
{
	
//	void eat()
//	{
//		//age=4;CE
//		//System.out.println("Tiger hunts and eats and age is "+ age);
//	}
}

class Dog extends Animal
{
	
}

class AeroPlane2 //exetnds Object
{
	
}

class Cub extends Tiger 
{
	void eat()
	{
		System.out.println("eat method in child");
	}
}

//class Cub extends Tiger extends AeroPlane2
//{
//	
//}

public class LaunchInher3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal tiger=new Tiger();
		
		tiger.eat();
		
		
		Animal c=new Cub();
		c.eat();
		
		

	}

}
