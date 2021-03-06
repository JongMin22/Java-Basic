package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String name) {
		super(name);
		
	}
	public void hunt() {System.out.println("마법사가 사냥을 시작합니다.");
		
		// hp -=2;를 직접 실행할 수 없으므로
		// public 인 setter(setHp)를 이용합니다.
		// setHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청이다.
		// 현재 원하는것은 , 현hp값에서 사냥할 떄마다 2씩 체력이 깎이는 것입니다.
		setHp(getHp() - 2);
		// 경험치도 마찬가지로 
		// exp+=10; 를 직접 실행할 수 없으므로 
		// sexExp()를 활용합니다.
		// 현재 원하는것은 , 현 exp값에서 사냥할때마다 10씩 경험치가 증가하는것입니다.
		setExp(getExp() + 10);
		
	} 
	// fireball 메서드를 생성해주세요.
	// 마나가 3줄고, 경험치는 20증가합니다.
	public void fireball() {
		if(getMp() <= 0) {System.out.println("마나가 부족하여 스킬을 사용할수 없습니다.");}
		else {setMp(getMp() - 3);
		    setExp(getExp() + 20);
		    System.out.println("마법사가 화염구를 던집니다.");}
		
	}
	
	// heal 메서드를 생성해주세요.
	// 마나가 2줄고 체력이 10회복이됩니다.
	public void heal() {
		
	if(getMp() <= 0) {System.out.println("마나가 부족하여 스킬을 사용할수 없습니다.");}
	else {setMp(getMp() - 2);
	setHp(getHp() + 10);
	System.out.println("마법사가 회복 주문을 외웁니다.");}
	}
	public void drinkMp() {
	      if(getMp() >= 1000) {System.out.println("마나 충전량이 최대입니다.");}
	      else {setMp(getMp() + 10);
	      System.out.println("마법사가 마나 포션을 마십니다.");}
	}
	public void getInfo() { 
	  //심지어 private 요소는 수정이 아닌 조회도 불가능 합니다.
		System.out.println(getName()+"의 정보입니다.");
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
	    System.out.println("현재 경험치 : " + getExp());
	    System.out.println("현재 레벨 : " + getLv());
	    
	
	}

}
