interface IGen<T>{
	void disp();
	
}
class Generics<T> implements IGen<String>{
	private T ref;
	
	public Generics(T ref)
	{
		this.ref=ref;
	}
	
	public void disp()
	{
		System.out.println("The type t is of "+ ref.getClass().getName());
	}
	
	public T getRef()
	{
		return ref;
	}	
	
}
public class LaunchGen2 {

	public static void main(String[] args) {
		Generics<Integer> g=new Generics<>(44);
		g.disp();
		System.out.println(g.getRef());
		
		//Generics<Integer> g2=new Generics<>("Java");CompiletimeError
		
		Generics<String> g2=new Generics<>("Spring");
		g2.disp();
		System.out.println(g2.getRef());
		
		Generics<Object> g3=new Generics<>("sql");
		g3.disp();
		System.out.println(g3.getRef());

	}

}
