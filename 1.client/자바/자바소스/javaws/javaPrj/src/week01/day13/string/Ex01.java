package week01.day13.string;

public class Ex01 {

	public static void main(String[] args) {
		
		String str= "자바는 객체 지향 언어이다. class(캡슐화),상속,오버라이드,다형성";
		
		//다형성
		//하나의 메세지 => 다르게 동작하는 것
		
		//19명의 학생이 있다.
		//학생 => 춤추세요() // 각기 다른 춤을 추는 동작을 볼 수 있다. (다형성)
		
		//문자열 => 문자집합 , 문자배열
		//자바는 String 클래스 제공함
		
	
		
		char result = str.charAt(4);
		char result2 = str.charAt(0);
		System.out.println(result);
		System.out.println(result2);
		
		Object o = str; // 업캐스팅 (부모형으로 다루는 것)
		
		int count =((String)o).length();
		System.out.println(count);
		

	}

}
