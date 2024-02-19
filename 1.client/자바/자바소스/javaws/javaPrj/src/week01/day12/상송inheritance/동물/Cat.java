package week01.day12.상송inheritance.동물;

public class Cat extends Animal{
	public void 쥐를잡는다() {
		System.out.println("쥐를잡는다");
	}
	
	//부모의 매서드 재정의 override
	//부모것이랑 똑같아야 함
	
	
	//부모의 매서드 재정의 override
	//부모것이랑 똑같아야 함
	//부모에 반드시 있어야 한다.
	//@Override
	
	@Override
	public void 짖는다() {
		
		System.out.println("야옹");
		
	}
}
