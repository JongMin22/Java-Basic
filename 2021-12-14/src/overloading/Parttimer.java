package overloading;

public class Parttimer {

	private String name; // 직원명
	private int pay; // 시급
	private boolean afternoon; // true면 오후, 아니면 오전
	private String shopName; // 상호명
	
	// 생성자 오버로딩은 , 생성자를 여러 개 오버로딩 형식으로 만드는 것입니다.
	// afternoon, pay , shopName, name을 모두 받는 생성자를 만들어주세요.
    // 접근 제한자는 public입니다.
	
	public Parttimer(String n, int p, boolean a, String s) {
		name = n;
		pay = p;
		afternoon = a;
		shopName = s;
		if(p < 8720) {
			p = 8720;
		}else {pay = p;}
		
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : "+ pay);
		System.out.println("가게명 : "+ shopName);
		System.out.println("알바생 : "+ name);
	}
	
	// 오버로딩 : 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// afternoon , shopnName, name만 입력받는 생성자를 하나 더 중복작성 해주세요.
	// pay는 최저시급으로 넣어주세요.
	
	public Parttimer(String n,String s, boolean a) {
		name = n;
		pay = 8720;
		afternoon = a;
		shopName = s;
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : "+ pay);
		System.out.println("가게명 : "+ shopName);
		System.out.println("알바생 : "+ name);
		
	}
	
 	
}
