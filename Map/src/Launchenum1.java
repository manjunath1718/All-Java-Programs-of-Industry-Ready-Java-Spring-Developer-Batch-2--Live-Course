enum Week{
	MON,TUE,WED,THU,FRI,SAT,SUN;
}
enum Compass{
	SOUTH,NORTH,EAST,WEST;
}
public class Launchenum1 {
	enum Result{
		PASS,FAIL,NR;
	}

	public static void main(String[] args) {
		
		Week week=Week.MON;
		System.out.println(week);
		
		Week week1=Week.FRI;
		int ordinal=week1.ordinal();//ordinal method is used to get index
        System.out.println(ordinal);//4-->index
		
        Week[] Daysweek=Week.values();
        for(Week w:Daysweek) {
        	System.out.println(w.ordinal()+" -> "+w);
        }

	}

}
