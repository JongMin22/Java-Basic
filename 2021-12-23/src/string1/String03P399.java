package string1;

import java.util.Scanner;

public class String03P399 {
public static void main(String[] args) {
	// Scanner를 통해서 전체 문장을 입력받으세요.
	// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
	// 문장내에 있는 단어들의 인덱스 번호와, 몇개가 검출되었는지
	// 출력해주는 코드를 작성해보세요.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("전체 문장을 입력해주세요.");
	String sentence = scan.nextLine();
	
	System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
	String searchVoca = scan.nextLine();
	
	
	int count = 0;
	boolean bool = true;
	
	int fidx = -1;
	while(bool) {
		int get = sentence.indexOf(searchVoca,fidx+1);
		if(get == -1) {bool = false;}
		else {
			fidx =get;
			count++;
			System.out.println(get + "번에서 " + count + "번째 " + searchVoca+ "이(가) 검출되었습니다.");
		}
		}
	
	System.out.println(searchVoca + "총 출현 횟수는 " +count+"회입니다.");
	
}
}
