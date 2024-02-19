package week01.day14.io;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * 입출력스트림
		 * 입력스트림 : 데이터가 들어오는 길 ( 입력전용 메모리 버퍼 )
		 * 출력스트림 : 데이터가 나가는 길
		 * 
		 * */
		
		
		
	//한 바이트 읽어오기 코드(아스키코드값)	
	 try {
		for(int i=1;i<=5;i++) {
			int result = System.in.read();
			System.out.println((char)result);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 

	}

}
