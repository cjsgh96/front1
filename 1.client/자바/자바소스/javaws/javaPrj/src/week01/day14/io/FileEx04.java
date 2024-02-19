package week01.day14.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx04 {

	public static void main(String[] args) {
		
		try {
			FileWriter w = new FileWriter("RES/output.txt");
			w.write("안녕하세요");
			w.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
