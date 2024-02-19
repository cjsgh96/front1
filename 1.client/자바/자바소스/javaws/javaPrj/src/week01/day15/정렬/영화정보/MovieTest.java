package week01.day15.정렬.영화정보;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieTest {

	public static void main(String[] args) {
		 
	
		ArrayList<Movie> list = new ArrayList<>();
		
		
		list.add(new Movie("콘크리트 유토피아","드라마",1,"엄태화","130분"));
		list.add(new Movie("바비","드라마",7,"그레타 거윅","114분"));
		list.add(new Movie("밀수","범죄",2,"류승완","129분"));
		list.add(new Movie("엘리멘탈","애니메이션",3,"피터 손","109분"));
		list.add(new Movie("보호자","액션",10,"정우성","97분"));		
		list.add(new Movie("비공식작전","드라마",4,"김성훈","132분"));
		list.add(new Movie("더문","SF",5,"김용화","129분"));
		list.add(new Movie(" 미션 임파서블: 데드 레코닝 PART ONE","액션",6,"크리스토퍼 맥쿼리","163분"));
		list.add(new Movie("명탐정코난: 흑철의 어영","애니메이션",8,"타치카와 유즈루","110분"));
		list.add(new Movie("몬스터 패밀리2","애니메이션",9,"호거 태프","103분"));
		
		
		
		// 출력 	
		
		for( Movie movie  : list) {			
			System.out.println( movie);			
		}
		
		
		
		//정렬 		
		                          //익명클래스 작성하는 방법
		Collections.sort(list,  new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {				 
				return o1.ranking - o2.ranking;    // 기준이 클때 양수가 전달됨 
			}} );

		
		
		
		// 출력 	
		System.out.println( "랭킹순 정렬  ===> ");		
		for( Movie movie  : list) {			
			System.out.println( movie);			
		}
		
		 //정렬  장르순 정렬 
		
		Collections.sort( list,  new 영화이름순정렬());		
		
		// 출력 	
		System.out.println( "장르순 정렬  ===> ");		
		for( Movie movie  : list) {			
			System.out.println( movie);			
		}
		
		
	}

}
