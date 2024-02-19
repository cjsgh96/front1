package week01.day14.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {
		
		try {
			BufferedReader bf =new BufferedReader(new FileReader("RES/acorn.txt"));
			while(true) {
				String result = bf.readLine();
				if(result==null)break;
				System.out.println(result);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
