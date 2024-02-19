package week01.day13.arraylist;

public class GList_test {

	public static void main(String[] args) {
		
		GList<Score> list = new GList<>();
		
		list.add(new Score("홍길동",100,90));
		list.add(new Score("김길동",90,90));
		list.add(new Score("나길동",80,90));
		
		for(int i=0 ; i<list.size(); i++) {
			list.get(i).printInfo();
		}
	}

}
