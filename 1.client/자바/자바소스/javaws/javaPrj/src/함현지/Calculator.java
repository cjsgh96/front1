package week03.day14.인터페이스;

public class Calculator implements CalculatorI {

	@Override
	public int add(int num1, int num2) {	
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {	
		return num1-num2;
	}

}
