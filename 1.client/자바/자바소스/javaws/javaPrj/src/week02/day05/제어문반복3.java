package week02.day05;

public class 제어문반복3 {

	public static void main(String[] args) {
		
		/*
		 * 중첩반복
		 * 별 하나를 이용해서
		 * 
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	만들기
		 * */
		for(int n=1;n<=3;n++) {				
			for(int i=1;i<=5;i++) {
				System.out.print("*");
			}
				
		}
		for(int k=1;k<=3;k++) {
			System.out.println("안녕");
		}
	}

}
