package week01.day14.io;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		
	//한 바이트 읽어오기 코드(아스키코드값)	
	 try {
		int result = System.in.read();
		System.out.println((char)result);
		
		int result2 = System.in.read();
		System.out.println((char)result2);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 

	}

}
