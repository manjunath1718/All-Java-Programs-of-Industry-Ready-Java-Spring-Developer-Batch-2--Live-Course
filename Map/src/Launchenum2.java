
enum Result{
	
	PASS, FAIL;// NR;
	
	//public static final Result PASS=new Result();
	//public static final Result FAIL=new Result();
	//public static final Result NR=new Result();
	
	int marks;
	
	Result(){
		
		System.out.println("Constructor of Enum");
	}

	public int getMarks() 
	{
		return marks;
	}

	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	
	
}
public class Launchenum2 {

	public static void main(String[] args) {
		
		Result.PASS.setMarks(44);
		int marks=Result.PASS.getMarks();
		System.out.println(marks);//44
				
		int marks2=Result.FAIL.getMarks();
		System.out.println(marks2);//0
		
//		Result.PASS.setMarks(35);
//		int marks1=Result.PASS.getMarks();
//		System.out.println(marks1);//35

		
	}

}
