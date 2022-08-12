package shehs;

class Alpha1 {
	
	public String type = "a";
	
	public Alpha1() {
		System.out.println("Aplaha ");
		System.out.println("in aplah type 0" + type);
	}
}
public class A017InstanceVariable extends Alpha1 {
	
	public A017InstanceVariable() {
		System.out.println("A017");
	}
	
	void go() {
		System.out.println("Before b " + super.type);
		type = "b";
		System.out.println(this.type);
		System.out.println(super.type);
	}
	
	public static void main(String[] args) {
		new A017InstanceVariable().go();
	}
}
