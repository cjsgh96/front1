package week01.day04;

public class 김예원순한맛2 {

	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)...
		//변수
		
		int N=1, allSUM=0, SUM=0;
		
		while(N<=100) {
			SUM=SUM+N;
			allSUM=allSUM+SUM;
			N=N+1;
			System.out.println(SUM+" "+allSUM);
			
			
		}

	}

}
