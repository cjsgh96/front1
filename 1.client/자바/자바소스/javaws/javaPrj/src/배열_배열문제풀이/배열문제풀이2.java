package 배열_배열문제풀이;

import java.util.Scanner;

public class 배열문제풀이2 {

	public static void main(String[] args) {
		//입력받은 수의 짝수를 배열에 담기
		Scanner sc = new Scanner (System.in);
		
		
		int[] su= new int[5];
		
		int i=0;
		while(i<5) {
			int user=sc.nextInt();
			if(user%2==0) {
			
				su[i] = user;
				i=i+1;
			}else {
				continue;
			}
			
			int j=0;
			for(j=0;j<5;j++) {
				System.out.println("배열에 담은 짝수는"+su[j]);
			}
			
		}
		
		

	}

}
