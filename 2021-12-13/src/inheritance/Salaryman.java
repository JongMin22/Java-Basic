package inheritance;

public class Salaryman extends Person {

	//Person을 상속해서 Salaryman을 만들어보세 요
	// 샐러리맨은 연봉(salary)를 가집니다.
	// getSalaryInfo()로 상태를 조회할 수 있습니다.


	public int salary; //연봉
	
	public void getSalaryInfo() {
		System.out.println("이름 : " + name + ", 나이 : "+age +
				           ", 연봉 : "+ salary + "원 입니다.");
	}
	





}
