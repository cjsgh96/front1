package 함현지.객체생성자;

import java.util.Scanner;

public class PizzaOrder2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Pizza2[] menu = new Pizza2[4];
		
		for(int i=0;i<menu.length;i++) {
			/*
			 * 	private String name;
				private String dough;
				private int price;
			 * */
			String name = sc.nextLine();
			String dough = sc.nextLine();
			String price_=sc.nextLine();
			int price =Integer.parseInt(price_);
			menu[i] = new Pizza2(name,dough,price);
			menu[i].print();
		}
	}

}
