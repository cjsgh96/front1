package week01.day12.상송inheritance.동물;

public class Dog extends Animal {
	public void 집을지킨다() {
		System.out.println("집을지킨다");
	 
	}
	@Override
	public void 짖는다() {
		
		System.out.println("멍멍");
	}
}
