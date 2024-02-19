package week01.day15.정렬.MyArrays;

public class MyComparatorImp implements MyComparator {

	@Override
	public int compare(Object o1, Object o2) {
		 
		 Score2 score1  = (Score2)o1;
		 Score2 score2 = (Score2)o2;
		 
		 return score1.getEng()- score2.getEng();    //기준이 컸을 때 양수가 반환되는 코드 
		// return score2.getKor()- score1.getKor();    // 내림차순 
		  
	}

}
