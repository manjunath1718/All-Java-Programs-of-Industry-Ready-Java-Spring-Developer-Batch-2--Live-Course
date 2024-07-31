import services.SpringBoot;

public class LaunchApp 
{

	public static void main(String[] args) 
	{
		Telusko t=new Telusko();//target object
		
		//dependency injection
		t.setCourse(new SpringBoot());//dependent obkcet
		boolean status=t.buyTheCourse(444.4);
		if(status)
			System.out.println("Course purchased");
		else
			System.out.println("Failed to get the course");

	}

}
