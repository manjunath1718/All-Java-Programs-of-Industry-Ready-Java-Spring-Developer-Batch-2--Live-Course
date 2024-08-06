
public class Alien {

	Integer id;
	String name;
	String city;
	
	
	public Alien(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
