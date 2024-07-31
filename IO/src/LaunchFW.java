import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFW {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			
			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			fw=new FileWriter(file);
			
			fw.write("Java");
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
