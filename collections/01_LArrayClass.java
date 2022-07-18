import java.util.Arrays;

public class LArrayClass {
	
	public static void main(String[] args) {
	
		//Binary search 
//		int numbers[] = {1,2,3,4,5,6,7};
//		int index = Arrays.binarySearch(numbers,4);
//		System.out.println(index);
		
		//Sorting
		Integer[] numbers = {10,95,8,4,15,7,2};
		Arrays.sort(numbers);
		for(int i : numbers) System.out.print(i + " ");
		System.out.println();
		
		Arrays.fill(numbers, 12);
		for(int i : numbers) System.out.print(i + " ");
		
	}	

}
