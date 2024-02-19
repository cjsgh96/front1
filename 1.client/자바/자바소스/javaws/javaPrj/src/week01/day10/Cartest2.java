package week01.day10;

public class Cartest2 {

	public static void main(String[] args) {
		
		//
		Car2_생성자 c1 = new Car2_생성자(); //자동차 정보를 담을 수 있는 변수가 만들어진 것
		c1.printInfo();
		/*
		c1.input("산타페", "현대", 3500);
		c1.printInfo();
		
		c1.input("아반떼", "현대", 1500);
		c1.printInfo();
		*/
		Car2_생성자 c2 = new Car2_생성자("k7", "현대", 4500);
		c2.printInfo();
		

		
		


	}

}
