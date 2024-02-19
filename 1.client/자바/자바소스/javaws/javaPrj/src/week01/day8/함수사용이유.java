package week01.day8;

public class 함수사용이유 {

	public static void main(String[] args) {
		//
		
		//
		//System.out.println("*********************************");
		//System.out.println("***************성적표**************");
		//System.out.println("*********************************");
		//
		//System.out.println("*********************************");
		//System.out.println("***************성적표**************");
		//System.out.println("*********************************");
		
		printTitle();
		printTitle();
		printTitle();
		
	}
	//코드중복이 발생합니다.
	//중복 => 코드가 많아짐, 코드 수정 => 수정해야 할 코드 많아짐 ( 실수가 발생할수 있다. ) 
	//코드 블럭 => 별도의 함수로 작성 ( 함수 호출로 코드가 실행될수 있도록 함 )
	
	//기능: 성적표 타이틀 출력기능 printTitle
	//입력: 없다
	//반환: 없다
	
	public static void printTitle() {//시작
		System.out.println("//////////////////////////////////");
		System.out.println("///////////////////성적표////////////");
		System.out.println("////////////////////////////////////");
		
	}//끝
}
