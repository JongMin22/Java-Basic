package string1;

import java.util.Scanner;

public class String10P399 {
	public static void main(String[] args) {
		// 로그인 로직을 만들어보겠습니다.
		// 먼저 String id에 여러분이 설정한 임의의 아이디를 
		// String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
		// 다음 사용자에게 Scanner를 이용해
		// uId 변수에는 아이디를 (사용자입력)
		// uPw 변수에는 비밀번호를 (사용자입력)받아서
		// 조건문을 이용해서 기존 id, pwe가 입력받은 자료와 모두 일치하면 
		// "XX님이 로그인하였습니다."
		// id는 일치하나 비밀번호가 틀리면 "비밀번호가 틀렸습니다."
		// id가 일치하지 않으면 "그런 아이디는 없습니다."
		// 라고 출력되도록 코드를 작성해주세요.
		
		
		String id = "q2ewrq2ewr";
		String pw = "*q2ewrq2ewr";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요");
		String uId = scan.nextLine();
		/* System.out.println("비밀번호를 입력해주세요");
		String uPw = scan.nextLine();
		if(uId.equals(id)&&uPw.equals(pw)) {System.out.println(uId+"님이 로그인했습니다.");}
		else if(uId.equals(id) == true && uPw.equals(pw) == false) 
		{System.out.println("비밀번호가 틀렸습니다.");}
		else if(uPw.equals(pw) == true && uId.equals(id) == false) 
		{System.out.println("아이디가 틀렸습니다.");}
		else {System.out.println("아이디,비밀번호가 틀렸습니다.");} */
		if(uId.equals(id)) {
			System.out.println("비밀번호를 입력해주세요.");
			String uPw = scan.nextLine();
			if(uPw.equals(pw)) {
				System.out.println(uId+"님이 로그인했습니다.");
			}else {System.out.println("비밀번호가 틀렸습니다.");}
			
			}else {System.out.println("그런 아이디는 없습니다.");}
		}
		

		
		
		
				
	}


