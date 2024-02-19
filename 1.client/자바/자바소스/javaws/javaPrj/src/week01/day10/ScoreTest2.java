package week01.day10;

public class ScoreTest2 {

	public static void main(String[] args) {
	 
		//static 매서드
		//클래스이름.매서드이름();
		//Math.max();
		
		//static이 붙지 않는 맨서드를 사용하는 방법
		//1. 객체를 생성한다. Score2 s = new Score();
		//2. 객체.매서드이름();
		
		Score2 s = new Score2();
		
		/*
		s.name="홍길동"; 
		s.kor=99;
		s.eng=88;
		s.avg   =  ( s.kor + s.eng) / 2.0;
		
		
		
		System.out.println(  s.name);
		System.out.println(  s.kor );
		System.out.println(  s.eng );
		System.out.println(  s.avg);
		*/
		s.input("홍길동", 99, 88);
		
		s.printInfo();
		
		s.calcAvg();
		
		s.printInfo();

	}

}
