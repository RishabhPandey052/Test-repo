package shehs;

public class A006CastDirectly {
	
	public static void main(String[] args) {
		
		char[] charArr = new char[5];
		
		System.out.println(charArr.length);
		for(int i = 0;i<charArr.length;i++) {
			
			charArr[i] = 'i';
			System.out.println(charArr[i] + " ");
		}
	}

}
