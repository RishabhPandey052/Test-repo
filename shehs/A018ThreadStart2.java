package shehs;

class ThreadEx extends Thread{
	
	public void run() {
		System.out.println("Hello");
	}
}

public class A018ThreadStart2 {
	
	public static void main(String[] args) {
		
		ThreadEx t1 = new ThreadEx();
		t1.start();
		t1.start();
	
	}
}
