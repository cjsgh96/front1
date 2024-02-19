package 배열_배열문제풀이;

public class 별찍기2 {

	public static void main(String[] args) {
		
		//***** 첫번째줄
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		System.out.println("");
		//***** 두번째줄
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		System.out.println("");
		//***** 세번째줄
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.println("중첩반복으로 해결하기");
		
		for(int j=1;j<=3;j++) {
			for(int i=1;i<=5;i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
