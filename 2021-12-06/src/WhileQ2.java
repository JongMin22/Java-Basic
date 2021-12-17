
public class WhileQ2 {
public static void main(String[] args) {
	
	 // 반복문의 경우 3개의 요소가 필요합니다.
	// 1. 조건식(참 거짓 판단으로 실행 유지 여부 결정)
	// 2. 변수(조건식을 처음에는 true였다가 일정 시점뒤에 필요에 따라false로 만들기 위해서)
	// 3. 변수 증감(변수 증감을 줘야 변수값이 변동이 생김)
	// for 문같은경우 위 3개 요소를 한 줄에 담는다면
	// while 따로 떨어뜨려 두는것이 특징.
	// 따라서 한 줄에 있냐, 떨어져있냐만 빼면 사실상 같은 구문이다.
	
	int a =1;
	while(a < 9) {
		a++;
		int b =1;
		while(b < 10) {
			System.out.println(a + " * " + b + " = "+ a*b);
			b++;
		
		}
		System.out.println("======================");}
	}

}
