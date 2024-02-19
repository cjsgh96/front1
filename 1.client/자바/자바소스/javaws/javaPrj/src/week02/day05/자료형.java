package week02.day05;

public class 자료형 {

	public static void main(String[] args) {
		//변수 (메모리공간) 을 선언시 공간의 크기와 공간의 내용을 해석하는 방법
		/*
		 *  int : 정수형 4byte (+,- 21억) 
		 *  char : 문자형 , 한 문자 : ' a ' '한' , : 2byte
		 *  double : 실수형, 8byte
		 *  boolean: 논리형 (true,false) 
		 * */
		
		//문자, 문자열(문자집합)을 구분해서 생각해야 합니다.
		
		//아래 변수선언식을 기본자료형 이라 한다.
		int num=10;
		char ch='한';
		double dnum=25.56585;
		boolean result=true;
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(dnum);
		System.out.println(result);
		
		//
		// 정수형 변수
		// byte, short, int , long
		// 실수형변수
		// float, double,
		
		
		byte b= 127; // 1byte ( -128~127까지 저장하고 해석한다 );
		short s = 32767; // 2byte ( -32768 ~ 32767 )
		int i= 21474864; // 4byte 
		long l = 9223372036854775807L; //  약 992경
		
	}

}
