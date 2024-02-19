package week01.day13.object;

public class Cat {
	
	String name;

	public Cat(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	public void 쥐를잡는다() {
		System.out.println("쥐를잡는다");
	}
	
}
