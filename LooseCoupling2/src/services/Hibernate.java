package services;

public class Hibernate implements Courses 
{

	@Override
	public boolean getTheCourse(double amount) 
	{
		System.out.println("Hibernate course purchased and amount paid is "+ amount);
		return true;
	}

}
