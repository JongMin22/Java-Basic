package game.inheritance;
public class Warrior extends Commoner{

	private int  pDam;
	


 public Warrior(String name){ 
       super(name);	
      this.pDam = 100;
}
public void getInfo() {
	
	System.out.println("전사 캐릭터 정보입니다.");
	System.out.println("아이디 :" + name);
	System.out.println("레벨 :" + level);
	System.out.println("경험치 :" + exp);
	System.out.println("체력 :" + hp);
	System.out.println("마나 :" + mp);
	System.out.println("물리데미지 :" + pDam);
 

}
}