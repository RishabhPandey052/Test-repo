package shehs;

class Student{
	int age;
	double marks;
	
	Student(){
		
	}
	
	Student(int age,double marks){
		this.age = age;
		this.marks = marks;
	}
	
	Student(double marks,int age){
		this.age = age;
		this.marks = marks;
	}
}
public class A007TypePromotion {
	
	public static void main(String[] args) {
//		Student s = new Student(45,12);  both constructor qualify
		Student s = new Student(45,12.0);
		
		
		
		
		System.out.println(s.age);
	}
}
