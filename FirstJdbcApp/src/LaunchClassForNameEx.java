import java.sql.DriverManager;
import java.sql.SQLException;

public class LaunchClassForNameEx {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
	//	Demo d=new Demo();//static block /Instance Block ==> non-static block
		
		Class.forName("Demo");//static block
		
	//	Class.forName("Demo").newInstance();//static block /Instance Block ==> non-static block
		
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		
	//	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//this is present in static block of Driver class

	}
	

}
class Demo{
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Instance Block ==> non-static block");
	}
	
}
