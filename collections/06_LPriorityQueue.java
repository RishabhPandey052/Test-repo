import java.util.Comparator;
import java.util.PriorityQueue;
public class LPriorityQueue {

	public static void main(String[] args) {
		
		//By default min-heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(100);
		pq.offer(23);
		pq.offer(32);
		pq.offer(3);
		
		System.out.println(pq);
		//Remove
		pq.poll();
		System.out.println(pq);
		//top element
		System.out.println(pq.peek());
		
		//Max-heap
	
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
		System.out.println("Max heap");
		pq2.offer(100);
		pq2.offer(23);
		pq2.offer(32);
		pq2.offer(3);
		
		System.out.println(pq2);
		//Remove
		pq2.poll();
		System.out.println(pq2);
		//top element
		System.out.println(pq2.peek());
	}
}
