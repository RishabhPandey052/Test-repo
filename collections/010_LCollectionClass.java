import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LCollectionClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(240);
		list.add(2340);
		list.add(240);
		list.add(220);
		list.add(2670);
		list.add(7664);
		
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list,240));
		
		Collections.sort(list);
		System.out.println();
		
		

	}

}
