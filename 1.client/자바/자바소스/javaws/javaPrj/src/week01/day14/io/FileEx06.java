package week01.day14.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileEx06 {

	public static void main(String[] args) {
		
		String source ="res/img01.png";
		String output="res/복사이미지.png";
		
		try {
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(output);
			
			int data;
			while(true) {
				data = in.read();
				if(data==-1)break;
				out.write(data);
			}
			System.out.println("파일 복사가 완료");
			
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
