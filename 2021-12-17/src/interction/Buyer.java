package interction;

public class Buyer {

	private int money; //소지금
	private int mango; // 보유 망고 개수
	private int apple; // 보유 사과 개수

	
	public Buyer(int money) {
		this.money = money;
		mango = 0;
		apple = 0;
	}
		
    public void buyFruit(Seller seller,int mango,int apple) {
    	seller.sellFruit(mango, apple);
    	if(mango*4000+2000*apple > this.money) {System.out.println("소지금이 부족합니다.");}
    	else if(seller.getApple()< apple) {
    		System.out.println("사과 재고가 부족합니다.");}
        else if(seller.getMango() < mango) {
    			System.out.println("망고 재고가 부족합니다.");
    		}
        else {this.money = this.money - (4000*mango + 2000*apple);
              this.mango = this.mango + mango;
              this.apple = this.apple + apple;
        	
        }	
    }
    public void showBuyer(){
    	System.out.println("===========구매자의정보입니다.==========");
    	System.out.println("소지금 : " + this.money);
    	System.out.println("보유 망고 개수 : " + this.mango);
    	System.out.println("보유 사과 개수 : " + this.apple);
    	System.out.println("===================================");
    }
          	
       }


