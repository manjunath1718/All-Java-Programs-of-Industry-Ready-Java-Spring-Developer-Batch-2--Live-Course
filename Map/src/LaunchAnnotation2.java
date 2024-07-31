import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD,ElementType.PARAMETER, 
	ElementType.LOCAL_VARIABLE})
@interface CricketPlayer{

	String country() default "India";
	int age() default 35;

}
//@--> specifies compiler Annotation type is being created 

//@CricketPlayer(country="India", age=35)
@CricketPlayer
class ViratKohli{

	@CricketPlayer
	private int innings;

	//@CricketPlayer//disallowed
	public ViratKohli(){

	}

	@CricketPlayer
	public int getInnings() {

		@CricketPlayer
		int va=44;
		return innings;
	}

	public void setInnings(@CricketPlayer int innings) {
		this.innings = innings;
	}


}
public class LaunchAnnotation2 {

	public static void main(String[] args) {
		ViratKohli vk=new ViratKohli();
		vk.setInnings(454);
		System.out.println(vk.getInnings());

		System.out.println("*******************");

		Class<? extends ViratKohli> c = vk.getClass();
		Annotation an=c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer)an;
		int age=cp.age();
		String country=cp.country();
		System.out.println("Info within annotation: "+ age + " "+ country);

	}

}
