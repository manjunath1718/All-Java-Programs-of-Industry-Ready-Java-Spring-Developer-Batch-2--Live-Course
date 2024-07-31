package com.teusko.pkg1;
//functional interface ->interface which have only one abstract method
interface Alpha{
	
	void display();//SAM->Single abstract method
	void show();
}
public class AnonymusClass {
	
	public static void main(String[] args) {
		// implementing  methods through anonymous class
		Alpha a1=new Alpha(){
			@Override
			public void display() {
				System.out.println("hai");
			}

			@Override
			public void show() {
				System.out.println("bye");			
			}
		};
		a1.display();
		a1.show();

		
	}

}
