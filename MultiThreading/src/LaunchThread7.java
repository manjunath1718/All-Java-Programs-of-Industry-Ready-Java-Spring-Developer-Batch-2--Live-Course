class Car implements Runnable{

	@Override
	public void run() {
	
		try
		{
			System.out.println(Thread.currentThread().getName()+ " has entered parking lot");
			Thread.sleep(3000);
			synchronized(this)
			{
				System.out.println(Thread.currentThread().getName() + " got into car to drive");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " started the driving");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " came back and parked the car");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
public class LaunchThread7 {

	public static void main(String[] args) {
		Car car=new Car();

		Thread t1=new Thread(car);
		Thread t2=new Thread(car);
		Thread t3=new Thread(car);
		
		t1.setName("Sudeep");
		t2.setName("Darshan");
		t3.setName("Yash");

		t1.start();
		t2.start();
		t3.start();

	}

}
