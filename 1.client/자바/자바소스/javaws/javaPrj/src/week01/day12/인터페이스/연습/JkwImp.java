package week01.day12.인터페이스.연습;

public class JkwImp implements Myrunnable {

	//인터페이스 부모에 클래스를 상속하기 위해
	// implements implements
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		
		
	}
	
}
