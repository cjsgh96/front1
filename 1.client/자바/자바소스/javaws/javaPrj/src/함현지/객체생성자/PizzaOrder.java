package 함현지.객체생성자;

public class PizzaOrder {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("포테이토 L","더블치즈엣지",27900);
		p1.order();
		
		Pizza p2 = new Pizza("페퍼로니 L","오리지널도우",18500);
		p2.order();
		
		Pizza p3 = new Pizza("페퍼로니 L","슈퍼시드",18500);
		p3.order();
		
		Pizza p4 = new Pizza("치즈 L","씬도우",23900);
		p4.order();
		
		
		
		Pizza[] menu = new Pizza[4];
		menu[0] = new Pizza("포테이토 L","더블치즈엣지",27900);
		menu[1] = new Pizza("페퍼로니 L","오리지널도우",18500);
		menu[2] = new Pizza("페퍼로니 L","슈퍼시드",18500);
		menu[3] = new Pizza("치즈 L","씬도우",23900);
		
		for(int i=0;i<menu.length;i++) {
			menu[i].order();
		}
	}

}
