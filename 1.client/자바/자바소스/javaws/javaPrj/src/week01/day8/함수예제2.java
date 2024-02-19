package week01.day8;

public class 함수예제2 {

	public static void main(String[] args) {
		
		//양치질하기
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
		
		System.out.println("=============================");
		//양치질하기
		양치질하기();
		System.out.println("=============================");
		int time = 양치질하기2();
		
		if(time>=3) {
			System.out.println("참 잘했어요");
		}else {
			System.out.println("다음엔 꼼꼼하게 하자");
		}
		System.out.println("=============================");
		
		time = 양치질하기3();
		if(time>=3) {
			System.out.println("참 잘했어요 ^^");
		}else {
			System.out.println("다음엔 꼼꼼하게 하자 !!");
		}
		
	}
	
	public static void 양치질하기() {
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
	}
	
	public static int 양치질하기2() {
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
		return 2;
	}
	
	public static int 양치질하기3() {
		System.out.println("치약을 짠다");
		System.out.println("이를 닦는다");
		System.out.println("헹군다");
		
		int time =(int) (Math.random()*4);
		return time;
		// int random=(int) (Math.random()*100+1); 
	}
}
