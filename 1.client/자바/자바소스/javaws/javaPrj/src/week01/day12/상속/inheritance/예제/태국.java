package week01.day12.상속.inheritance.예제;

public class 태국 extends Person{
	@Override
	public void 인사하기() {
		System.out.println("สวัสดี");
			
	}
	
	@Override
	public void 대표위인() {
		System.out.println("라마 1세");
	}
	
	@Override
	public void 화폐단위() {
		System.out.println("바트");
	}
}
