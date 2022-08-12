package shehs;

class Test implements Runnable{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class A003RunnableStartIMP  {
	
	public static void main(String[] args) throws InterruptedException {
//		Test t = new Test();
//		t.start();
		
		Test t = new Test();
		Thread th = new Thread(t);
		th.join();
		th.start();
//		Thread curr = Thread.currentThread();
		Thread.sleep(1000);
		System.out.println("Main");
	}
}
