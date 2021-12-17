package inheritance;

public class Main02P254 {
public static void main(String[] args) {
	
	// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
	// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
	// 학생은 그냥 알아서 작성해주세요.
	// 생성한 객체의 정보를 콘솔에도 같이 찍어주세요.
	
	Student s = new Student();
	s.name = "뚝이";
	s.age = 21;
	s.stuNum = 21;
	
	s.getInfo();
	s.getStudentInfo();
	
	Salaryman a = new Salaryman(); 
	a.name = "종민";
	a.age = 22; 
	a.salary = 70000000;
	
	a.getInfo();
	a.getSalaryInfo();
} 
}



