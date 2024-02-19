package week01.day9;

public class 배열2차원 {

	public static void main(String[] args) {


		 String[][] 일정 = new String[3][3];
		 
		 
		 //1행 (0행)
		 일정[0][0]="자바공부";
		 일정[0][1]="산책";
		 일정[0][2]="tv 보기";
		 
		 
		 
		 //2행 (1행)
		 일정[1][0]="자바스크립트 공부";
		 일정[1][1]="요리하기";
		 일정[1][2]="청소";
		 
		 
		 
		 일정[2][0] ="css공부하기";
		 일정[2][1] ="키페가기";
		 일정[2][2] ="도서관가기";
		 
		 
		 
		 
		 
		 System.out.println( 일정[0][0]);
		 System.out.println( 일정[0][1]);
		 System.out.println( 일정[0][2]);
		 
		 
		 System.out.println( 일정[1][0]);
		 System.out.println( 일정[1][1]);
		 System.out.println( 일정[1][2]);
		 
		 
		 System.out.println( 일정[2][0]);
		 System.out.println( 일정[2][1]);
		 System.out.println( 일정[2][2]);
		 
		 
		 
		 
		 for( int  i=0; i<3 ;i++) {
			 
			 System.out.println( 일정[i][0]);
			 System.out.println( 일정[i][1]);
			 System.out.println( 일정[i][2]);
			 
			 
		 }
		 ///
		 
		 for( int  i=0; i<3 ;i++) {			 
			for( int j=0; j<3 ; j++) {
				 System.out.println( 일정[i][j]);
			}			 
			 
		 }

	}

}

	
 