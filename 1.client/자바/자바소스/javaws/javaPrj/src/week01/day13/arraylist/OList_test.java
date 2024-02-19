package week01.day13.arraylist;

public class OList_test {

	public static void main(String[] args) {
		OList list = new OList();
		
		list.add(new Score("홍길동",100,90));
		list.add(new Score("김길동",90,90));
		//list.add(new Score("나길동",80,90));
		
		for (int i=0;i<list.size();i++) {
			Object o =  list.get(i);
			//System.out.println(o.toString());
			//System.out.pritnln(o);
			((Score)o).printInfo();
		}
		
		
		
	}

}
