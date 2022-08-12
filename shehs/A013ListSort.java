package shehs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A013ListSort {

	public static void main(String[] args) {
		
		List<String> lis = Arrays.asList("A","B","C","D","A","B");
		
		Collections.sort(lis,(s1,s2)->{
			return s2.compareTo(s1);
		});
		
		
//		Comparator<String> c    = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o2.compareTo(o1);
//			}
//			
//		};
//		Collections.sort(lis,c);
		
		System.out.println(lis);
		
	}
}
