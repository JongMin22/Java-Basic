package interction;

public class Main01 {
public static void main(String[] args) {
	Seller s1 = new Seller(20,20);
	Seller s2 = new Seller(30, 10 );
	Buyer b1 = new Buyer(100000);
	s1.showSeller();
	s2.showSeller();
	b1.showBuyer();
	
	b1.buyFruit(s1,5,5);
	s1.showSeller();
	b1.showBuyer();
	b1.buyFruit(s2, 5, 5);
	s2.showSeller();
	b1.showBuyer();
	
	
	
}
	
}
