package week01.day14.io.실습1;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		
		try {
			FileWriter w = new FileWriter("RES/test2.text");
			w.write("반갑다");
			w.flush();
			
			System.out.println("생성했습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
