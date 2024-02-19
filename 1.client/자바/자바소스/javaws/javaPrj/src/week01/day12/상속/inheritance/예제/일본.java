package week01.day12.상속.inheritance.예제;

public class 일본 extends Person {
	@Override
	public void 인사하기() {
		
		System.out.println("こんにちは");
		
	}
	
	@Override
	public void 대표위인() {
		System.out.println("오다 노부나가");
	}
	
	@Override
	public void 화폐단위() {
		System.out.println("엔");
	}
}
