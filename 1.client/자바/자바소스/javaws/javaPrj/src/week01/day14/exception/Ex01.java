package week01.day14.exception;

public class Ex01 {

	public static void main(String[] args) {
		
		//예외처리
		//선택예외 : 예외처리가 선택적이다.
		//선택예외방법 : 한 가지 => try~catch 예외처리

		int[] arr = {9,8,7,10};
		
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
			//catch(Exception e){//모든에러 ArrayIndexOutOfBoundsException 배열의 인덱스 에러
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("배열의 범위 벗어남");
		}
		
		System.out.println("정상종료");
		
	
		
		
	}

}
