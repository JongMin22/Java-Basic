package practice;

public class CreatePlayer {
	public static void main(String[] args) {
	
		Commoner h1 = new Warrior("히어로");
		h1.getInfo();
	    System.out.println();
		Commoner b1 = new Archor("보우마스터");
		b1.getInfo();
		System.out.println();
		Commoner p1 = new Pirate("캡틴");
		p1.getInfo();
		System.out.println();
		Commoner m1 = new Magician("비숍");
		m1.getInfo();
		System.out.println();
		Commoner t1 = new Thief("나이트로드");
		t1.getInfo();
		System.out.println();
		
		Monster JinHilla = new JinHilla();
		h1.huntMonster(JinHilla);
		
		
 
		
		
	}

}
