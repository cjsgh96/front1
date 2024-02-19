package week01.day7문제풀이;

import java.util.Scanner;

public class 배열문제풀이_화폐 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int input=sc.nextInt();
		
		int money[] = new int[8];
		
	
		// 317520
		int su=0;
		
		if(input>50000) {
			
			money[0]=input/50000;
			su=50000*money[0];
			input=input-su;
			if(input>10000) {
				money[1]=input/10000;
				su=10000*money[1];
				input=input-su;
				if(input>5000) {
					money[2]=input/5000;
					su=5000*money[2];
					input=input-su;
					if(input>1000) {
						money[3]=input/1000;
						su=1000*money[3];
						input=input-su;
						if(input>500) {
							money[4]=input/500;
							su=500*money[4];
							input=input-su;
							if(input>100) {
								money[5]=input/100;
								su=100*money[5];
								input=input-su;
								if(input>50) {
									money[6]=input/50;
									su=50*money[6];
									input=input-su;
									if(input>10) {
										money[7]=input/10;
										su=10*money[7];
										input=input-su;
									}
								}
							}
						}
					}
				}
			}
		}
		
		for(int i=0;i<8;i++) {
			
			System.out.println(money[i]);
			System.out.println(input);
		}
		
		
	
		
	}

}
