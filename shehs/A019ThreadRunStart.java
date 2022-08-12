package shehs;

public class A019ThreadRunStart extends Thread{
	
	public void run() {
		System.out.println("TEst");
	}
	
	public static void main(String[] args) {
		
		A019ThreadRunStart test1 = new A019ThreadRunStart();
		test1.start();
		test1.run();
		test1.run();
		test1.start();
		
	}
}
