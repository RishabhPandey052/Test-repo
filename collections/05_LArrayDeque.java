// Array deque allows us to do push pop peek opertion at the both ends of its
import java.util.ArrayDeque;
public class LArrayDeque {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		// comes from queue class
		// adq.offer(100);
		// adq.poll();
		// adq.peek();
		
		
		adq.offer(34);
		adq.offerFirst(122);
		adq.offerLast(1244); // same as offer
		System.out.println(adq);
		
		adq.peek(); // next in line
		adq.peekFirst(); //same
		System.out.println(adq.peekLast()); // from last;
		
		adq.poll();  //removes form first
		adq.pollFirst(); // same
		adq.pollLast(); // removes the last element
		
	}

}
