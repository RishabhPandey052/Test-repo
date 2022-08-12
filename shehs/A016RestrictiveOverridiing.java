package shehs;

class Base1{
	int i = 10;
	
	public Base1() {}
	
	public Base1(int j) {
		System.out.println(i);
		this.i = j * 10;
	}
}

class Derived2 extends Base1{
	
	public Derived2(int j) {
		super(j);
		System.out.println(i);
		this.i = j * 20;
	}
	
}
public class A016RestrictiveOverridiing {
	
	public static void main(String[] args) {
		Derived2 d  = new Derived2(20);
		System.out.println(d.i);
	}
}
