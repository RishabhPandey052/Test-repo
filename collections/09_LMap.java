import java.util.HashMap;
import java.util.Map;
public class LMap {
	
	public static void main(String[] args) {
		
		//Doesnt keep in sorted way ,for sortd use treeMap
		Map<String,Integer> numbers = new HashMap<>();
		
		// Add - (PUT) (Key and value)  if repeated key entered then value will be updated
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		
		// check for not updating the key
		//1. containskey as false
		// if(!numbers.containsKey("Two")) numbers.put("Two", 23);
		//2. absent method
		numbers.putIfAbsent("Two", 23); 
		
		
		//Traversing
		//Both
		for(Map.Entry<String,Integer> e : numbers.entrySet()) {			
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());			
		}
		// Key
		for(String key: numbers.keySet()) {
			System.out.println(key);
		}
		// Values
		for(Integer value : numbers.values()) {
			System.out.println(value);
		}
		System.out.println(numbers);
		
		// Contains
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.containsKey("One"));
		
		//isEmpty
		System.out.println(numbers.isEmpty());
		
		//remove by key		
		numbers.remove("Three");
	}

}
