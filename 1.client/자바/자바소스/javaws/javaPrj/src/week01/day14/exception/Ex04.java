package week01.day14.exception;

import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		
		
		
		//한 바이트 읽어옴
		
		int result=0;
		try {
			result = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((char)result);

	}

}
