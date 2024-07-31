import java.util.PriorityQueue;

public class LaunchPQ {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(50);
		pq.add(75);
		pq.add(125);
		pq.add(175);
	//	pq.add(null); object with null data not allowed as it will lead to NullPointerException
		
		
		System.out.println(pq);
	

	}

}
