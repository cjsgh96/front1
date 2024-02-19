package 배열_배열문제풀이;

public class 배열1차원합계평균2_반복문 {

	public static void main(String[] args) {
		
		//1. 정수 데이터 7개를 저장별 배열을 선언하고 날씨정보를 담고 출력
		//2. 평균 구하고 출력하기
		
		int[] 온도 = new int[7];
		온도[0] = -4;
		온도[1] = -3;
		온도[2] = 1;
		온도[3] = -2;
		온도[4] = -2;
		온도[5] = -1;
		온도[6] = 0;
		
		int sum=0;
		for(int i=0;i<7;i++) { //i => 반복제어+배열의 첨자로 사용됨
			
			sum=sum+온도[i];
		}
		System.out.println(sum);
		int avg;
		avg= sum/7;
		System.out.println("이번주 평균온도는"+avg);
		
	}

}
