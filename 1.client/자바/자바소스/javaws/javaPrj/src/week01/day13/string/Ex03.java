package week01.day13.string;

public class Ex03 {

	public static void main(String[] args) {
		
		String str3 = new String("hello2");
		
		String result = str3.replace('e', 'a');
		System.out.println(result);
		System.out.println(str3);
		//StringBuilder 
		//문자열의 내용을 변경할 때 사용하는 라이브러리
		StringBuilder s = new StringBuilder("hello2");
		s.setCharAt(0, 'k');
		
		System.out.println(s);
				
		
	}

}
