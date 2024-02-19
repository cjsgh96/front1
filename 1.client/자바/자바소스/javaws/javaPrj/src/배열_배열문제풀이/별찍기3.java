package 배열_배열문제풀이;

public class 별찍기3 {

	public static void main(String[] args) {
		
		
		// 행마다 별 증가시키기 반복문 안의 반복문 증가시키며 빠져나오기
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
			
			
	}
		

}


