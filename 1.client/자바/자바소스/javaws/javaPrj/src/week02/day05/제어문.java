package week02.day05;

public class 제어문 {

	public static void main(String[] args) {
		
		//if문 , switch문(분기문)
		
		//if문 형식
		/*1)
		 * if(조건식){
		 * 		조건이 참일 때 수행할 코드
		 * }
		 * 
		 *2)
		 * if(조건식){
		 * 		참일때 수행코드;		
		 * }else{
		 * 		위의 조건이 아닌 그밖의 조건일 때
		 *  }
		 *    
		 *3)
		 *if(조건식){
		 *		조건이 참일때 수행코드
		 *}else if(조건식){
		 *		위의 조건이 아닐때 조건을 다시 확인해야 하는 경우 사용
		 *}else{
		 *		위의 조건이 모두 아닌경우 수행될 코드
		 *}
		 * */
		
		/* if 사용시 주의 사항
		 * 
		 * int kor=90;
		 * 
		 * 
		 * if(kor>=90;{
		 * 		System.out.println("A");
		 * }else if(kor>=80){
		 * 		System.out.println("B");
		 * }else{
		 * 		System.out.println("F");
		 * }
		 * 
		 *  조건이 만족하는 경우 if문 종료됨
		 *  
		 *  if(kor>=90){
		 *  	System.out.println("A");
		 *  }
		 *  
		 *  if(kor>=80({
		 *  	System.out.println("B");
		 *  }
		 *  
		 * */
			int kor=50;
			if(kor>=90) {
				System.out.println("A");
			}else if(kor>=80) {
				System.out.println("B");
			}else {
				System.out.println("F");
			}
			
			int kor2= 90;
			
			if(kor2>=90) {
				System.out.println("A");
			}
			
			if(kor2>=80) {
				System.out.println("B");
			}
			
			
			int myAge=27;
			int yourAge=26;
			
			if(myAge>yourAge) {
				System.out.println("내가 형이야");
			}
			if(myAge>yourAge) {
				System.out.println("내가 형이야");
			}else {// 위의 조건이 아닌경우
				System.out.println("친구이거나 너가 형이야");
			}
			
			if(myAge>yourAge) {
				System.out.println("내가 형이야");
			}else if(myAge==yourAge) {
				System.out.println("우린 친구");
			}else {
				System.out.println("너가 형이야");
			}
			//주의 사항 
			
			int score=99;
			char result;
			if(score>=90) {
				//System.out.println("A학점");
				result='a';
			}
			if(score>=80) {
				//System.out.println("B학점");
				result='b';
			}
			System.out.println("당신의 학점은"+result);

	}

}
