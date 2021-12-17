package overloading;

public class Main {
public static void main(String[] args) {
	// 1.Calculaotr를 생성해주세요.
	Calculaotr c1 = new Calculaotr();
     
     
	
	
	// 2. plus (int, int )를 호출해주세요. 값은 임의로 넣어주세요.
     c1.plus(4,4);
	
	
	
	// 3. plus (double)를 호출해주세요. 값은 임의로 넣어주세요. 
     c1.plus(6.4);
     
	// 4. plus(String)을 Calculator에 새로 추가 해주시고 호출해주세요. 
         //이 메서드 에서는 sysout("문자열은 연산 대상이 아닙니다.")라고 출력합니다. 
	c1.plus("배고파");
	}
	
}
