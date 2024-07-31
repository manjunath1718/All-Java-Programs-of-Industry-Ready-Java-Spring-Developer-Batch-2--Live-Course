package services;

public class SpringBoot implements Courses 
{

	@Override
	public boolean getTheCourse(double amount) 
	{
		System.out.println("SpringBoot course purchased and amount paid is "+ amount);
		return true;
	}

}
