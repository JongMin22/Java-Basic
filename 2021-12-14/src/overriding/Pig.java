package overriding;

public class Pig extends Animal {

	public int weight;
	
	
	
	public void howl() {
		System.out.println("꿀꿀");
	}
	public void getinfo() {
		System.out.println("이름 : "+ name + 
				           ", 나이 : " +age +
				           ", 먹이 :"+ food +
				           ", 무게 :"+ weight + "kg 입니다." );
}
}
