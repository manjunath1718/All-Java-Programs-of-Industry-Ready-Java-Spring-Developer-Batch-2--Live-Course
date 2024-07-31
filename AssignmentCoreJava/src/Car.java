

public class Car {
	
	String name;
	String model;
	int year;

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.setName("Hyundai");
		c1.setModel("Creta");
		c1.setYear(2023);
		Car c2=new Car();
		c2.setName("MG");
		c2.setModel("Hector");
		c2.setYear(2022);
		
		System.out.println("Car-1 Name "+c1.getName());
		System.out.println("Car-1 Model "+c1.getModel());
		System.out.println("Car-1 MFG Year "+c1.getYear());
		
		System.out.println("Car-2 Name "+c2.getName());
		System.out.println("Car-2 Model "+c2.getModel());
		System.out.println("Car-2 MFG Year "+c2.getYear());

	}

}
