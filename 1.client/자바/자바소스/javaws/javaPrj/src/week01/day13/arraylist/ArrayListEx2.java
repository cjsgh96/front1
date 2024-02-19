package week01.day13.arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score("홍길동",100,90));
		list.add(new Score("김길동",90,90));
		list.add(new Score("나길동",80,90));
		
		for(int i=0;i<list.size();i++) {
			
			list.get(i).printInfo();
			
		}
	}

}
