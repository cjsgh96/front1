package week01.day10;

//자동차정보를 담을 수 있는 자료형 정의
//!! 자동차 정보 (이름, 가격, 제조사)를 담고 싶다면 거기에 맞는 Class Type을 만들어야 한다.

public class Car {
	
	
	//멤버변수
	private String 이름;
	private String 제조사;
	private int price;
	
	
	//멤버 매서드 : 멤버데이터를 다루는 기능(약속)
	//입력
	
	public void input(String 이름, String 제조사, int 가격 ) {
		this.이름 = 이름;
		this.제조사 = 제조사;
		this.price = 가격;
	}
	
	public void printInfo() {
		System.out.println(this.이름);
		System.out.println(this.제조사);
		System.out.println(this.price);
	}
	
}
