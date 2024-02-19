package week01.day15.정렬;

public class 문자열정렬 {

	public static void main(String[] args) {

		String tmp;
		String[] a = { "samsung", "lg", "apple" };		
		
		
		//선택정렬 
		for (int i = 0; i < a.length-1; i++) // selection sort
		{
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) // 기준이 크면 양수, 작으면 음수를 반환   
				{                            //크다의 의미 : 사전상 뒤에 위치함 
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a["+ i+"]=" + a[i]);
		
	}

}
