
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class LaunchApp2 {

	public static void main(String[] args) {
		
		List<String> names=List.of("John","Sam","Sandy","Raj","Mike","Sara","Tom","Tim","Kim","Jim");
		
//		List<String>  nameWithS=names.stream()
//				                       .filter(name->name.startsWith("N"))
//				                           .collect(Collectors.toList());
//		System.out.println(nameWithS);
//		System.out.println(nameWithS.size());				
						
//		Optional<String> name=names.stream()
//				.filter(n->n.startsWith("N"))
//				.findFirst();
//		
//		System.out.println(name);
//		System.out.println(name.orElse("Nothing").length());//7
//		System.out.println(name.get().length());//java.util.NoSuchElementException
		
		
		String name=names.stream()
				.filter(n->n.startsWith("S"))
				.findFirst().orElse("Something");
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println("*********************************************************************");
		
		// list of countries
        List<String> countries = List.of("India", "USA", "UK", "Canada", "Australia", "Japan", "China", "Russia", "France", "Germany");
		
//		for(String c: countries) {
//			System.out.println(c);
//		}
		
//		Consumer consumer=new Consumer() {
//			@Override
//			public void accept(Object t) {
//				System.out.println(t);				
//			}			
//		};
//		countries.forEach(consumer);
		
//		Consumer consumer= c ->System.out.println(c);				
//		countries.forEach(consumer);				
	
		
//        countries.forEach(c->System.out.println(c));
        
        countries.stream()
                 .filter(country->country.length()>5)
                 .forEach(country->System.out.println(country));
		
	}

}
