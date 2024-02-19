package week01.day8;

public class 라이브러리사용하기2 {

	public static void main(String[] args) {
		
		int a,b;
		a=3;
		b=2;
		
		
		Jkw.hello();
		
		int result= WjyUtil.sum(a, b);
		System.out.println(result);
		
		int result2= WjyUtil.luckyNumber();
		System.out.println(result2);
	}

}
