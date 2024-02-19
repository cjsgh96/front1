package week01.day14.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		
		//FileReader => 기반스트림
		try {
			FileReader fis = new FileReader("RES/acorn.txt");
			int result = fis.read();
			System.out.println((char)result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
