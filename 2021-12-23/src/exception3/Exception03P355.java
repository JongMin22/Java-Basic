package exception3;

public class Exception03P355 {
public static void main(String[] args) {
	// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때
	// 각각 예외유형을 다르게 처리할 때 사용합니다.
	// 이 떄 catch구문을 여러번 사용할 수 있습니다.
	
	int[] number = {1, 2, 3, 4, 5, 0};
	
	
	// 예외가 발생할지도 모르는 코드부터 try블럭에 넣습니다.
	try {
		for(int i=1; i<6; i++)// ArrayOutofBoundsException 
			{System.out.println(i);}
		System.out.println("0으로 나누기 시도해보겠습니다.");
		System.out.println(number[4] / number[5]); // ArithmethicExceoption
	}
	catch(ArrayIndexOutOfBoundsException a) {System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");}
	catch(ArithmeticException a) {System.out.println("0으로 나눌수 업습니다.");}
	catch(Exception e) {System.out.println("에러가 발생했습니다.");}
}
// ArithmeticException도 특별 처리를 해주세요.
// 0으로 나눌수 없습니다 라고 메세지가 뜨게해주세요
}
