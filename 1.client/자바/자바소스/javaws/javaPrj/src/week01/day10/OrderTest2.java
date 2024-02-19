package week01.day10;

public class OrderTest2 {

	public static void main(String[] args) {
		 
		Order2 order  = new Order2();
		
		
		
		/*
		
		order2.orderNo ="201803120001" ;
		order2.id="abc123";
		order2.orderDate ="2018년3월12일";
		order2.name="홍길순";
		order2.addr ="서울시 영등포구 여의도동 20번지";
		order2.goodsNo="😛D0345-12";
		
		
		System.out.println( order2.orderNo );
		System.out.println( order2.id );
		System.out.println( order2.orderDate );
		System.out.println( order2.name );
		System.out.println( order2.addr );
		System.out.println( order2.goodsNo );
		
		*/
		
		order.input("201803120001","abc123","2018년3월12일","홍길순","서울시 영등포구 여의도동 20번지","😛D0345-12");
		order.printInfo();
		
	}

}
