package game.interaction;

public class Orc {
	  private int hp;
	  private int atk;
	  private int def;

	  public Orc() {
		  this.hp = 5;
		  this.atk = 3;
		  this.def = 0;
	  }

	  // 교전을 할 경우 상호간에 수치값이 교환되어야 합니다.
	  // Warrior쪽에서 Orc쪽의 수치를 깎아주고
	  // Orc쪽에서 Warrior의 수치를 깎아야합니다.
	  
	  
	  // getter/setter를 Warrior, Orc에 만들어주세요
       
	   // doBattle은 유저의 공격력을 받아 오크의 체력을 차감합니다.
    public void doBattle(int uAtk) {
    	// Orc의 체력을 유저 공격력 만큼 차감시켜주세요.
    	hp =(hp + def) - uAtk;
    	if(hp <= 0 ) { hp =0; System.out.println("오크를 처치하였습니다.");}
    	System.out.println("오크의 남은 체력 : " + hp);
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

	public void setDep(int def) {
		this.def = def;
	}

}
