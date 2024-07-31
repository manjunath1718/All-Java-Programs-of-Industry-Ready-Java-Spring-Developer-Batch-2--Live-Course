import java.util.List;

class Product{
	
	int pId;
	String pName;
	double pPrice;
	String pCategory;
	public Product() {
		System.out.println("Zero param constructor");
	}
	public Product(int pId, String pName, double pPrice, String pCategory) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pCategory=" + pCategory + "]";
	}
	
	
}
public class LaunchApp3 {

	public static void main(String[] args) {
				
		Product p1=new Product(1,"parleG",5,"grocery");
		Product p2=new Product(2,"LP-Shirt",3000,"Fashion");
		Product p3=new Product(3,"JeansPant",5,"Fashion");
		Product p4=new Product(4,"orio",5,"grocery");
		Product p5=new Product(5,"RolexWatch",8000,"electronics");
		Product p6=new Product(6,"studytable",8000,"furniture");
		Product p7=new Product(7,"HeadPhone",800,"electronics");
		Product p8=new Product(8,"EarBuds",1000,"electronics");
		Product p9=new Product(9,"pencil",5,"stationary");
		Product p10=new Product(10,"SamsungM21",15000,"electronics");
		
		List<Product> products=List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		
		System.out.println("***********Electronic Products************");
		products.stream().filter(p->p.getpCategory().equals("electronics"))
		                 .forEach(p->System.out.println(p));

		System.out.println("***********Products having price more than 100************");

		products.stream().filter(p->p.getpPrice()>1000)
		                 .forEach(p->System.out.println(p));
		
	}

}
