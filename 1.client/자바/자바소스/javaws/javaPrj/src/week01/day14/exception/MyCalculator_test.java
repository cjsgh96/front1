package week01.day14.exception;

public class MyCalculator_test {

	public static void main(String[] args) {
		
		MyCalculator c = new MyCalculator();
		try {
			int result = c.add(-5, 3);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//
		
		int result2 = c.add2(-3, 1);
		System.out.println(result2);
		
		System.out.println("정상종료");
	}

}
