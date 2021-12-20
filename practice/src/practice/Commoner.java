package practice;

public class Commoner {
	
	private String name;
	private String gender;
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int speed;
	private int jump;
	private int exp;
	private int level;
	public Commoner(String name, String gender, int hp, int mp, int atk, int def) {
		
		this.name = name;
		this.gender = gender;
	    this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.def = def;
		this.speed = 200;
		this.jump = 50;
		this.exp = 0;
		this.level =1;
	}
	public void getInfo() {
		System.out.println(getName()+ "의 능력치 정보입니다.");
		System.out.println("성별 : " + getGender());
		System.out.println("hp : " + getHp());
		System.out.println("mp : " + getMp());
		System.out.println("공격력 : " +  getAtk()+", 방어력 : " + getDef());
		System.out.println("이동속도 : " + getSpeed() + ", 점프력 : " + getJump());}
	
	public void huntMonster(Monster monster) {
		monster.doBattle(this.atk);
		this.hp = this.hp + this.def - monster.getAtk();
		if(this.hp >0) { 
		     System.out.println("교전후 남은 "+ this.name + "의 체력은 : "+ this.hp + "입니다.");
			return;}
		this.hp = 0; System.out.println(this.name + "이 체력이 0이되어 사망했습니다.");	
	}
		
	
       		


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getJump() {
		return jump;
	}
	public void setJump(int jump) {
		this.jump = jump;
	}

}