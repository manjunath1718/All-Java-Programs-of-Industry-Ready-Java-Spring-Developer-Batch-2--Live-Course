class MSWord extends Thread{

	@Override
	public void run(){
		String name=Thread.currentThread().getName();
		try {
			if(name.equals("TYPE")) {

				typing();
			}
			else if(name.equals("SPELLCHECK")){
				
				spellingCheck();
				
			}
			else {
				
				saving();		
			}
		}catch(Exception e) {
			
		}
		
	}
	public void typing() throws InterruptedException {

		for(int i=0;i<4;i++) {
			System.out.println("Typing....");
			Thread.sleep(3000);
		}
	}
	public void spellingCheck() throws InterruptedException {

		for(;;) {
			System.out.println("Spelling Check......");
			Thread.sleep(3000);
		}
	}
	public void saving() throws InterruptedException {

		for(;;) {
			System.out.println("Saving..............");
			Thread.sleep(3000);
		}
	}


}
public class LaunchThread92 {

	public static void main(String[] args) {

		MSWord t1=new MSWord();
		MSWord t2=new MSWord();
		MSWord t3=new MSWord();

		t1.setName("TYPE");
		t2.setName("SPELLCHECK");
		t3.setName("SAVE");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(3);
		t3.setPriority(4); 
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		

	}

}
