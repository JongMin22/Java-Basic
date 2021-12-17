package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
public Magician() {
	hp = 15;
	mp = 100;
	atk = 5;
	def = 1;
	exp = 0;
}
public void huntOrc(Orc orc) {
	orc.doBattle(this.atk);
	if(orc.getHp() == 0) {System.out.println("오크가 처치되어 교전을 할수 없습니다.");}
	else {this.hp = this.hp + this.def - orc.getAtk();}
       System.out.println("교전 결과 법사의 체력 : " + this.hp);
}
public void huntTroll(Troll troll) {
	troll.doBattle(this.atk);
	if(troll.getHp() == 0) {System.out.println("트롤이 처치되어 교전을 할수 없습니다.");}
	else {this.hp = this.hp + this.def - troll.getAtk();}
       System.out.println("교전 결과 법사의 체력 : " + this.hp);
}
public void huntDragon(Dragon dragon) {
	dragon.doBattle(this.atk);
	if(dragon.getHp() == 0) {dragon.setAtk(0); System.out.println("트롤이 처치되어 교전을 할수 없습니다.");}
	else {this.hp = this.hp + this.def - dragon.getAtk();}
       System.out.println("교전 결과 법사의 체력 : " + this.hp);
      
} 
}
