package week01.day15.정렬;

import java.util.Arrays;

public class 객제배열정렬하기_라이브러리 {

	public static void main(String[] args) {


		Score2[]  list  = new Score2[3];
		
		list[0] = new Score2("김기엽", 100,98);
		list[1] = new Score2("양홍섭", 99,95);
		list[2] = new Score2("이민재", 97,100);
	 
		 
		//정렬		
	    Arrays.sort( list);	
				 
		
		for( Score2   score : list) {
			System.out.println( score);
		}
		
		
		 
		
	}

}
