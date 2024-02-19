package week01.day10;

public class Cartest {

	public static void main(String[] args) {
		
		//
		Car c1 = new Car(); //자동차 정보를 담을 수 있는 변수가 만들어진 것
		
		c1.input("산타페", "현대", 3500);
		c1.printInfo(); //input(); 기능 사용
		c1.printInfo(); //printInfo(); 기능 사용
		
		int result = Math.max(5, 3);
		System.out.println(result);
		

	}

}
