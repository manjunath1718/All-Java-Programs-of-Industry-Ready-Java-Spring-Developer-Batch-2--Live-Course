import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
class TshapedSkills{
	String skills;
	Integer id;
	public TshapedSkills(String skills, Integer id) {
		super();
		this.skills = skills;
		this.id = id;
	}
	@Override
	public String toString() {
		return "TshapedSkills [skills=" + skills + ", id=" + id + "]";
	}
	
	
}
public class LaunchMap1 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "java");
		hm.put(2, "GoLang");
		hm.put(3, "JS");
		
		System.out.println(hm);  //{1=java, 2=GoLang, 3=JS}
		
		TshapedSkills ts=new TshapedSkills("masterskills", 1);
		HashMap hm2=new HashMap();
		hm2.put("Alien", "java");
		hm2.put(ts, "skills");
		hm2.put(3, "GoLang");
		hm2.put(3, "GoLang");//key has to be unique but value need not to be
		hm2.put(null, "spring");//key can be null
		hm2.put("some data", null);//value can be null
		System.out.println(hm2);  //{Alien=java, TshapedSkills [skills=masterskills, id=1]=skills, 3=GoLang, null=spring, some data=null}
		
		LinkedHashMap lhm=new LinkedHashMap();		
		lhm.put("Alien", "java");
		lhm.put(ts, "skills");
		lhm.put(3, "GoLang");
		lhm.put(3, "GoLang");//key has to be unique but value need not to be
		lhm.put(4, "GoLang");
		lhm.put(null, "spring");//key can be null
		lhm.put("some data", null);//value can be null		
		System.out.println(lhm);  //{Alien=java, TshapedSkills [skills=masterskills, id=1]=skills, 3=GoLang, null=spring, some data=null}
	
		HashMap<Integer,String> hm3=new HashMap<>();
		hm3.put(1, "java");
		hm3.put(2, "GoLang");		
	//	hm3.put("alien", "java");//can't add String as key
		System.out.println(hm3);
		
		System.out.println("***************************************************************");
		Hashtable ht=new Hashtable();
		ht.put(1, "Spring");
		ht.put(2, "Hibernate");
//		ht.put(3, null);//value cannot be Null in Hashtable
//		ht.put(null, "Java");//Key cannot be null
		System.out.println(ht);
		
		System.out.println("***************************************************************");
		
		TreeMap tm=new TreeMap();		
		tm.put(1, "Hibernate");
		tm.put(2, "MyBatis");
		tm.put(3, null);//Value could be null
	//  tm.put(null,ts);//key cannot be null
		System.out.println(tm);
	}

}
