package game.inheritance;

public class Archor extends Commoner{

	private int rDam;
	public Archor(String name) {
		super(name);
	this.rDam = 2;
	}
	public void getInfo() {
		System.out.println("궁수 캐릭터 정보입니다.");
		System.out.println("아이디 :" + name);
		System.out.println("레벨 :" + level);
		System.out.println("경험치 :" + exp);
		System.out.println("체력 :" + hp);
		System.out.println("마나 :" + mp);
		System.out.println("원거리데미지 :" + rDam);
	 
	} 
}
