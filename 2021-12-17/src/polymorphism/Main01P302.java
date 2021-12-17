package polymorphism;

public class Main01P302 {
public static void main(String[] args) {
	// 부모타입은  Person으로 자식인 Student까지 받을수 있음. 
	Person p1 = new Person("나사람",10);
	Person s1 = new Student("나학생",20,100);
  
	// p1 과 s1의 showperson은 다르게 돌아갑니다.
  p1.showPerson();
  s1.showPerson();
  // 신분 밝히기용 showStudent()를 호출시도해보세요.
  // s1은 Person타입이므로 Person에 소속된 자원만 호출 할 수있습니다.
  
}
}
