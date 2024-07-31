package services;

public class SQL implements Courses 
{

	@Override
	public boolean getTheCourse(double amount) 
	{
		System.out.println("SQL course purchased and amount paid is "+ amount);
		return true;
	}

}
