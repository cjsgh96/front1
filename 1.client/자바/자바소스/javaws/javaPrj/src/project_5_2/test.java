package project_5_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class test {
	
	
	public static void main(String[] args) {
		ArrayList<testclass> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("res/test.txt"));
			String line;
			
			try {
				while((line = reader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
