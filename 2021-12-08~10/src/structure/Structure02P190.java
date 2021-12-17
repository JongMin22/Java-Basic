package structure;

public class Structure02P190 {
// Person 내부의 정보를 쉽게 조회하기 위한 매서드 생성
	public static void getinfo(Person p) {
		System.out.println(p.name + " 의 정보입니다.");
		System.out.println("나이: "+ p.age + ", 연락처: "
				+ p.pNum + ", 번호 " + p.uNum + "입니다");
	}
	
	public static void main(String[] args) {
//사람을 2명 만들어보세요 (a,b)
	Person a = new Person();
a.name = "종수";
a.age = 26;
a.pNum = "0000";
a.uNum = 11;
getinfo(a); //a의 주소값을 getInfo의 p에 전달
    Person b = new Person();
b.name = "종진";
b.age = 25;
b.pNum = "1111";
b.uNum = 6;
getinfo(b); //b의 주소값을 getInfo의 p에 전달


}
}
