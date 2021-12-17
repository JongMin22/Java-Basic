package overriding;

public class Animal {

	public String name;
	public String food;
	public int age;
	

	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	public void getinfo() {
		System.out.println("이름 : "+ name + ", 나이 : " +age + "먹이 :"+ food+"입니다.");
	}



}
