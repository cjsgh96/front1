package week01.day10;

public class 여행지 {
	
	String 여행지;
	String 가볼곳;
	String 준비물;
	String 경로;
	
	
	
	public void input(String 여행지,String 가볼곳, String 준비물, String 경로 ) {
		this.여행지=여행지;
		this.가볼곳=가볼곳;
		this.준비물=준비물;
		this.경로=경로;
	}
	
	public void printInfo() {
		System.out.println(여행지);
		System.out.println(가볼곳);
		System.out.println(준비물);
		System.out.println(경로);
	}
	
	
}

