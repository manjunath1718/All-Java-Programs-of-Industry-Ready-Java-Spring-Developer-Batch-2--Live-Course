import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFS {

	public static void main(String[] args) {
		CopyOnWriteArrayList list=new CopyOnWriteArrayList();
		list.add(100);
		list.add(50);
		list.add(150);
		list.add(25);
		list.add(125);
		
		System.out.println(list);
		
		
//		for(Object i:list){
//			Integer data=(Integer)i;
//			System.out.println(data);
//			list.add(44);// if we try to modify ArrayList it will lead not to ConcurrentModificationException
//		}//Fail safe
//		System.out.println(list);
		
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add(44);// if we try to modify list it will not lead to ConcurrentModificationException
		}//Fail safe
		//System.out.println(list);//[100, 50, 150, 25, 125, 44, 44, 44, 44, 44]

	}

}
