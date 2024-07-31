import java.io.File;
import java.io.FileReader;

import java.io.IOException;


public class LaunchFR {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			
			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			fr=new FileReader(file);
			
//			int data = fr.read();
//			while(data!=-1) {
//				System.out.println(data+"--->"+(char)data);
//				data=fr.read();
//			}
			
			long size=file.length();
			char[] ch=new char[(int)size];
			fr.read(ch);			
			for(char c:ch) {
	    		
	    		System.out.print(c);
	    	}
			
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		

	}

}
