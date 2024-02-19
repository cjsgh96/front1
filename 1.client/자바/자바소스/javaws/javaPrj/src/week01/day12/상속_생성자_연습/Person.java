package week01.day12.상속_생성자_연습;

public class Person {
	
	String name;
	String id;
	String add;
	
	public Person(String name, String id, String add) {
		this.name = name;
		this.id = id;
		this.add = add;
	}
	
	public Person() {
		System.out.println("기본생성자");
	}
	
	public void printInfo() {
		System.out.println(name+" "+id+" "+add);
	}
	
	
}
