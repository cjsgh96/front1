package week01.day9;

import java.util.Scanner;

public class 일정관리프로그램1 {

	public static void main(String[] args) {
		
		String arr[]= new String[5];
		int index=0;
		int j=1;
		Scanner sc = new Scanner(System.in);
		
		
		

		
		while(true) {
			System.out.println("1.등록하기 2.조회하기 3.변경하기 4.삭제하기 5.종료하기");
			String user_=sc.nextLine();
			int user=Integer.parseInt(user_);
			
			switch(user) {
				case 1: //배열에 5가지 담기 (등록하기)
						System.out.println("등록하세요");
						
						for(int i=0;i<j;i++) {
							String name=sc.nextLine();
							
							arr[index] = name;
							index++;
						}
						break;
				case 2: //배열에 담은 요소 꺼내기 (조회하기)
					
					for(int i=0;i<index;i++) {
						if(!arr[i].equals("0")) {
						System.out.println((i+1)+":"+arr[i]);
						}
					}
					break;
				case 3://배열에 담은 요소 바꾸기 ( 변경하기 )
					System.out.println("변경하실 내용을 선택하세요");
					for(int i=0;i<index;i++) {
						if(!arr[i].equals("0")) {
						System.out.println((i+1)+":"+arr[i]);
						}
					}
					{String num_=sc.nextLine();
					int num=Integer.parseInt(num_);
					num=num-1;
					System.out.println("변경할 내용을 입력하세요");
					String input=sc.nextLine();
					arr[num]=input;
					break;
					}
					
				case 4: //배열에 담은 요소 0으로 만들기 (삭제하기)
					System.out.println("삭제하실 내용을 선택하세요");
					for(int i=0;i<index;i++) {
						if(!arr[i].equals("0")) {
						System.out.println((i+1)+":"+arr[i]);
						}
					}
					{String num_=sc.nextLine();
					int num=Integer.parseInt(num_);
					num=num-1;
					arr[num]="0";
					break;
					}
				case 5: //프로그램 종료하기
					System.out.println("종료합니다");
					System.exit(0);
			}
		}

	}

}
