package 배열_배열문제풀이;

import java.util.Scanner;

public class 배열문제풀이3 {

	public static void main(String[] args) {
		//입력받은 배열의 평균을 구하고 평균값보다 큰 요소 구하기
		
		Scanner sc = new Scanner (System.in);
		
		
		int[] su = new int[5];
		
		for(int i=0;i<5;i++) { // 사용자의 값을 배열에 담기
			int user =sc.nextInt();
			su[i] = user;
		}
		int sum=0;
		for(int j=0;j<5;j++) {  //배열의 합 구하기
			sum=sum+su[j];   
		}
		int avg;
		avg=sum/5;  //배열의 평균 구하기
		
		int cnt=0;
		int cnt2=0;
		int k=0;	// 큰 수 카운트  			
		
		for(int q=0;q<5;q++) { //배열의 수가 평균보다 작은지 큰지 구분하기
			if(avg<su[k]) {
				
				cnt++;
			}else {
				cnt2++;
			}
			k++;
		}
		System.out.println("평균보다 큰수의 갯수는=>"+cnt);
		System.out.println("평균보다 작거나 같은수의 갯수는=>"+cnt2);
		
		
		
		
		
		

	}

}
