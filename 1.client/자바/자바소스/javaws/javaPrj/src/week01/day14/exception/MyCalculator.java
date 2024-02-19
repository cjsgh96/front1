package week01.day14.exception;

public class MyCalculator {
	//Exception
	public int add(int num1, int num2) throws Exception {
		if(num1<0 || num2<0) {
			//예외를 일으키는 키워드 : throw
			throw new 음수예외(); //필수예외
			
		}
		return num1+num2;
	}
	
	//RuntimeException
	public int add2(int num1, int num2) {
		if(num1<0 || num2<0) {
			//예외를 일으키는 키워드 : throw
			throw new RuntimeException("0보다 커야 합니다"); //선택예외
			
		}
		return num1+num2;
	}
}
