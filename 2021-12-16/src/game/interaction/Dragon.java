package game.interaction;

public class Dragon {

	private int hp;
	private int atk;
	private int def;
	
	public Dragon() {
		hp = 100;
		atk = 6;
		def = 4;
	}
	public void doBattle(int uAtk) {
		hp = hp + def - uAtk;
		if(hp <= 0) {hp =0; System.out.println("드래곤을 처치하였습니다.");}
		else{System.out.println("드래곤의 남은 체력 : "+ hp);}
		
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


