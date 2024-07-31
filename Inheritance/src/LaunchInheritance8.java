class Ani
{
	int age=4;
}

class Animal1 extends Ani
{
	int age=10;
	
	void show()
	{
		System.out.println("Show of parent");
	}
	
	
}

class Lion extends Animal1
{
	int age=20;
	void show()
	{
		super.show();
		System.out.println(age);
		System.out.println(super.age);
		System.out.println("Show of child");
		//System.out.println(super.super.age);invalid
	}
}

public class LaunchInheritance8 {

	public static void main(String[] args) {
		Lion lion=new Lion();
		lion.show();

	}

}
