package week01.day04;

public class 순한맛0번 {

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
		//변수
		
		int a=0, sum=0;
		
		while(true) {
			a=a+1;
			if(a>10) {
				break;
			}
			sum= sum+a;
		}
		System.out.println(sum);

	}

}
