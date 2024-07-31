import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class Employee implements Serializable
{

	/**
	 * if class is not present serialVersionUID = 1L has to be there
	 */
//	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double sal;
//    transient double sal; it will not participate in writing the data in file
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void display() {
		System.out.println("Id->"+id);
		System.out.println("Name->"+name);
		System.out.println("Salary->"+ sal);
	}
	
	
}
public class LaunchSerDSer {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1,"raj",50000);
		emp1.display();

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
//		FileInputStream fis = null;
//		BufferedInputStream bis = null;
//		ObjectInputStream ois = null;
		try {

			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			oos=new ObjectOutputStream(bos);
			oos.writeObject(emp1);
			

//		    fis=new FileInputStream(file);
//			bis=new BufferedInputStream(fis);
//			ois= new ObjectInputStream(bis);
//			Employee emp1 = (Employee) ois.readObject();
//			emp1.display();	
			
			

			System.out.println("kindly check file in specified location to see outcome");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				
//				ois.close();
//				bis.close();
//				fis.close();
				
			} catch (IOException e) {
				System.out.println("Some problem");
			}
		}



	}

}
