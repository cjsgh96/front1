package week01.day12.상속.inheritance.춤추기;

public class Ex01 {

	public static void main(String[] args) {
		
		Person a = new 정기원();
		
		정기원 j = new 정기원();
		
		((정기원)j).춤추기();
		
		Person b = new Person();
		b.춤추기();
		
		Person cb = new Person();
		정기원 c = (정기원)cb;
		
		c.춤추기();
	}

}
