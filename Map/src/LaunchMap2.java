import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

interface Alpha
{
	interface Beta
	{
		static void disp()
		{
			System.out.println("Static method in Inner interface disp");
		}
	}
	
}
public class LaunchMap2 {
	
	public static void main(String[] args) 
	{
		//Alpha.Beta.disp();
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Java");//(1, "Java")=Entry --> Map
		hm.put(2, "DSA");//Entry interface is inner interface of Map interface
		hm.put(3, "Spring");
		
		
		String data=hm.get(1);//we can get value based on key
		System.out.println(data);
		System.out.println("*******************");
		
		Collection<String> values = hm.values();
		Iterator<String> itr = values.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("**************************");
		
		Set<Integer> keys = hm.keySet();		
		Iterator<Integer> itr2 = keys.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}		
		System.out.println("**************************");
	
	//	Set<Entry<Integer, String>> entry = hm.entrySet();
		Set entry =  hm.entrySet();
		Iterator itr3 = entry.iterator();
		while(itr3.hasNext()){			
		 Map.Entry pair= (Entry) itr3.next();
		 System.out.println(pair.getKey()+ " "+ pair.getValue());
		 
		}
		System.out.println("**************************");
		Set<Integer> keyss = hm.keySet();		
		Iterator<Integer> itr4 = keyss.iterator();
		while(itr4.hasNext()){
			int key=itr4.next();
			System.out.println(key+"==>"+hm.get(key));
		}	
		

	}

}
