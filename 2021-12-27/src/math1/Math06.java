package math1;

public class Math06 {
	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위 > 보 , 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 가위 바위 보를 뽑는 부분부터 작성해주세요.
		// 0 = 가위, 1 = 바위, 2 = 보
		int myValue = (int)(Math.random()*3);
		int comValue = (int)(Math.random()*3);
		// 상수를 처리하는 부분
		int scissor = 0;
		int rock = 1;
		int paper = 2;
		
		
		if((myValue == scissor && comValue == paper)||
		   (myValue == rock && comValue == scissor)||
		   (myValue == paper && comValue == rock)) {
			System.out.println("내가 이겼습니다.");
		}
		else if ((myValue == paper && comValue == scissor)||
		   (myValue == scissor && comValue == rock)||
		   (myValue == rock && comValue == paper)) {
			System.out.println("컴퓨터가 이겼습니다.");}
		else if(myValue == comValue){
             System.out.println("무승부입니다.");
		}
		String[] items = {"가위", "바위", "보"};
		System.out.println("내가 낸 것 : " + items[myValue]);
		System.out.println("컴퓨터가 낸 것 : " + items[comValue]);
		
	/*	if(myValue ==scissor && comValue == rock) {
			System.out.println("컴퓨터가 승리했습니다.");
			System.out.println("내 변수 : 가위");
		    System.out.println("컴퓨터 변수 : 묵");}
		else if(myValue ==scissor && comValue == scissor) {
			System.out.println("무승부 입니다.");
			System.out.println("내 변수 : 가위");
		    System.out.println("컴퓨터 변수 : 가위");}
		else if(myValue ==scissor && comValue == paper) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내 변수 : 가위");
		    System.out.println("컴퓨터 변수 : 보");}
		else if(myValue ==rock && comValue == scissor) {
			System.out.println("내가 이겼습니다");
			System.out.println("내 변수 : 묵");
		    System.out.println("컴퓨터 변수 : 가위");}
		else if(myValue ==rock && comValue == rock) {
			System.out.println("무승부 입니다.");
			System.out.println("내 변수 : 묵");
		    System.out.println("컴퓨터 변수 : 묵");}
		else if(myValue ==rock && comValue == paper) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내 변수 : 묵");
		    System.out.println("컴퓨터 변수 : 보");}
		else if(myValue ==paper && comValue == scissor) {
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("내 변수 : 보");
		    System.out.println("컴퓨터 변수 : 가위");}
		else if(myValue ==paper && comValue == rock) {
			System.out.println("내가 이겼습니다.");
			System.out.println("내 변수 : 보");
		    System.out.println("컴퓨터 변수 : 묵");}
		else if(myValue ==paper && comValue == paper) {
			System.out.println("무승부 입니다");
			System.out.println("내 변수 : 보");
		    System.out.println("컴퓨터 변수 : 보");}
		}*/
 		
		
	
	}
}


