package 배열_배열문제풀이;

public class 배열문제풀이 {

	public static void main(String[] args) {
		//각종 배열문제
		int[] su=new int[5];
		
		su[0]=1;
		su[1]=2;
		su[2]=3;
		su[3]=4;
		su[4]=5;
		
		//배열 표시
		for(int i=0;i<5;i++) {
			System.out.println(su[i]);
		}
		//배열의수 모든 합
		
		int sum=0;
		for(int j=0;j<5;j++) {
			sum=sum+su[j];
		}
		System.out.println("배열의합=>"+sum);
		
		//배열의 합 의 평균
		
		int sum2=0;
		int avg;
		for(int k=0;k<5;k++) {
			sum2=sum2+su[k];
		}
		avg=sum2/5;
		System.out.println("배열의합의 평균=>"+avg);
		
		

		

	}

}
