package week01.day12.상송inheritance.동물;

public class Ex03 {

	public static void main(String[] args) {
		
		
		//업캐스팅
		Animal a= null;
		a=	new Cat();
		
		//다운캐스팅 (옳바른 다운캐스팅) , 업캐스팅한것을 자식형으로 바꾸는 것이 다운캐스팅
		((Cat)a).쥐를잡는다();
		
		
		Animal b= null; 
		b=  new Dog();
		
		
		
		//
		a.짖는다();
		b.짖는다();
		
		
		//
		// a,b => 배열로 만든것
		Animal[] arr = new Animal[2] ; //객체 배열 선언하면 Animal 객체가 만들어진것이 아니다.
									   //Animal 객체를 담을수 있는 참조형 변수를 배열로 만든것이다. arr을 두개 만드는 행위 
		arr[0]= new Cat();// 
		arr[1]= new Dog();
		
		//arr[0].짖는다();// NullPointerException 발생
		//위의 코드 2줄 (객체를 생성하는 코드를 작성하지 않으면) 오류발생한다.
		
		arr[0].짖는다();
		arr[1].짖는다();
		
		//
		//instanceof 연산자 : 인스턴스가 판별
		for(int i=0;i<arr.length;i++) {
			arr[i].짖는다();
			System.out.println(i);
			//필요에 따라 다운캐스팅을 할 수 있다.
			if(arr[i] instanceof Cat) {
				((Cat)arr[i]).쥐를잡는다();
			}
		}

	}

}
