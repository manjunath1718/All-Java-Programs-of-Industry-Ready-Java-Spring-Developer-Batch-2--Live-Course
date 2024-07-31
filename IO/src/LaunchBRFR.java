import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchBRFR {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br=null;
		try {
			
			File dir=new File("D:\\IO\\FileHandling");
			File file=new File(dir,"java.txt");
			
			fr=new FileReader(file);			
			br=new BufferedReader(fr);
			
			String str = br.readLine();
			while(str!=null) {
				System.out.println(str);
				str=br.readLine();
			}

			
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
