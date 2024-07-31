import java.io.File;
import java.io.IOException;

public class LaunchFile1 {

	public static void main(String[] args) {
		
		
		try {
			
			File f1=new File("D:\\IO\\FileHandling\\java.txt");			
//			System.out.println(f1.exists());//false			
			System.out.println(f1.createNewFile());//true => if file is already present it will not create new file
			System.out.println(f1.exists());//true			
			System.out.println(f1.isFile());//true
			System.out.println(f1.isDirectory());//false
			System.out.println(f1.getPath());
			
			File f2=new File("D:\\IO\\FileHandling\\telusko");	
	    	System.out.println(f2.mkdir());	
	    	System.out.println("****************************************");
	    	
	    	File f3=new File("D:\\weekdayspring");	
	    	String[] str = f3.list();
	    	int count = 0;
	    	for(String s:str) {
	    		count++;
	    		System.out.println(s);
	    	}
	    	System.out.println("Number of files in specified path "+count);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
