package shehs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class A001SetWithoutDatatype  {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
//		Set hashset = new LinkedHashSet<>();
//		hashset.add("1");
//		hashset.add(1);
//		hashset.add("null");
//		hashset.add(null);
//		hashset.add(1.0f);
//		System.out.println(hashset);
		
		Set s = new TreeSet();
		s.add(10);
		s.add(20);
		s.add("30");
		s.add(40);
		System.out.println(s);
		
	}
	

}
