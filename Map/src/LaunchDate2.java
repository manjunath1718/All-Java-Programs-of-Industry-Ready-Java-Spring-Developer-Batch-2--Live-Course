import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LaunchDate2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);//current date of the system
		System.out.println(date.getYear());
		int dayOfMonth = date.getDayOfMonth();
		System.out.println("Day of the Month : "+dayOfMonth);
		int dayOfYear=date.getDayOfYear();
		System.out.println("Day of the Year : "+dayOfYear);
		int month=date.getMonthValue();
		System.out.println("Month  value: "+ month);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		
		LocalDate date2=LocalDate.of(2000,2, 11);
		System.out.println(date2);
		System.out.println("******************************");
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int hour=time.getHour();
		int minute=time.getMinute();
		int sec=time.getSecond();
		int nanoSec=time.getNano();
		System.out.println(hour + " : "+ minute+ " : " + sec+ " -> "+ nanoSec);
		LocalTime time2 = LocalTime.of(22, 44);
		System.out.println(time2);
		
		System.out.println("***************************");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

	}

}
