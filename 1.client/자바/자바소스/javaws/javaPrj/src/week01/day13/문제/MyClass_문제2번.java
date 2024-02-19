package week01.day13.문제;

public class MyClass_문제2번 {
	int su;
	

	public int getTotal(int su) {
		int sum=0;
		
		for(int i=1;i<=su;i++) {
			sum=sum+i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		MyClass_문제2번 m = new MyClass_문제2번();
		
		
		System.out.println(m.getTotal(15));
	}
	
}
