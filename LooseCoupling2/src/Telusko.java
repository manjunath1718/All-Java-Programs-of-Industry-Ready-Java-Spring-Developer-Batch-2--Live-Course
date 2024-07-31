import services.Courses;

public class Telusko 
{
	
	private Courses course;
	
	
	public void setCourse(Courses course)//Courses courses=new SQL();
	{
		this.course = course;
	}


	boolean buyTheCourse(double amount)
	{
		return course.getTheCourse(amount);
		
	}

}
