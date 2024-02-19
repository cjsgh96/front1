package week01.day14.성적관리;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_test {

	public static void main(String[] args) {
		
		ArrayList<Score> list =  new ArrayList<>();
		
		//등록
		
		list.add(new Score("김연수",100,99));
		Score s = new Score("김수진",100,100);
		list.add(s);
		
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng;
		
		System.out.println("성적입력");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt(); 
		
		Score score = new Score(name,kor,eng);
		
		list.add(score);
		//조회
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
		//변경
		System.out.println("김수진학생 성적 변경");
		
		for(int i=0;i<list.size();i++) {
			Score tmpscore = list.get(i);
			if(tmpscore.getName().equals("김수진")) {
				tmpscore.setKor(99);
			}
		}
		//조회
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
		//삭제
		System.out.println("학생성적 삭제하기");
		//첫번째 학생 => 1번 => 0번 삭제
		int index=1;
		list.remove(index-1);
		
		//조회
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
