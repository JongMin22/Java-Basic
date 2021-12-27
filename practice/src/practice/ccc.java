package practice;

import java.util.Scanner;

public class ccc {
public static void main(String[] args) {
	// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장내에 있는 단어들의 인덱스 번호와, 몇개가 검출되었는지
		// 출력해주는 코드를 작성해보세요.
 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("분석할 문장을 입력해주세요.");
	
	String s1 = scan.nextLine();
	
	System.out.println("찾을 단어를 입력해주세요");
	
	String s2 = scan.nextLine();
	
	while(true){
	  s1.indexOf(s2);
	}
	





}
}

