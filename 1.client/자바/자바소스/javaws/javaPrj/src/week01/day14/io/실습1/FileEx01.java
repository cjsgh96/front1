package week01.day14.io.실습1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) {
		
		
		//만들기
		//파일이 없으면 만들고 있으면 덮어씌운다.
		try {
			FileWriter w = new FileWriter("RES/test.txt"); 
			w.write("나도정기원이야"); // 입력코드
			w.flush(); // 생성코드
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//읽기
		try {
			BufferedReader bf = new BufferedReader(new FileReader("RES/test.txt"));
			while(true) {
				String result = bf.readLine();
				if(result == null)break;{
				System.out.println(result);
				}
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
