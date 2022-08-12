package shehs;

class Base{
	
	int a = 5;
	
	public static void printMessage() {
		System.out.println("Static of Base class");
	}
	
	void function() {
		System.out.println("Normal function of base class");
	}
	
}

class Dervied extends  Base{
	
	int a = 10;
	
	public static void printMessage() {
		System.out.println("Static of Dervied class");
	}
	
	@Override
	void function() {
		System.out.println("Normal function of Derived class");
		
	}
	
}
public class A014OverridingIMP {
	
	public static void main(String[] args) {
		
		Base b = new Dervied();
		System.out.println(b.a);
		b.printMessage();
		b.function();
	}
	
}
