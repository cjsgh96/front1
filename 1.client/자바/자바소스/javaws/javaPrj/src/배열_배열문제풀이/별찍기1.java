package 배열_배열문제풀이;

public class 별찍기1 {

	public static void main(String[] args) {
		
		
		System.out.println("별5개출력하기");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.println("");//줄바꾸기
		System.out.println("별5개 출력하기 - 반복문 for");
		
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		System.out.println(""); //줄변경
		System.out.println("별5개 출력하기 - 반복문 while");
		
		int j=1;
		while(j<=5) {
			System.out.print("*");
			j=j+1;
		}
		System.out.println(""); //줄변경
		
		
	}

}
