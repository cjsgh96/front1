package week01.day12.상속.inheritance.예제;

public class 한국 extends Person {

	@Override
	public void 인사하기() {
		System.out.println("안녕하세요");
	}
	
	@Override
	public void 대표위인() {
		System.out.println("세종대왕");
	}
	@Override
	public void 화폐단위() {
		System.out.println("원");
	}
	public void 김치담구기() {
		System.out.println("김치를 담군다");
	}
}
