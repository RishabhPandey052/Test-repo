package shehs;

class Parent{
	protected void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	protected void m1() {

		System.out.println("Child");
	}
}
public class A009OvverrdingProtected {
	
	public static void main(String[] args) {
	
	Parent p = new Child();
	p.m1();
	
	}
}
