package string1;

public class String06P399 {

	public static void main(String[] args) {
		// substring은 인덱스 기준으로 앞 문자열을 삭제합니다.
		// 인덱스 번호를 두 개 주면 처음 인덱스번호 ~ 두 번쨰 인덱스번호 사이만 남겨줍니다.
		// substring (int a, int b) == >  a번째 index <=      < b번째 index
		// substring (int a) == >  a번째 index <= 
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);
     	System.out.println(result);
     	
     	result = str.substring(10,15);
     	System.out.println(result);
	
     	
	}
}
