package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ccc {
public static void main(String[] args) {
	// 가위바위보 게임을 만들어보겠습니다.
			// Math.random()을 이용해 1/3확률로 가위,바위,보를 부여받으며
			// 가위 > 보 , 바위 > 가위, 보 > 가위의 상성을 가집니다.
			// 가위 바위 보를 뽑는 부분부터 작성해주세요.
			// 0 = 가위, 1 = 바위, 2 = 보
	int myValue = (int)(Math.random()*3);
	int comValue = (int)(Math.random()*3);
	final int SCISSORS = 0; 
	final int ROCK = 1; 
	final int PAPER = 2;
	
	if((myValue == SCISSORS && comValue == ROCK ) || ((myValue == ROCK && comValue == PAPER))
			|| (myValue == PAPER && comValue == SCISSORS)) {System.out.println("내가 승리했습니다.");
			if(myValue == SCISSORS) {System.out.println("내가 낸 것 : 가위");
			                         System.out.println("컴퓨터가 낸 것 : 보");}
			else if(myValue == ROCK) {System.out.println("내가 낸 것 : 바위");
			                          System.out.println("컴퓨터가 낸 것 : 가위");}  
			else{System.out.println("내가 낸 것 : 보");
			     System.out.println("컴퓨터가 낸 것 : 바위");}}
 	else if(myValue == comValue) {System.out.println("비겼습니다.");}
	else {System.out.println("패배했습니다.");
	if(myValue == SCISSORS) {System.out.println("내가 낸 것 : 가위");
    System.out.println("컴퓨터가 낸 것 : 바위");}
else if(myValue == ROCK) {System.out.println("내가 낸 것 : 바위");
     System.out.println("컴퓨터가 낸 것 : 보");}  
else{System.out.println("내가 낸 것 : 보");
System.out.println("컴퓨터가 낸 것 : 가위");}}

	
	
	
	
	
	

	
}
}