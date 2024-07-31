import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBWFW {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw=null;
		try {
			
			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			bw.write("Alien");
			bw.newLine();
			bw.write(66);//B
			bw.write(" CI/CD pipelines/jenkins");
			
//			bw.flush();//even if we don't flush it works fine
			
			System.out.println("kindly check file in specified location to see outcome");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			try {
				bw.close();
				fw.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
