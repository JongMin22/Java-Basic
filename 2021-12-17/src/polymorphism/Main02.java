package polymorphism;

public class Main02 {
public static void main(String[] args) {
	Person s1 = new Sallaryman("직장인", 30, 8000);
	
	Person t1 = new Teacher("선생님", 27, "수학");
	
	s1.showPerson();
	
	t1.showPerson();
		
}
	
}
