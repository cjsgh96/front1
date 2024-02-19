package week02.day05;

public class 상수와리터럴 {

	public static void main(String[] args) {
		
		// 변수 : 다른값으로 변경 가능
		int a=10;
		a=5; 
		
		//상수 final int 
		final int MAX=10; // 가독성, 유지보수성을 위해 상수를 사용하는 경우가 많다.
		MAX=5;
		
		//리터럴 ( 상수라고도 부름 , 값 자체 !! )
		//리터럴도 크기를 갖는다.
		int b=20; // b라는 변수(공간 확보) , 20(값도) 저장되어서 사용됨
		//상수영역이 따로 존재함
		// 정수형 -> int 
		// 실수형 -> double
		
		int amount = 210000000;
		//long amount2 = 2200000000;
		//=>상수 영역에 22억이 저장될 때 문제가 발생하는 경우
		// ( 정수는 상수영역에 저장될 때 int형 크기 이므로 22억이 저장이 안되고 있음 )
		
		long amount2 = 2200000000L; // long형 상수임을 알리는 L을 붙혀야 함
		// 상수영역에 22억이 long형으로 저장됨
	}

}
