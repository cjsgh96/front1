package week01.day12.상송inheritance.동물;

public class Ex01 {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.먹는다();
		c.쥐를잡는다();
		
		// (상속 관계에서 !!!!)
		//부모클래스, 상위클래스 , super (물려주는 클래스)
		//자식클래스, 하위클래스 , sub클래스 (물려받는 클래스)
		//자식의 객체를 부모형참조형 변수로 다룰 수 있다. (상속관계에서는)
		
		Animal animal=null; //참조형변수 기본값 =>null 의미: 참조하고 있지 않다.
		animal = c; // 업캐스팅 (upcasting)
		
		animal.먹는다(); // 업캐스팅 알아야 할것 !!!, 부모형으로 축소됨
					   // 자료형은 해석의 도구
					   // cat이 가지는 기능을 사용할수 없다.
		
		
		//다운캐스팅 !!! 옳바른 다운 캐스팅 !! ( 실체 ,객체가 누구냐 확인해야한다) !!
		//
		((Cat)animal).짖는다();
		//Cat 형으로 변환하는 코드 수행한 후 쥐를 잡는다 매서드 호출
		
		//다운캐스팅 !!
		Cat cat = (Cat)animal; //다운캐스팅, 명시적으로 들어내야 할
		cat.쥐를잡는다();
		
		
	}

}
