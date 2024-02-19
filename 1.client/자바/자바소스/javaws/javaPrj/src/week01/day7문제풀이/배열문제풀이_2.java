package week01.day7문제풀이;

public class 배열문제풀이_2 {

	public static void main(String[] args) {
		
		//배열 모두 출력하기
		
		int[]  temperatures = { 27,27,28, 29,30 , 33,32,33,32,31,31,33,33,31} ;
		
		for(int i=0;i<temperatures.length;i++) {
			System.out.print(temperatures[i]+"  ");
		}
		System.out.println();
		
		//배열 거꾸로 출력하기
		for(int i=13;i>-1;i--) {
			System.out.print(temperatures[i]+"  ");
		}
		System.out.println();
		
		//평균기온 출력하기
		int sum=0;
		int avg=0;
		for(int i=0;i<temperatures.length;i++) {
			sum=sum+temperatures[i];
		}
			avg=sum/14;
			System.out.println("평균기온=>"+avg);
			
		//평균 기온보다 높은 일수 구하기
		
		for(int i=0;i<temperatures.length;i++) {
			if(avg<temperatures[i]) {
				System.out.println("평균 기온보다 높은 기온=>"+temperatures[i]+"날짜:=>"+(i+1)+"일");
			}
		}
		
		//배열중 가장 높은 기온
		
		int su;
		int in;
		for(int i=0;i<temperatures.length;i++) {
			for(int j=1;j<14;)
			
		}
		
		
	}

}

