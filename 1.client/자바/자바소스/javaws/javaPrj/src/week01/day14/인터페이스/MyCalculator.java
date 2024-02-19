package week01.day14.인터페이스;

public  class MyCalculator implements CalculatorI{
	public int add(int su1, int su2) {
	int result=	su1 + su2;
	return result;
	}
	public int sub(int su1, int su2) {
		int result=	su1 - su2;
		return result;
		}
		
}