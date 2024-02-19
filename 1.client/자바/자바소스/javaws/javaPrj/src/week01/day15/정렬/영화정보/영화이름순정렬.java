package week01.day15.정렬.영화정보;

import java.util.Comparator;

public class 영화이름순정렬   implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		 
		Movie m1 = (Movie)o1;
		Movie m2 = ( Movie) o2;		
		return m1.genre.compareTo(m2.genre);  // 기준의 장르의 이름 크면(뒤에 있으면) 양수가 전달 
	}

}
