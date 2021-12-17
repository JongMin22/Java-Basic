import java.util.Scanner;

public class WhileQ3 {
public static void main(String[] args) {
	// Scanner로 정수를 입력받게 해 주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3입력시
		// ***
		// ***
		// *** 과같이 출력
System.out.println("한변의 너비를 입력해주세요.");
Scanner scan = new Scanner(System.in);


int count = scan.nextInt();

int a = 0;
while(a < count) {
	int b = 0;
	while(b<count) {
		System.out.print("*");
	b++;}
System.out.println();
a++;}


scan.close();
}


}
