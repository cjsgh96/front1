package week01.day12.인터페이스;

public class Ex01 {

	public static void main(String[] args) {
		
		Myrunnable[] runs = new Myrunnable[1];
		
		runs[0] = new WjyImp();
		
		for(int i=0;i<runs.length;i++) {
			runs[i].run();
		}

	}

}
