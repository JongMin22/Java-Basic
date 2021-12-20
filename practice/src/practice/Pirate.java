package practice;

public class Pirate extends Commoner{
	public Pirate(String name) {
		 super(name,"남자",50,25,5,1);
	}
	public void getInfo() {
		System.out.println(getName()+ "의 능력치 정보입니다.");
		System.out.println("성별 : " + getGender());
		System.out.println("hp : " + getHp());
		System.out.println("mp : " + getMp());
		System.out.println("공격력 : " +  getAtk()+", 방어력 : " + getDef());
		System.out.println("이동속도 : " + getSpeed() + ", 점프력 : " + getJump());
}
}
