package week01.day9;

import java.util.Scanner;

public class 배열2차원2 {

	public static void main(String[] args) {


		 String[][] 일정 = new String[3][3];
		 
		 
		 Scanner sc = new Scanner( System.in);
		 for( int i=0 ; i<3; i++) {			 
			 for( int j=0; j<3; j++) {
				 일정[i][j]= sc.nextLine();
				 //일정[i][j]= "정기원";
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //
		 for( int  i=0; i<3 ;i++) {			 
			for( int j=0; j<3 ; j++) {
				 System.out.print( 일정[i][j]  +  "   ");
			}			 
			
			System.out.println();
			 
		 }

	}

}

	
 