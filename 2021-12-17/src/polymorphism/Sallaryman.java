package polymorphism;

public class Sallaryman extends Person{

	private int pay;
	
public Sallaryman(String name, int age, int pay) {
	 super(name,age);
	 this.pay =pay;
	
}	
public void showPerson() {
	super.showPerson();
	System.out.println(getName() +" 연봉은 : " + this.pay + "입니다");
}

}
