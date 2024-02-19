package week01.day04;

public class 이건희매운맛5 {

	public static void main(String[] args) {
		
		
		int ASum=2;
		int Sum=2;
		int N=3; //공비
		int i=1;
		//입력
		
		//처리
		while(i<=7) {
			Sum=Sum*N;
			ASum=ASum+Sum;
			i=i+1;
			
			System.out.println(Sum);
		}
		System.out.println(ASum);
			

	}

}
