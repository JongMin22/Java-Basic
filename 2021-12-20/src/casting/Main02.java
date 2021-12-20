package casting;

public class Main02 {
public static void main(String[] args) {
	// Animal로 Cat을 받아서 생성
	Animal c1 = new Cat();
	// c1변수와 연결된 heap쪽 자료가 Cat인지 확인
	System.out.println(c1 instanceof Cat);
	System.out.println(c1 instanceof Dog);
	System.out.println(c1 instanceof Animal);
	
}
	
}
