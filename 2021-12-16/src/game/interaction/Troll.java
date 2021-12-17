package game.interaction;

public class Troll {

	private int hp;
	private int atk;
	private int def;


	public Troll() {
		hp = 10;
		atk = 3;
		def = 3;
		
	}
	
	
	public void doBattle(int uAtk) {// 전사의 공격 결과 트롤이 죽었다면 ( 체력이0 이하라면 )
		hp = hp + def - uAtk;
	if(hp <=0 ) {hp = 0; System.out.println("트롤을 처치하였습니다.");}
	 System.out.println("트롤의 남은 체력 : "+ hp);
		    
	}
	



	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}

}
