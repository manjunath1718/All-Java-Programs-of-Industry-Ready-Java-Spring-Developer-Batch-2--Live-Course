import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Employees {
	
	int id;
	String name;
	double sal;

	public Employees(int id, String name, double sal) {
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

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
public class LaunchRawDataFW {

	public static void main(String[] args) {
		
		Employees emps = new Employees(1,"raj",50000);
		emps.display();
		
		FileWriter fw = null;
		try {
			
			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			fw=new FileWriter(file);
			fw.write(emps.toString());
		    
			fw.write("\n Java");
			fw.write(65);//A
			char ch[]= {'S','p','r','i','g'};
			fw.write(ch);
		
			System.out.println("kindly check file in specified location to see outcome");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
