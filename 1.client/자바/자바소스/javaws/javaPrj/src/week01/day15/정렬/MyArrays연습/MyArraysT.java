package week01.day15.정렬.MyArrays연습;

public class MyArraysT {
	
	//배열을 정렬하는 기능 만들기
	//입력:매개변수 , 배열정보, 정렬기준(  인터페이스로 만든다. 이름은 라이브러리를 만드는 사람이 정한다)
	public static void sort( Object[] arr,  MyComparatorT c) {
		
		for( int i=0; i< arr.length-1; i++) {
			for( int j=i+1; j< arr.length; j++) {				
				
				//비교후 교환
				if(   c.compare(arr[i], arr[j]) >0       ) {					
					//
					Object tmp;
					tmp = arr[i];
					arr[i]= arr[j];
					arr[j]=tmp;
					
					
				}
			}
		}
		
	}

}
