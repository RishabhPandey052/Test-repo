import  java.util.LinkedList;
import 	java.util.Queue;
public class LlinkedListQueue {
	
	public static void main(String[] args) {
		
		// Queue is implemented by arrays and linked list
		Queue<Integer> queue = new LinkedList<>();
		
		// adds (OFFER) / add--> if add unsuccessful then throw exception 
		queue.offer(12);
		queue.offer(34);
		queue.offer(144);
		
		System.out.println(queue);
		
		// removes from front (POLL) / remove--> same throws exception
		System.out.println(queue.poll());
		System.out.println(queue);
		
		//Next inqueue (PEEK) / element --> same
		System.out.println(queue.peek());
		
		
	}
	

}
