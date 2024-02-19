package week01.day13.arraylist;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		
		list.add(new Score("하림",100,90));
		list.add(new Score("대치",90,90));
		list.add(new Score("여윽",99,90));
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
			((Score)list.get(i)).printInfo();
		}
	}
	
}
