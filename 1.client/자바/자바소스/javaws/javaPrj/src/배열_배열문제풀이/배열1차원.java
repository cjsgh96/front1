package 배열_배열문제풀이;

public class 배열1차원 {

	public static void main(String[] args) {
		
		//배열은 기억장소의 집합
		//배열은 크기가 같고, 연속적이다.
		
		//숫자 5개를 변수와 배열을 사용해서 값을 기억하고 이용해 보자
		int a, b, c, d, e;
		a=10;
		b=8;
		c=7;
		d=11;
		e=13;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//int[] numbers = new int [5];
		int[] numbers = {10,8,7,11,13};
		
		System.out.println("배열출력");
		System.out.println(e);
		System.out.println(numbers[0]); //첫번째 요소	(변수)
		System.out.println(numbers[1]); //두번째 요소
		System.out.println(numbers[2]); //세번째 요소
		System.out.println(numbers[3]); //네번째 요소
		System.out.println(numbers[4]); //다섯번째 요소 (기준으로 부터 변수크기 4만큼 떨어진 위치에 있다.)
		
		System.out.println("================================");
		//배열의 요소를 접근할 때 [ 첨자(index) ] 첨자 : index=> 변수를 사용 가능 
		
		for(int i=0;i<5;i++) {
			System.out.println(numbers[i]); //1차원 배열의 모든값을 꺼내오기 위한 반복문
		}
		
		//배열 선언
		int[] arr = new int[5];
		double[] arrd = new double[5];
		boolean[] arrb = new boolean[5];
		String[] arrs = new String[5];
		
		
		
		
		
	}

}
