package game.accessmodifier;

public class Warrior extends Commoner {

	public Warrior(String name) {
		super(name);
		
	}
	public void hunt() {
	if(getHp() <= 0) {setHp(0); setExp(0); System.out.println("체력이 부족해 전사가 사망했습니다.");}
	else {System.out.println(getName()+"가 사냥을 시작합니다.");
		setHp(getHp() - 2);
	      setExp(getExp() + 10);
	      }
	}
	
	
	public void doubleAttack() {
	   if(getHp()  <= 1) { setHp(1); System.out.println("체력이 부족해 스킬을 시전할수 없습니다.");}
	   else {setHp(getHp() - 4);
	         setExp(getExp() + 25);   }
   }
   public void drinkHp() {
	   if(getHp() >= 5000) {System.out.println("체력이 최대 체력에 도달했습니다.");}
	   else {setHp(getHp() + 30);
	   System.out.println(getName()+"의 체력이 회복되었습니다.");}
   }
   public void drinkMp() {
	      if(getMp() >= 1000) {System.out.println("마나 충전량이 최대입니다.");}
	      else {setMp(getMp() + 10);
	      System.out.println(getName()+"의 마나가 회복되었습니다.");}

   }
   public void getInfo() { 
		    System.out.println(getName()+"의 정보입니다.");
			System.out.println("현재 체력 : " + getHp());
			System.out.println("현재 마나 : " + getMp());
		    System.out.println("현재 경험치 : " + getExp());
		    System.out.println("현재 레벨 : " + getLv());
		    
}
}