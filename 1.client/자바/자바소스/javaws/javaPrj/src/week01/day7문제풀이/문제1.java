package week01.day7문제풀이;

public class 문제1 {

	public static void main(String[] args) {
		
		//배열선언
				//값을 저장 값을 읽어오는 방법을 알아야 한다. 
				int[] numbers  = {80,90,70,100,89};		
				
				System.out.println (  numbers[0]);  //배열의 첨자
				System.out.println (  numbers[1]);
				System.out.println (  numbers[2]);
				System.out.println (  numbers[3]);
				System.out.println (  numbers[4]);
				
				
				//배열 + 반복문 
				//i변수 => 반복제어 +  배열의 첨자로 활용됨 
				for( int i=0; i<5; i++ ) {
					System.out.println (  numbers[i]);  //배열의 첨자
				}
	}

}
