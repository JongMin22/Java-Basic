
public class ForQ7P118 {
public static void main(String[] args) {
	    // 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
		// ****
		// ***
		// **
		// *
		// 중첩 반목문의 어느곳이 세로, 가로를 담당하는지 생각해보세요. 
		// 힌트: 별 개수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.
	
	        for(int i=0; i<4; i++) {
	        	for(int j=4; j>i; j--) {
	        		System.out.print("*");
	        	}
	        System.out.println();}

}
}
