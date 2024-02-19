package week01.day12.상송inheritance.동물;

public class Ex02 {
	public static void main(String[] args) {
		
		Cat c = new Cat(); //상속시키면 자식클래스를 불러올때, 부모클래스가 같이 딸려온다.
		Dog d = new Dog();
		
		
		Animal a = new Cat();
		Animal b = new Dog();
		
		Animal[] arr = new Animal[2];
		arr[0]=new Cat();
		arr[1]=new Dog();
		
		//업캐스팅 : 자식객체를 부모형으로 다루는것
		//해석의 도구가 바뀐다. 실체가 바뀌는 것은 아니다.
		//instanceof 인스턴스 판별 연산자
		
		for(int i=0; i<arr.length;i++) {
			arr[i].먹는다();
			if(arr[i] instanceof Cat) {
				((Cat)arr[i]).쥐를잡는다();
			}
		}
		//업캐스팅과 다운캐스팅에서 실체가 바뀌지 않는다. 해석의 도구만 바뀐다 !!!
		//잘못된 다운 캐스팅 예시
		Animal animal = new Animal();
		
		//실행시 runtime 오류 ClassCastException
		Cat cat = (Cat)animal;
		cat.쥐를잡는다();
		
		
	}
}
