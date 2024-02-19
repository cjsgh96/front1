package week01.day12.상속_접근제어자;

public class Student extends Person {
	
	int classNo;
	

	public Student() {
		
	}
	
	

	public Student(String name, String id, int classNo) {
		super(name,id); // 부모의 생성자를 명시적으로 호출하는 코드
		this.classNo = classNo;
	}
	
	
	//정보출력
	public void print() {
		System.out.println(getName()+" "+getId()+" "+classNo);
	}
}
