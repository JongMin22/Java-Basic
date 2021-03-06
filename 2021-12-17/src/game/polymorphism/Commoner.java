package game.polymorphism;

public class Commoner {
	// 속성(필드, 변수)값으로 name, hp, mp, atk를 추가해주세요
	private String name;
	private int hp;
    private int mp; 
	private int atk;

	// 생성자로 위 필드를 초기화하도록 설정해주세요.

	public Commoner(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;}
	// 다형성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함.
	// 몬스터 타입이 없어서 에러가 나므로 우선 같은 패키지내에 Monster를 생성.
	// 몬스터는 name(몬스터이름)
	public void hunt(Monster monster) {
		// 몬스터의 doBattle(사용자 공격력)을 호출해서 몬스터의 체력을 깎아주세요
		monster.doBattel(this.atk);
	   
		// 몬스터의 공격력을 받아와 사용자의 체력을 깎아주세요.
        if(monster.getHp() > 0) {
		this.hp = this.hp - monster.getAtk();
		System.out.println("교전 결과 " + this.name + " 의 남은 체력 : "+ this.hp);
		}
        if(this.hp<= 0) {this.hp=0; System.out.println(this.name+ 
        		" 용사가 교전중 사망했습니다.");
        return;}
        
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

}

