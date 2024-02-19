package week01.day13.object;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		
		// 가변길이배열의 기능을 제공
		// 순서보장,중복허용,
		ArrayList list = new ArrayList();
		
		//3명의 학생정보
		list.add(new Score("홍길동",100,90));
		list.add(new Score("김길동",100,90));
		list.add(new Score("나길동",100,90));
		
		//3명의 학생 출력
		for(int i=0;i<list.size();i++) {
			Object o = list.get(i);
			System.out.println(o.toString());
			/*System.out.println(((Score)o).getName());*/
			
			Score score = null;
			score = (Score)o;
		}

	}

}
