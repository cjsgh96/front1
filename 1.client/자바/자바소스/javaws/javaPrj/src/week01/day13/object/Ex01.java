package week01.day13.object;

public class Ex01 {

	public static void main(String[] args) {
		
		// Object 클래스
		// 최상위 클래스
		// 모든 클래스는 상속을 받지 않으면 (extends Object) Object를 상속받게 되어 있다.
		
		Score s = new Score("홍길동",100,90);
		
		System.out.println(s);
		
		//업캐스팅 부모형 참조변수에 저장할 수 있다.
		Object o=null; // 참조형 변수 선언, 초기화 (null)
		o=s; // 상속관계에서 업캐스팅 가능
			 // 부모형으로 축소됨 (사용가능한 매서드가 줄어든다)
		
		
		System.out.println(o);		
		
		//객체의 정보를 출력하기
		
		Cat cat = new Cat("나비");
		Dog dog = new Dog("멍멍이");
		
		Score score = new Score("가길동",100,90);
		
		System.out.println(cat);
		System.out.println(dog);
		System.out.println(score);

		
		Object o1 = cat;  //업캐스팅 , 부모형으로 축소됨
		Object o2 = dog;
		Object o3 = score;
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(o3.toString());
		
		// Cat객체는 Cat형으로 사용할 수 있다.
		// Cat객체는 Object형으로 사용할 수 있다. ( 상속 관계이기 때문에 )
		
		Object[] arr = new Object[3];
		arr[0]=cat;
		arr[1]=dog;
		arr[2]=score;
		
		System.out.println("객체의 정보를 출력하기");
		for(int i=0;i<arr.length;i++) {
		/*System.out.println(arr[i].toString());*/
			System.out.println(arr[i]);
		}
		
		
		

		
		
		
	}

}
