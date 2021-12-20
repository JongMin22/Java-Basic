package practice;

public class Monster {

	private String name;
	private int hp;
	private int atk;
	private int def;
	private String reward;
	
	public Monster(String name,int hp, int atk, int def,String reward) {
	this.name = name;
	this.hp = hp;
	this.atk = atk;
	this.def = def;
	this.reward = reward;		
	}

	public void getInfo() {
		System.out.println(this.name + "의 정보입니다");
	}


	public void doBattle(int uatk) {
		if(this.hp<=0) {
		
			this.hp = 0; 
	        System.out.println(this.name+"이 쓰려졌습니다.");
	        System.out.println("보상으로 "+  this.reward+ "를 획득했습니다.");
			
			return;}
		this.hp = (this.hp + this.def) - uatk;
	    
		
		System.out.println(this.name + "의 교전후 남은 체력은 : "+ this.hp + "입니다."); 
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

}
