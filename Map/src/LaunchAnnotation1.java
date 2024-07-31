
class Animal
{
	public void animalUsuallyHuntsAndEat()
	{
		System.out.println("Animal is eating");
	}
}

class Tiger extends Animal
{
	//Overriding parents class method to suite child class need
	@Override //here we are informing compiler that we are overriding method of parent class
	public void animalUsuallyHuntsAndEat()
	{
		System.out.println("Tiger hunts and eat");
	}
}
public class LaunchAnnotation1 {

	//Its  main method which is starting point of application
	public static void main(String[] args) {

		//creating a var to store age data; //here we are informing to developer through comments
		//int age=18;
		Animal t=new Tiger();
		t.animalUsuallyHuntsAndEat();


	}

}
