package constructor;

// 농구선수를 자바 내에서 구현합니다.
public class BasketballPlayer {

	public String name;
	public int height; // 키 (신장)
	public int jumpHeight; // 점프력 
	// 변수는 첫단어 첫글자는 소문자, 이후 단어 첫글자는 대문자 나머지는 소문자로 작성 (Camel Case)
	// 위 표기법을 카멜케이스라고 부릅니다.


	//생성자 생성
	public BasketballPlayer(String n, int h, int j) {
          name = n;
          height = h;
          jumpHeight = j;
          System.out.println("생성된 선수 : "+ n );  
          System.out.println("키 :" + h + "점프력 :" + j);        
}	
	

	// 덩크슛하기 라는 행동을 작성합니다.
	public void dunkShoot(){
	if(height+jumpHeight> 300) {System.out.println("덩크슛에 성공했습니다");
		
	}else {System.out.println("골대에 닿지 않았습니다.");}
}
	

}
