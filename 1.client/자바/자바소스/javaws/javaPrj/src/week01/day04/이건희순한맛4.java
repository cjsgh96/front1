package week01.day04;

public class 이건희순한맛4 {

	public static void main(String[] args) {
		//변수선언
		int Sum=0, N=1, i=0;
		
		while(Sum<=1000) {
			Sum=Sum+N;
			N=N+2;
			i=i+1;
		}
		System.out.println(N+" "+i+"번째"+"누적합"+Sum);
		
	}

}
