import java.util.Stack;
public class Lstack {
	
	public static void main(String[] args) {
		
		Stack<String> names = new Stack<>();
		
		// Add (PUSH)
		names.push("Rakesh");
		names.push("Rajesh");
		names.push("Raj");
		System.out.println(names);
		
		//top element (PEEK)
		System.out.println(names.peek());
		
		//remove (POP)
		names.pop();
		System.out.println(names);
		System.out.println(names.peek());
		
	}
}
