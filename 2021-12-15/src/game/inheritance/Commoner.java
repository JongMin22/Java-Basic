package game.inheritance;

public class Commoner {
	
	// 레벨 , 체력 , 아이디 , 마나수치를 변수로 가집니다.
	// 정보은닉이 적용되어 private접근 제한자를 가지며 
	
	protected String name;
	protected int level;
	protected int hp;
	protected int mp;
	protected double exp;
	// 레벨은 1, 체력은20, 마나는 10이 가본값이며 , 아이디만 그때그때 입력 받습니다.
	public Commoner(String name) {
     	// 생성자 내부에서 멤버변수를 초기화할때는 this.를 붙이는경우가 많습니다.
		this.name= name;
		this.level = 1;
		this.hp = 20;
		this.mp = 10;
		this.exp = 0.0;
	
	}
	// 생성자로 데이터를 초기화할수 있고, getInfo로 정보를 출력합니다.
	public void getInfo() {
		System.out.println("캐릭터 정보입니다.");
		System.out.println("아이디 :" + name);
		System.out.println("레벨 :" + level);
		System.out.println("경험치 :" + exp);
		System.out.println("체력 :" + hp);
		System.out.println("마나 :" + mp);
	
	}


}
