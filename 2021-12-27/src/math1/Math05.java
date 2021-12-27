package math1;

public class Math05 {
	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요
		// 주사위게임은 내 값은 myValue변수에, 
		// 컴퓨터 변수값은 comValue 변수에 값을 난수발생으로 1~6번으로 부여한 뒤
		// 값이 같다면 무승부, 아니면 나, 혹은 컴퓨터 중 승자가 누구인지 알려주는 방식입니다.
		
		// int myValue = (int)(Math.random()*7);
		// int comValue = (int)(Math.random()*7);
		
		   int myValue = (int)(Math.random()*6);
		   int comValue = (int)(Math.random()*6);
		   myValue = myValue + 1;
		   comValue = comValue +1;
		    
		  if(myValue > comValue) {
		  System.out.println("내가 승리했습니다.");
		  System.out.println("내 변수 : "+ myValue);
		  System.out.println("컴퓨터 변수 : "+ comValue);}
		  else if(myValue == comValue) {
		  System.out.println("무승부 입니다.");
		  System.out.println("내 변수 : "+ myValue);
		  System.out.println("컴퓨터 변수 : "+ comValue);}
		  else {
		  System.out.println("컴퓨터가 승리했습니다.");
		  System.out.println("내 변수 : "+ myValue);
		  System.out.println("컴퓨터 변수 : "+ comValue);} 
		  
		  /*	if(myValue >= 1 && comValue >= 1) {
			if(myValue > comValue) {System.out.println("내가 승리했습니다.");
			System.out.println("내 변수 : "+ myValue);
			System.out.println("컴퓨터 변수 : "+ comValue);}
			else if(myValue == comValue) {System.out.println("무승부 입니다.");
			System.out.println("내 변수 : "+ myValue);
			System.out.println("컴퓨터 변수 : "+ comValue);}
			else {System.out.println("컴퓨터가 승리했습니다.");
			System.out.println("내 변수 : "+ myValue);
			System.out.println("컴퓨터 변수 : "+ comValue);}
		}
		else {System.out.println("변수는 1보다 크거나 같아야합니다.");}
		*/
		
	
	
}
}