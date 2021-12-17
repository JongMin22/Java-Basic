package polymorphism;

public class Teacher extends Person {
	private String subject;
	public Teacher (String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
 
	public void showPerson() {
		super.showPerson();
		System.out.println(subject+ " 과목 선생님입니다.");
	}
}
