package week01.day9;

public class 배열에값넣기 {

	public static void main(String[] args) {
		
		int kors[] = new int[5];
		//배열에 (국어점수)
		배열등록하기(kors);
		
		//조회
		배열조회하기(kors);
		
	}
	public static void 배열등록하기(int[] a) { //배열의 정보를 a가 담고 있다 ( 참조형 변수 )
		//등록
		a[0] = 100;
		a[1] = 99;
		a[2] = 30;
		a[3] = 25;
		a[4] = 88;
	}
	public static void 배열조회하기(int[] kors) {
		for(int i=0;i<kors.length;i++) {
			System.out.println(kors[i]);
		}
	}

		
		
	
}
