class Producer extends Thread{

	Queue que;
	int i=0;
	Producer(Queue que){
		this.que=que;
	}

	@Override
	public void run(){
		while(true) {
			que.produce(i++);
		}
	}
}
class Consumer extends Thread{

	Queue que;
	Consumer(Queue que){
		this.que=que;
	}
	@Override
	public void run(){
		while(true) {
			que.consume();
		}
	}
}
class Queue{

	int data;
	boolean flag=false;
	synchronized public void produce(int value)  {
		
		try {
			if(flag==true) {
				System.out.println("Production in waiting state");
				wait();
			}
			else {
				data=value;
				System.out.println("Producer produce data "+data);
				flag=true;
				notify();
			}
		} catch (Exception e) {

			System.out.println("");
		}
	}
	synchronized public void consume()  {
		try {
			if(flag==false) {
				System.out.println("consumption in waiting state");
				wait();
			}
			else {
				System.out.println("Consumer Consume data "+data);
				flag=false;
				notify();
			}
		} catch (Exception e) {
			
			System.out.println("");
		}
	}
}


public class LaunchThread93 {

	public static void main(String[] args) {

		Queue q=new Queue();

		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);
		
		producer.setName("ProdThread");
		consumer.setName("ConsThread");

		producer.start();
		consumer.start();

	}

}
