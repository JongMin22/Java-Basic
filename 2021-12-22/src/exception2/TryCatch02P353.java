package exception2;

import java.util.Scanner;

public class TryCatch02P353 {
public static void main(String[] args) {
	// 아까 Exception 1 패키지 내부의 여러 예외 유형중
	// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
	// 발생할 예외에 대한 처리는 try ~ catch 블록을 활용합니다.
	// / by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("배열 인덱스를 정해주세요.");
	int a = scan.nextInt();
	int[]arr = new int[a];
	
	System.out.println("호출할 인덱스 번호를 입력해주세요.");
	int b = scan.nextInt();
	try { System.out.println(arr[b]);  
		
	} catch(Exception e){System.out.println("배열 인덱스를 초과해 호출할 수 없습니다.");}
         finally{System.out.println("모든 코드를 끝마쳤습니다.");}
}
}
