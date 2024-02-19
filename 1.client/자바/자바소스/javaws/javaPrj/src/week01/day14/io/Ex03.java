package week01.day14.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		
		//입력 
		//출력 
		
		
		//기반스트림
		//보조스트림
		
		//한 문자 읽기
		//보조스트림을 이용해서 한 문자를 읽어오기
		
		InputStreamReader is = new InputStreamReader(System.in);
		
		try {
			int result = is.read();
			System.out.println((char)result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
