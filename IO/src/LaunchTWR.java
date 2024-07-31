import java.io.File;
import java.io.FileWriter;


class Student implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("close method internally gets called if we create instance in try with resources block");
		
	}	
	
}
public class LaunchTWR {

	public static void main(String[] args) {
		
		File dir=new File("D:\\IO\\FileHandling");
		File file=new File(dir,"java.txt");
		try(Student std=new Student();FileWriter fw=new FileWriter(file))
		{
			fw.write("Java");
			fw.write(65);//A
			char ch[]= {'S','p','r','i','g'};
			fw.write(ch);
		
			System.out.println("kindly check file in specified location to see outcome");
		}
		 
//		try (FileWriter fw=new FileWriter(file))
//		{				
//			fw.write("Java");
//			fw.write(65);//A
//			char ch[]= {'S','p','r','i','g'};
//			fw.write(ch);
//		
//			System.out.println("kindly check file in specified location to see outcome");
//		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		

	}

}
