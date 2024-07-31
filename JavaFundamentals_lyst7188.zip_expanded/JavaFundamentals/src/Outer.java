
public class Outer {
	
	int x=4;
	class Inner{
		int x=16;
		public void run() {
			int x=64;
			System.out.println(Outer.this.x);
		}
	}
	
	public static void main(String[] args) {
		new Outer().new Inner().run();
	}

}
