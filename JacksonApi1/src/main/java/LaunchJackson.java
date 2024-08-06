import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaunchJackson {

	public static void main(String[] args) throws JsonProcessingException {
		
		Alien alien1=new Alien(101, "raj", "Gokak");
		Alien alien2=new Alien(102, "ram", "Bengaluru");
		Alien alien3=new Alien(103, "maohan", "Hubli");
		Alien alien4=new Alien(104, "navin", "Belagavi");
		List<Alien> list=new ArrayList();
		list.add(alien1);list.add(alien2);list.add(alien3);list.add(alien4);
		ObjectMapper mapper=new ObjectMapper();
//		String json = mapper.writeValueAsString(alien1);
//		System.out.println(json);
		
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(json);
	}
}