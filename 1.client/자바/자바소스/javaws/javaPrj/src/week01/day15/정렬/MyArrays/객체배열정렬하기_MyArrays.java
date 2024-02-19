package week01.day15.정렬.MyArrays;

public class 객체배열정렬하기_MyArrays {
	public static void main(String[] args) {
		
		
		
		Score2[]  arr = new Score2[3];
		
		arr[0]= new Score2( "김기엽", 89, 90);
		arr[1]= new Score2( "양홍섭", 100, 99);
		arr[2]= new Score2( "이민재", 99, 89);
		
				
		MyArrays.sort(arr);
		
		//객체의 기본정렬 방법
		System.out.println( "국어점수 정렬" );
		for( Score2  score : arr) {
			System.out.println( score);
		}
		
		
		// 정렬의 기준을  MyComparator를 구현한 객체에서 얻어옴 		
		MyComparatorImp a = new MyComparatorImp();		
	 	MyArrays.sort( arr , a  );
	 	
	 	
	 	System.out.println( "영어점수 정렬" );
		for( Score2  score : arr) {
			System.out.println( score);
		}
	 	
	 	
	 	
	 	
		
		
	}

}
