package map1;
import java.beans.PersistenceDelegate;
import java.util.HashMap;
import java.util.Map;
public class HashMap02P458 {
	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요
		// key는 음식이름 , value에는 가격(정수)로 저장해주세요.
		// 메뉴는 5개이상 집어넣어주세요
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		
		Map<String, Integer> menu = new HashMap<>();
		menu.put("카레", 4000);
		menu.put("제육", 7000);
		menu.put("볶음밥", 5000);
		menu.put("짜장면", 6000);
		menu.put("탕수육", 15000);
		
		System.out.println(menu.get("카레"));
		System.out.println(menu.get("제육"));
		System.out.println(menu.get("볶음밥"));

		
	}
}
	
