package week01.day12.상속.inheritance.예제;

public class Ex01 {

	public static void main(String[] args) {
		
		//업캐스팅
		
		Person[] arr = new Person[5];
		
		arr[0]= new 한국();
		arr[1]= new 중국();
		arr[2]= new 일본();
		arr[3]= new 태국();
		arr[4]= new 몽골();
		
		for(int i=0;i<arr.length;i++) {
			(arr[i]).인사하기();
			
		}
		
		

		
		arr[0].대표위인();
		arr[1].대표위인();
		arr[2].대표위인();
		arr[3].대표위인();
		arr[4].대표위인();
		
		
		//다운캐스팅 
		arr[0].화폐단위();
		arr[1].화폐단위();
		arr[2].화폐단위();
		arr[3].화폐단위();
		arr[4].화폐단위();
		
		// 
		((한국)arr[0]).김치담구기();
		
	
		
		
		
	}
	
	
}
