//WAP to count number of object/instances created

class Gamma
{
	static int count;
	
	
	
	{
		count++;
	}
	
    Gamma()
    {
    	
    }
    
    Gamma(int a)
    {
    	
    }
    
    Gamma(int a, int y)
    {
    	
    }
    

}
public class LaunchStatic5  {
	
	public static void main(String[] args) 
	{
		Gamma g1=new Gamma();
		System.out.println("Number of objects created : "+Gamma.count);
		
		Gamma g2=new Gamma(10);
		System.out.println("Number of objects created : "+Gamma.count);
		
		Gamma g3=new Gamma(1, 2);
		System.out.println("Number of objects created : "+Gamma.count);
		
	}

}
