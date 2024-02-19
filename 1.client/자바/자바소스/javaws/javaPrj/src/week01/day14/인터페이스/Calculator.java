package week01.day14.인터페이스;

public  class Calculator implements CalculatorI {
	
	//인터페이스를 상속받아 구현할 경우
	//인터페이스에서 약속된 이름으로 정의해야 한다.
	/*
	 * 여기서 중요한 점은 인터페이스를 구현하는 클래스는 해당 인터페이스에 
	 * 선언된 모든 메서드를 구현해야 합니다. 그렇지 않으면 컴파일 오류가 발생합니다
	 * 
	 */
	@Override
	public int add(int num1, int num2) {	
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2) {	
		return num1-num2;
	}

}
