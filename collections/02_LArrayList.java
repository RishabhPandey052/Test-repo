// Same for linked  list
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>();
		
		// Adding
		// When compeleting filled then n + n/2 + 1; intiallly creates size of 10
		students.add("Rakesh");
		
		// list class
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(4);
		System.out.println(list1);
		
		// adding in between add(index,element) index 0-based
		list1.add(1,50);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(150);
		list2.add(250);
		System.out.println(list2);
		
		//Merging two list list1.addAll(list2);  saves result in list1
		list1.addAll(list2);
		System.out.println(list1);
		
		// Get
		System.out.println(list1.get(1));
		
		
		// Remove
		//1.ByIndex
		list1.remove(1);
		System.out.println(list1);
		//2.byValue
		list1.remove(Integer.valueOf(150));
		System.out.println(list1);
		
		//Clear
//		list1.clear();
//		System.out.println(list1);
		
		//Set
		list1.set(2, 989);
		System.out.println(list1);
		
		//contains
		System.out.println(list1.contains(989));
		
		//Traversing
		
		for(int i =0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		for(Integer i: list1) System.out.println(i);
		
		
		
		Iterator<Integer> it = list1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
;	}

}
