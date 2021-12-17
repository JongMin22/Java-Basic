package interaction;

public class Seller {
	private int money; //매출 초기값 = 0;
	private int mango; //재고 입력받자
	
public Seller(int mango) {
	this.money = 0;
    if(mango <=0 ) {mango =0;}
	this.mango = mango;
    }  	
public void sellMango(int mango) {
	
	if(this.mango < mango) {System.out.println("망고가 모자랍니다.");
	return;}
	this.mango = this.mango - mango;
	this.money = this.money + mango*5000;
}
public void showSeller() {
	System.out.println("-------상인 정보--------");
	System.out.println("현재 소지금 : " + money);
	System.out.println("망고 개수 : " + this.mango);
	System.out.println("-----------------------");
}
public int getMango() {
	return mango;
}


}
