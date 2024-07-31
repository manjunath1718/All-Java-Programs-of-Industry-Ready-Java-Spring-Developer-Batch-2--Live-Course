
public class Product {
	
	String name;
	double price;
	int quantity;
	
	public Product() {
		
	}
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public Product(double price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}
	public Product(String name) {
		super();
		this.name = name;
	}
		
	public Product(int quantity) {
		super();
		this.quantity = quantity;
	}
	public Product(double price) {
		super();
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public static void main(String[] args) {
		

	}

}
