package interction;

public class Seller {

	private int money; // 매출
	private int mango; // 재고(개수)
	private int apple; // 재고(개수)
	
	

	public Seller(int mango, int apple) {
	money =0;
	this.mango = mango;
	this.apple = apple;
	}
 
	public void sellFruit(int mango,int apple) {
    if(mango> this.mango) {System.out.println("망고가 부족합니다.");}
    else if(apple > this.apple) {System.out.println("사과가 부족합니다,");}
    else { money = 4000*mango + 2000*apple;
           this.mango = this.mango - mango;
           this.apple = this.apple - apple;}}
    
    public void showSeller() {
    	System.out.println("============판매자의 정보입니다.===========");
    	System.out.println("매출액 : " + this.money);
    	System.out.println("보유 망고 : " +  this.mango);
    	System.out.println("보유 사과 : " + this.apple);
    	System.out.println("=====================================");
    }
    public int getMango() {
    	return this.mango;
    }
    public int getApple() {
    	return this.apple;
    }

	
} 

