import java.util.Scanner;

public class WhileQ1P105 {
public static void main(String[] args) {
	// 스캐너를 이용해서 String num 변수에
	// "문자열 형태인 숫자" 를 입력받게 해주세요.(scan.nextLine()으로 문자열 입력받기)
	// 이 문자자료 num을 int loop 변수에 Integer.parseInt()로 정수변환해 저장하세요.
	// loop 변수에 입력된 정수 횟수만큼
	// "반복문을 실행합니다" 라는 문장이 콘솔에 출력되도록
	// while문을 작성해주세요.
	
	Scanner scan = new Scanner(System.in);
	
	String num = scan.nextLine();
	
	int loop = Integer.parseInt(num);
	int a = 0;
	
	while(a < loop) {
			a++; // a+=1;
		System.out.println(a+ " 번째 반복문을 실행합니다");
		
	
	}
		scan.close();
		
			
}
}
