import java.util.Scanner;

class Employee{
	int eId;
	String eName;
	double hourlyRate;

	public Employee() {

	}
	public Employee(int eId, String eName, double hourlyRate) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.hourlyRate = hourlyRate;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", hourlyRate=" + hourlyRate + "]";
	}

	public void calculatePayRoll() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hours worked by "+eName+" in Week");
		int hours=sc.nextInt();
		int regularHours=Math.min(hours, 40);
		int overTimHours=Math.max(hours-40,0);
		double sal;
		if(hours>40) {
			sal=(hourlyRate*40)+(overTimHours*hourlyRate*1.5);
			System.out.println("Total Salary Of Employee per Week "+sal);
		}else {
			sal=(hourlyRate*regularHours);
			System.out.println("Total Salary Of Employee per Week "+sal);
		}
	}

}
public class PayRollOfEmployees {


	public static void main(String[] args) {
		int id=1;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Salary per Hour");
			double sal=sc.nextDouble();
			Employee emp=new Employee(id++,name,sal);
            emp.calculatePayRoll();
			
			System.out.println("Press 0 to exit");         
            if(sc.nextInt()==0) {
            	System.exit(0);
            }

		}




	}

}
