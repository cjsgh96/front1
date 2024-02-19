package week01.day7문제풀이;

public class 배열문제풀이_1 {

	public static void main(String[] args) {
		
		//1~4 배열 출력하기
		 int[] kors= { 90,80,99,89,100} ;
		 
		 for(int i=0;i<5;i++) {
			 System.out.print(kors[i]+"  ");
		 }
		 System.out.println();
		 
		 //배열 합 출력하기
		 int sum=0;
		 for(int i=0;i<5;i++) {
			 sum=sum+kors[i];
		 }
		 System.out.println("배열의합=>"+sum);
		 
		 //거꾸로 출력하기
		 for(int i=4;i>-1;i--) {
			 System.out.print(kors[i]+"  ");
		 }
		 System.out.println();
		 
		 //평균보다 큰값 출력하기
		 
		 int sum2=0;
		 int avg=0;
		 for(int i=0;i<5;i++) {
			 sum2=sum2+kors[i];
		 }
		 avg=sum2/5;
		 
		 for(int i=0;i<5;i++) {
			 if(avg<kors[i]) {
				 System.out.println("평균보다 큰 배열=>"+kors[i]);
			 }
		 }
		 
		 
		 
	}

}
