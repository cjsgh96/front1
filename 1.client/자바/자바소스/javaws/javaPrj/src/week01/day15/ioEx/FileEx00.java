package week01.day15.ioEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileEx00 {

	
	//파일  : 바이트스트림 : 입력용, 출력용
	//      문자스트림  : 입력용 , 출력용
	public static void main(String[] args) {
	 
		//기반스트림
		try {
			FileInputStream fis = new FileInputStream("res/test.txt");
			int data1=fis.read();
			System.out.println( (char)data1);
			
			data1=fis.read();
			System.out.println( (char)data1);
			
			
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
	}

}
