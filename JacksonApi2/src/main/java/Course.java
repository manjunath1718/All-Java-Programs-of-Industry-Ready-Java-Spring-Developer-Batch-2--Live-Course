import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Course {

	Integer cid;
	String cname;
//	String instructorName;
//	Double price;
	
	public Course() {
		
	}
//	public Course(Integer cid, String cname, String instructorName, Double price) {
//		super();
//		this.cid = cid;
//		this.cname = cname;
//		this.instructorName = instructorName;
//		this.price = price;
//	}
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
//	public String getInstructorName() {
//		return instructorName;
//	}
//	public void setInstructorName(String instructorName) {
//		this.instructorName = instructorName;
//	}
//	public Double getPrice() {
//		return price;
//	}
//	public void setPrice(Double price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Course [cid=" + cid + ", cname=" + cname + ", instructorName=" + instructorName + ", price=" + price
//				+ "]";
//	}
	
	
	
}