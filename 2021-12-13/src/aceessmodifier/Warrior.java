package aceessmodifier;

public class Warrior {

	// hp, mp, lv, atk, def, exp, name;
	// 선언
	// 변수값은 현실에서도 특정한 무렟나 사람의 상태가 휙휙 바뀌지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 private으로 처리합니다.
	 private String name;
	 private int hp;
	 private int mp;
	 private int lv;
	 private int atk;
	 private int def;
	 private int exp;  
	
	// 생성자를 만들어주시되, name만 사용자에게 입력받고, 나머지는 
	// 체력20, 마나10, 레벨1, 공격력3, 방어력0 경험치0이 대입되도록 처리해주세요.
	// 생성자 규칙 : 클래스명과 동일한 이름의 메서드를 만들되, 리턴자료형이 없음
	
	public Warrior (String a) {
		name = a;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
	System.out.println("전사 생성 완료");
	System.out.println("아이디 :" + name + ", 레벨 :" + lv);
	
	
	
	}
	// hunt 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는데 체력이 2깎이고 경험치가 10 올라갑니다.
	// 사냥 결과 체력이 X이 되었고, 누적 경험치는 Y입니다 라고 출력합니다.
	// 생성자를 비롯한 메서드는 행동을 나타내고 
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도 자체에 대해서는 제한을 두지 않습니다.
	public void hunt() {
		hp -= 2;
	   exp += 10;
	   if(exp >= 200) {lv=5; 
		System.out.println( "캐릭터의 레벨은 최대 5레벨입니다.");}
	   else if (exp > 150) {lv =4;}
	   else if (exp == 150) {lv =4; hp=50;}
	   else if (exp > 100) {lv =3;}
	   else if (exp == 100) {lv=3; hp=40;}
	   else if (exp > 50) {lv =2;}
	   else if (exp == 50){lv =2; hp=30;}
	   else if (exp > 0) {lv=1;}
	   System.out.println("사냥 결과 체력이 "+hp+"이 되었고," + "누적 경험치는 "+ exp + 
			   "현재 레벨은 "+ lv +"입니다.");
	   
	}
 
  	




 	
}

