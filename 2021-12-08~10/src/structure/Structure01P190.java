package structure;

public class Structure01P190 {

	public static void main(String[] args) {
 // 이제부터는 실행코드와 정의 코드를 분리합니다.
 // main이 있는 클래스는 실행만 하고
 // 실제 로직은 다른 .java파일에 저장합니다.
 
 // 커스텀 디자인 자료형은
 // 아래와 같이 new()자료형; 문법으로 생성합니다
 Person p1 = new Person();
 // p1내부에 정의한 변수를
 // p1.변수명 = 대입할 값; 형태로 저장합니다.
 p1.name = "변종민";
 System.out.println(p1.name);
 p1.age = 22;
 System.out.println(p1.age);
 p1.pNum = "010-4182-4591";
 System.out.println(p1.pNum);
 p1.uNum = 123465789;
 System.out.println(p1.uNum);
 // 또 다른 사람을 하나 만들어 봤습니다.
 // p2에도 name, age, pNum, uNum
 // 콘솔에 찍어주세요.
 Person p2 = new Person();
 p2.name = "종민";
 System.out.println(p2.name);
 p2.age = 22;
 System.out.println(p2.age);
 p2.pNum = "010-4182-4591";
 System.out.println(p2.pNum);
 p2.uNum = 159753;
 System.out.println(p2.uNum);
 Person p3 = new Person();
 p3.name = "조옹민";
 System.out.println(p3.name);
 p3.age = 30;
 System.out.println(p3.age);
 p3.pNum = "010-4111-2221";
 System.out.println(p3.pNum);
 p3.uNum = 5820;
 System.out.println(p3.uNum);
	}

}
