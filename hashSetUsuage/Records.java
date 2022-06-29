package hashSetUsuage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Records {

	public static void main(String[] args) {
		
//		Set<Student> stu = new HashSet<>();
		
		List<Student> stu = new ArrayList<>();
		stu.add(new Student("Anuj",1));
		stu.add(new Student("Rakesh",2));
		stu.add(new Student("Aman",4));
		stu.add(new Student("Agrav",1));
		
		System.out.println(stu);
		
		//Sorting 
//		Collections.sort(stu,new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student s1,Student s2) {
//				return s1.name.compareTo(s2.name);
//			}
//			
//		});
		
		Collections.sort(stu,(s1,s2) -> s1.name.compareTo(s2.name));
		System.out.println(stu);
		
		
		
	}
}
