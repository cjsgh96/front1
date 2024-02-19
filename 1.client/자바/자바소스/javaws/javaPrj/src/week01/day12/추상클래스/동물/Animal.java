package week01.day12.추상클래스.동물;

public abstract class Animal {
	
	//추상매서드로 변환
	public abstract void 짖는다(); { // 함수머리부, 선언부
		 
	}
	
	public void 먹는다() {
		System.out.println("먹는다");
	}
	
	public void 잠잔다() {
		System.out.println("잠잔다");
	}
}
