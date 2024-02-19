package week01.day10;

public class 객체맛보기_문제1 {

	public static void main(String[] args) {
		
		num1 user = new num1(); // 객체생성 기본코드 class명 객체명 = new class명();
		
		user.name ="james"; // 객체명.변수명
		user.age =40;
		user.m = true;
		user.c = 3;
		
		james(user);
	}
	public static void james(num1 user) {
		
		System.out.println("이름=>"+user.name);
		System.out.println("나이=>"+user.age);
		System.out.println("결혼여부=>"+user.m);
		System.out.println("자녀수=>"+user.c);
	}

}
