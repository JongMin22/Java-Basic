package overriding;

public class Horse extends Animal {

	public String rank;
 	// 오버라이딩 요건
	// 이름과 리턴자료형 등이 
	// 같은 부모쪽 메서드를
	// 중복해서 작성함
	public void howl() {
		System.out.println("히이잉");
	}
	public void getinfo() {
		System.out.println("이름 : "+ name + 
				           ", 나이 : " +age +
				           ", 먹이 :"+ food +
				           ", 순위 :"+ rank + "입니다." );
}
}