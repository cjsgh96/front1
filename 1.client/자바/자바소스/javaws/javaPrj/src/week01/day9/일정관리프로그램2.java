package week01.day9;

import java.util.Scanner;

public class 일정관리프로그램2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String[][] day = new String[5][5];
		int index=0;
		int index2=0;
		int j=1;
		
		
		
		loop:while(true) {
			System.out.println("원하는 날짜를 입력하세요");
			String user_=sc.nextLine();
			int user=Integer.parseInt(user_);
			
			switch(user) {
			case 1:
				System.out.println("1일");
				
				
				
				
				while(true){
					System.out.println("1.일정등록 2.일정확인 3.일정변경 4.처음으로");
					String num_=sc.nextLine();
					int num=Integer.parseInt(num_);
				switch(num){
					case 1:
							for(int i=0;i<j;i++) {
								System.out.println("일정을 등록하세요");
								String today=sc.nextLine();
								day[index][index2]=today;
								index2++;
							}
							break;
					case 2:
					일정확인(day, index2);
						break;
					case 3:
						System.out.println("변경하실 일정을 선택하세요");
						
						일정확인(day, index2);
						
						String input_=sc.nextLine();
						int input=Integer.parseInt(input_);
						input=input-1;
						System.out.println("새로운 일정을 입력하세요");
						String today=sc.nextLine();
						day[0][input]=today;
						break;
					case 4:
						break loop;
				}
			}
			case 2:
			case 3:
			case 4:
			case 5:
				
			}

		}
	}

	public static void 일정확인(String[][] day, int index2) {
		for(int i=0;i<index2;i++) {
			System.out.println((i+1)+":"+day[0][i]);
		}
	}

}


