package structure;

public class PersonClass {
	// 사람 정보를 Person에서 만들었던 것처럼 만들어 주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요.
public String name;
public int age;
public String pNum;
public int uNum;
public String gender;
	
	// 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	// 클래스 내부에 생성할때는 static을 적지않습니다.
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 명시없이 조회가능합니다.
	
public void getinfo() {
	
    System.out.println(name +" 의 정보입니다.");
    System.out.println("나이는 :"+age + 
    		           "세, 성별은: "+gender +
    	 	           "연락처: " +pNum  +
    		           "번호: "+ uNum);
	System.out.println("============================================");
}

}
