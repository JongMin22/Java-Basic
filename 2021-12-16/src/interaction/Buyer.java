package interaction;

public class Buyer {
 
	private int money; //소지금
	private int mango;
	
public Buyer() {
	money = 50000;
	mango = 0;
	
}
 public void buyMango(Seller seller, int mango) { 
	
	seller.sellMango(mango);
	if(money - mango*5000 < 0 ) {money = money;System.out.println("돈이 모자랍니다.");} 
	else{money = money -mango*5000;
		this.mango = this.mango + mango;}
	if(seller.getMango() < mango) {System.out.println("망고재고가 부족합니다 "
			+ "망고 재고 : "+seller.getMango());
	return;}
	System.out.println("망고 "+ this.mango+"개 를 "+ mango*5000 +"원에 구매했습니다.");
    
}
public void showBuyer() {
	System.out.println("=============구매자 정보==============");
	System.out.println("보유 망고: "+ this.mango+"개, 소지금 : " + this.money);
	System.out.println("===================================	");

}
}
