package shehs;

class Base3{
	
	int mutilpier(int data) {
		return data * 5;
	}
}
public class A020VarialeMoreStatic extends Base3 {
	
	private static int data;
	
	public A020VarialeMoreStatic() {
		data = 25;
	}
	
	public static void main(String[] args) {
		Base3 temp1 = new A020VarialeMoreStatic();
		System.out.println(temp1.mutilpier(data));
	}
}
