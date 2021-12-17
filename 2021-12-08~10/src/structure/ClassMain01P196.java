package structure;

public class ClassMain01P196 {
    
    
    	// PersonClass 메서드는 작성할 필요가없다.
	    // 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	public static void main(String[] args) {
		PersonClass a = new PersonClass();
		a.name = "종민";
		a.age = 22;
		a.pNum = "0000";
		a.uNum = 1111;
		a.gender = "male";
		a.getinfo();
		PersonClass b = new PersonClass();
		b.name = "종수";
		b.age = 26;
		b.pNum = "2222";
		b.uNum = 3333;
		b.gender = "male";
		b.getinfo();
     

}
}
