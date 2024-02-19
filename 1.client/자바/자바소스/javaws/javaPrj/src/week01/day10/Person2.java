package week01.day10;

//Class Type
public class Person2 {	
	
	private int age;
	private String name;
	private boolean isMarried;
	private int child;	
	
	
	
	//값을 입력받을 함수 (매개변수) this.
	public void member(int age, String name, boolean isMarried, int child) {
		
		this.age=age;
		this.name=name;
		this.isMarried=isMarried;
		this.child=child;
		
	}
	
	//값을 출력할 함수
	public void printInfo() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(isMarried);
		System.out.println(child);
	}
}


