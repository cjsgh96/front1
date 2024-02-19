package week01.day12.인터페이스.연습;

public class Ex01 {

	public static void main(String[] args) {
		
		Myrunnable[] runs = new Myrunnable[1];
		
		runs[0] = new JkwImp();
		
		runs[0].run();
	}

}
