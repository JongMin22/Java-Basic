package game.inheritance;

public class Magician extends Commoner{
	
	private int mDam;
	public Magician(String name) {
		super(name);
	this.mDam = 2;
	}
	public void getInfo() {
		System.out.println("법사 캐릭터 정보입니다.");
		System.out.println("아이디 :" + name);
		System.out.println("레벨 :" + level);
		System.out.println("경험치 :" + exp);
		System.out.println("체력 :" + hp);
		System.out.println("마나 :" + mp);
		System.out.println("마법데미지 :" + mDam);
	 
	 
}

}
