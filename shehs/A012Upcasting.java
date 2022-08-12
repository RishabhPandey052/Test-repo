package shehs;

abstract class A1{
	abstract void m1();
}

abstract class B1{
	void m1() {
		System.out.println("B ad");
	}
}

class MyClass extends B1{
	void m2() {
		System.out.println("MyClass -  m2 method");
	}
}
public class A012Upcasting {
	
	public static void main(String[] args) {
		B1 a = new MyClass();
		a.m1();
	}
}
