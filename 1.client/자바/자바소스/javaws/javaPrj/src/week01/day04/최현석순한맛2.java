package week01.day04;

public class 최현석순한맛2 {

	public static void main(String[] args) {
		//변수
		
		//1+(1+2)+(1+2+3)...+(1+2+3+4...100)
		int N=1, i=0 , sum=0;
		
		while(N<=100) {
			i=i+N;
			sum=sum+i;
			N=N+1;
		}
		System.out.println(sum);
		
	}

}
