package week01.day14.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
		//읽기 (입력) FileInputStream : 바이트 기반
		//쓰기 (출력) 
		
		
		//기반스트림
		//보조스트림
		
		try {
			FileInputStream fis = new FileInputStream("RES/input.txt");
			
			while(true) {
				int result = fis.read();
				if(result==-1)break;
				System.out.println((char)result);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
