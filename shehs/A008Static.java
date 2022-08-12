package shehs;

public class A008Static {

	int i = 20;
	public static void main(String[] args) {
		A008Static el = new A008Static();
		el.i = 50;
		
		el = new A008Static();
		
		System.out.println(el.i);
		
		
//		Q2
		
		String name = "Ram";
		String ex = name.concat("Kumar");
		System.out.println(name);
		System.out.println(ex);
	}
}
