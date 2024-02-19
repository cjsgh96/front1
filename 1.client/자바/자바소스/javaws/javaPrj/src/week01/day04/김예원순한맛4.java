package week01.day04;

public class 김예원순한맛4 {

	public static void main(String[] args) {
		//1+3+5+7+9... 가 1000을 초과할때의 수
		//변수
		
		int N=1 , SUM=0, B;
		
		while(SUM<=1000) {
			B= (2*N)-1;
			SUM= SUM+B;
			N=N+1;
			System.out.println(B+" 누적합= "+SUM);
			
		}

	}

}
