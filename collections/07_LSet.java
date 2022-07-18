import java.util.HashSet;
import java.util.Set;

public class LSet {

	public static void main(String[] args) {
		
		//Doesnt maintain the order for order use linkedHashedSet
		Set<Integer> set = new HashSet<>();
		
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
