package week01.day7문제풀이;

import java.util.Scanner;

public class 배열문제풀이_화폐2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int[] money = new int[8];
		String[] unit= {"오만원:" ,"만원:" ,"오천원:","천원:", "오백원:","백원:","오십원:","십원:"} ;
		money[0]=50000;
		money[1]=10000;
		money[2]=5000;
		money[3]=1000;
		money[4]=500;
		money[5]=100;
		money[6]=50;
		money[7]=10;
		
		
		int[] money2 = new int[8];
		int input=sc.nextInt();
		//312550
		
		for(int i=0;i<8;i++) {
			money2[i]=input/money[i];
			//input=input-(money2[i]*money[i]);			
			input=input%money[i];
		}
		for(int i=0;i<8;i++) {
			System.out.print(unit[i]+"  "+money2[i]+"  ");
		}
		
		
	}

}
