package week01.day15.정렬;

import java.util.Arrays;

public class 정렬하기 {

	public static void main(String[] args) {
		 
		//정렬  - 오름차순 (기본)  , 내림차순
		
		int[] kors= {70,80,100,50,30};
		
		//각 요소 비교 , 교환 
		
		
		//선택정렬
		
		//중첩반복
		//외부반복
		for( int i=0 ; i< kors.length-1 ; i++) {			
			
			//내부반복
			for( int  j=i+1; j<kors.length ; j++) {				
				
				if( kors[i]  >  kors[j] ) {  // 요소의 교환  => 임시변수
					int tmp;
					tmp = kors[i];
					kors[i] = kors[j];
					kors[j]= tmp;
					
				}
			}
		}
		
		
		
		//
		String result  = Arrays.toString( kors);
		System.out.println( result);
		
		
		int[] engs= {80,100,77,99,55};
		Arrays.sort(engs);
		
		
		for( int i=0; i< engs.length ; i++) {
			System.out.print(  engs[i] + " ");
		}
		
		
		
		
		
		

	}

}
