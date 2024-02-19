package week01.day04;

import java.util.Scanner;

public class 정기원매운맛2 {

	public static void main(String[] args) {
		int a=2000, b=2500, c=3000, d=4000;
		String name; 
		int rank, time;
		
		Scanner sc = new Scanner(System.in);
		
		name = sc.next();
		rank = sc.nextInt();
		time = sc.nextInt();
		
		if(rank==1) {
			System.out.println(a*time);
		}else if(rank==2){
			System.out.println(b*time);
		}else if(rank==3) {
			System.out.println(c*time);
		}else if(rank==4) {
			System.out.println(d*time);
		}
			
	}
}
