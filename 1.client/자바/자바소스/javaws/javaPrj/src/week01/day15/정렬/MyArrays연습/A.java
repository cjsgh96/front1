package week01.day15.정렬.MyArrays연습;

public class A  implements MyComparatorT{

	@Override
	public int compare(Object o1, Object o2) {
		 // 
		Customer c1 = (Customer)o1;
		Customer c2 = ( Customer)o2;
		//5895  , 1212
		return c1.pw - c2.pw ;
	}

}
