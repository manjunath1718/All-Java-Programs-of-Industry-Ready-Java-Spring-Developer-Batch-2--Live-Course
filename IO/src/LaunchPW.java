import java.io.File;

import java.io.PrintWriter;

public class LaunchPW {

	public static void main(String[] args) {
		
		PrintWriter pw = null;
		try {
			
			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			
			pw=new PrintWriter(file);
			
			pw.println("java");
			pw.println(65);//65
			pw.println(65.65);
			pw.println('A');
			
			System.out.println("kindly check file in specified location to see outcome");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			pw.close();
		}
		

	}

}
