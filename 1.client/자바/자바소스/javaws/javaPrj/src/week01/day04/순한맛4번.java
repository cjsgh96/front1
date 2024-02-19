package week01.day04;

public class 순한맛4번 {

	public static void main(String[] args) {
		
		//1+3+5+7....
		//=> 누적의 합이 1000을 초과하는 값과 항을 출력하시오
		//변수
		int A=1;	//항
		int d=2;	//공차
		int S=A;	//출력변수
		int N=1;	//항의 순서
		
		while(S < 1000) {
			A= A+d;
			S= S +A;
			N=N+1;
		}
		System.out.println("마지막 항="+A+"누적값"+S);
	}

}
