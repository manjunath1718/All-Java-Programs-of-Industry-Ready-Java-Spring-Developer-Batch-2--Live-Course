import java.util.LinkedList;

public class LaunchLL01 {

	public static void main(String[] args) {
		
		LinkedList ll1=new LinkedList();
		ll1.add(100);
		ll1.add("Java");
		ll1.add(200);
		System.out.println(ll1); //[100, Java, 200]
		ll1.addFirst(44);
		ll1.add(2, 54);
		System.out.println(ll1); //[44, 100, 54, Java, 200]
		ll1.add(54);
		System.out.println(ll1); //[44, 100, 54, Java, 200, 54]
		ll1.add(null);
		System.out.println(ll1); //[44, 100, 54, Java, 200, 54, null]
		System.out.println("**************************************************");
		LinkedList ll2=new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add(300);
		ll2.add(400);
		System.out.println(ll2); //[100, 200, 300, 400]
		ll2.offer(44);//if we use offer data may be get added or rejected
		System.out.println(ll2); //[100, 200, 300, 400, 44]
		ll2.offerFirst(54);
		System.out.println(ll2); //[54, 100, 200, 300, 400, 44]
		System.out.println(ll2.peek()); //54
		System.out.println(ll2); //[54, 100, 200, 300, 400, 44]
		System.out.println(ll2.poll()); //54
		System.out.println(ll2); //[100, 200, 300, 400, 44]
		
		ll2.push(444);
		System.out.println(ll2); //[444, 100, 200, 300, 400, 44]
		System.out.println(ll2.pop()); //444
		System.out.println(ll2); //[100, 200, 300, 400, 44]
		
		
	}

}
