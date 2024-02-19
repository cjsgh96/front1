package week01.day15.정렬;

public class 객제배열정렬하기 {

	public static void main(String[] args) {


		Score[]  list  = new Score[3];
		
		list[0] = new Score("김기엽", 100,98);
		list[1] = new Score("양홍섭", 99,95);
		list[2] = new Score("이민재", 97,100);
	 
		
		//직접 정렬하기 
		//선택정렬 알고리즘 
		
		for( int i=0 ; i< list.length-1 ;  i++) {			
			
			for( int j=i+1 ;j< list.length ;j++) {				
				//요소의 비교와 교환 
				if( list[i].kor >  list[j].kor) {
					//
					Score tmp;
					tmp = list[i];  //백업
					list[i]= list[j];
					list[j]= tmp;
					
				}
				
				
			}
		}		
		
		
		//
		System.out.println(" 국어점수  정렬후==>");
		
		for( Score   score : list) {
			System.out.println( score);
		}
		
		
		
		
		//영어점수 정렬하기 
		
		for( int i=0 ; i< list.length-1 ; i++ ) {			
			
			for( int  j=i+1; j< list.length ; j++) {
				
				if( list[i].eng  >   list[j].eng) {
					Score tmp;
					tmp = list[i];
					list[i]= list[j];
					list[j]= tmp;
					
				}
				
			}
			
		}
		
		System.out.println(" 영어점수  정렬후==>");
		
		for( Score   score : list) {
			System.out.println( score);
		}
		
		
		
		//이름순으로 정렬하기 
		
		for( int i=0; i< list.length-1 ; i++) {
			
			for( int j=i+1; j< list.length ; j++) {
				 
				if( list[i].name.compareTo(list[j].name) >0) {
					
					Score tmp;
					tmp= list[i];
					list[i]=list[j];
					list[j]= tmp;
				}
				
			}
		}
		
		
		System.out.println(" 이름순   정렬후==>");
		
		for( Score   score : list) {
			System.out.println( score);
		}
		
	}

}
