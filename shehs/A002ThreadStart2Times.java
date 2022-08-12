package shehs;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("In child Thread");
	}
}
public class A002ThreadStart2Times {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		MyThread t1 = new MyThread();
		System.out.println(t);
		System.out.println(t1);
		
		
		System.out.println(t1.NORM_PRIORITY);
	}
}
