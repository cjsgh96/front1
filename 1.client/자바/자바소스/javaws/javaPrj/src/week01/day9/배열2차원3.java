package week01.day9;

import java.util.Scanner;

public class 배열2차원3 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner( System.in);
		 String[][] 일정 = new String[10][5];
		 
		  
		 //등록
		 
		 //일정
		 
		 일정[0][0] ="자바공부";
		 
		 
		 
		 int row=0;
		 while(true) {	
			 
			 int col=0;
			 System.out.println("메뉴  1. 등록,  2.조회  , 3.변경 , 4조회");
			 String menu_ =  sc.nextLine();   //1
			 
			 switch (menu_ ) {
			 case "1":
				
				 inner :while( true) {					  
					 System.out.println(" 1.등록   2.종료" );
					 String choice = sc.nextLine();
					 
					 switch( choice) {
					 case  "1":
						 String  day  = sc.nextLine();
						 일정[row][col]= day;
						 col++;
						 break;
					 case  "2":						 
					 	 break inner;
					 }
				 }
			     break;
			 case "2":
				 
			 }
			 
		 }
		 
		 
		  

	}

}

	
 