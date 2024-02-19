package week01.day12.상송inheritance.동물;

public class Ex05 {
	public static void main(String[] args) {
		
		//상속관계 Animal(부모) , Dog, Cat (자식)
		//부모에 있는 모든것을 물려 받는다.
		//단 접근에 대해서는 접근 제어자에 따른다.
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.쥐를잡는다();
		dog.짖는다();
		
		//상속에서 업캐스팅 (부모형으로 자료형을 변환시키는 것)
		
		Animal animal = new Animal();
		animal = /*(Animal)*/cat; // 가능(업캐스팅)
		// 업캐스팅 경우는 해석의 도구가 부모형으로 바뀌기 때문에 쥐를잡는다() 기능을 사용할 수 없다.
		
		Cat cat1 = (Cat)animal;
		
		cat1.쥐를잡는다();
	}
}
