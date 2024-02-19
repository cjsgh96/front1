package 배열_배열문제풀이;

public class 배열1차원합계평균 {

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
		
		System.out.println(온도[0]);
		System.out.println(온도[1]);
		System.out.println(온도[2]);
		System.out.println(온도[3]);
		System.out.println(온도[4]);
		System.out.println(온도[5]);
		System.out.println(온도[6]);
		
		System.out.println("===========================");
		//평균
		
		int sum= 온도[0]+온도[1]+온도[3]+온도[4]+온도[5]+온도[6];
		int avg= sum/7;
		
		System.out.println("이번주평균온도"+avg);
	}

}
