
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LLinkedHashSet {

	public static void main(String[] args) {
		
		// Maintains the order by the use of linked list
		//Set<Integer> set = new LinkedHashSet<>();  TC -- O(1)
		
		Set<Integer> set = new TreeSet<>(); 
		// ^ this use BST and have properties of set so-- unique and sorted
		// TC -- O(log N)
			
		// Add implemented by Hash
		set.add(32);
		set.add(31);
		set.add(30);
		set.add(52);
		set.add(25);
		
		System.out.println(set);
		
		//Remove
		set.remove(25);
		System.out.println(set);
		
		// Contains  returns a boolean
		System.out.println(set.contains(52));
		
		// isEmpty for checking whether set is empty or not
		System.out.println(set.isEmpty());
		
		
		// size 
		System.out.println(set.size());
		
		//clear
		set.clear();
		System.out.println(set);
	}

}
