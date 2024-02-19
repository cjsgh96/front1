package week01.day04;

public class 여민혜순한맛2_2 {

	public static void main(String[] args) {
		//변수선언
		
		int sum=0;//항
		
		
		
		for(int i=1 ; i<=100 ; i++ ) {
			for(int j=1; j<=i; j++) {
				sum= sum+j;
			}
		}
		System.out.println(sum);
		
	}

}
