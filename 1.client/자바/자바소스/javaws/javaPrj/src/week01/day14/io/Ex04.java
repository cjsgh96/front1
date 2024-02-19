package week01.day14.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex04 {

	public static void main(String[] args) {
		
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		String result =	bs.readLine();
		System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
