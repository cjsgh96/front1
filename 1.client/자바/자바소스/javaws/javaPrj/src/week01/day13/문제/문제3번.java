package week01.day13.문제;

public class 문제3번 {

	
	public static int 문제3번(int su, int su2) {
		
		int sum=0;
		sum=su*su2;
		
		return sum;
	}
	
	public static void MyCalculator(int su, int su2) {
		int result = 문제3번(su,su2);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		MyCalculator(3,6);
	}

	

}
