package shehs;

interface inf1{
	
	public int a = 5;
	
	default void m1() {
		System.out.println("Default method");
	}
	
	default int giveA() {
		return a;
	}
}

interface inf2{
	void m1();
}

class MyOverride implements inf1,inf2{
	
	
	@Override
	public void m1() {
		System.out.println("M1 method");
	}
}
	
public class A010MultipleInterface {
	
	public static void main(String[] args) {
		inf2 ref = new MyOverride();
		ref.m1();
		System.out.println(((inf1) ref).giveA());
		
		
	}
}


