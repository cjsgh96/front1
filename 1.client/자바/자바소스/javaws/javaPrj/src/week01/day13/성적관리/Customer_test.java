package week01.day13.성적관리;

public class Customer_test {

	public static void main(String[] args) {
		
		Customer c = new Customer("v100","1234","홍길동");
		Customer c1 = new Customer("abc","4568","김길동");
		Customer c2 = new Customer("test","0000","관리자");
		
		//
		
		/*
		 * System.out.println(c.toString()); 
		 * System.out.println(c1.toString());
		 * System.out.println(c2.toString());
		 */
		// 각 고객의 비밀번호 변경하기
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		
		c.setPw("abc1234");
		c1.setPw("1a2a3a4a5a");
		c2.setPw("0058");
		
		System.out.println("=============변경후");
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		
		
		

	}

}
