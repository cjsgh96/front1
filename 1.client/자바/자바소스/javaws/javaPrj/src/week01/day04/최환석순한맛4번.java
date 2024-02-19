package week01.day04;

public class 최환석순한맛4번 {

	public static void main(String[] args) {
		//항 => 1 3 5 7 9...
		//항의누적 => 1 4 9 16 25...
		
		int N=1, SUM=1;
		while(SUM<=1000) {
			N=N+2;
			SUM=SUM+N;
		}
		System.out.println(SUM);
	}

}


