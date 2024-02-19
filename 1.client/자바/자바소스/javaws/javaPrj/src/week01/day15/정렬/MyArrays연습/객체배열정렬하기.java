package week01.day15.정렬.MyArrays연습;

import java.util.Arrays;
import java.util.Comparator;

public class 객체배열정렬하기 {

	public static void main(String[] args) {
		 

		
		
		Customer[] list  = new Customer[3];
		
		list[0] = new Customer("t001",5678);
		list[1] = new Customer("a100",2314);
		list[2] = new Customer("c100",1212);
		
		
		//정렬
		
		//
		
		//A a = new A();		
		//MyArraysT.sort(list, a );
		
		//MyArraysT.sort(list, new A() );
	
		 		
	// 익명클래스를 작성해서 사용할 수 있다. 
	//	MyArraysT.sort(list,   new MyComparatorT() {} );
	 	MyArraysT.sort(list,   new MyComparatorT() {

			@Override
			public int compare(Object o1, Object o2) {			 
				Customer  c1 =( Customer)o1;
				Customer  c2  =(Customer) o2;			
				
				return c1.pw- c2.pw;
			}} );
		
	 	
 
	 	
	 	
	 	
	 	
		for( Customer customer : list) {
			System.out.println( customer);
		}
		
		
		
		//id를 가지고 정려하고 싶다 
		
		MyArraysT.sort(list, new MyComparatorT() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				
				Customer  c1 = ( Customer)o1;
				Customer c2  = ( Customer)o2;				
				 
				return c1.id.compareTo(c2.id)  ;   // c1의 id가 크다면 양수가 전달된다. 
			}});
		
		
		
		
		System.out.println( " id 순으로 정렬 ===>");
		for( Customer customer : list) {
			System.out.println( customer);
		}
	 
		
		
		
		Arrays.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Customer c1  = ( Customer)o1;
				Customer c2  = ( Customer)o2; 
				return c1.pw  - c2.pw;
			}} );
		
		
		
		System.out.println( " pw 순으로 정렬 ===>");
		for( Customer customer : list) {
			System.out.println( customer);
		}
	 		
		
	}

}
