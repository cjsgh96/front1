package week01.day13.string;

public class Ex02 {

	public static void main(String[] args) {
		
		String str1 = "hello" ;
		String str2 = "hello" ;
		
		//두 문자열의 내용이 같은지 판단하기
		
		boolean result =  str1.equals(str2); // true , false // .equals
		System.out.println(result);
		
		//참조값을 비교한다
		if(str1 == str2) {
			System.out.println("str1,str2참조가 같다");
		}
		
		String str3 = new String("hello2");
		String str4 = new String("hello2");
		
		if(str3 == str4) {
			System.out.println("str3,str4 참조가 같다");
		}else {
			System.out.println("str3,str4 참조가 같지않다");
		}
		
		boolean result2 = str3.equals(str4);
		System.out.println(result2);
		
		//str3 =>hello2로 만들어진 문자열 객체는 변경될 수 없다.
		

	}

}
