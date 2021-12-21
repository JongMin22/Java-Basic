package static2;

public class Asean {

	private String name;
	private int check; // 출석
	private int midTerm; // 중간고사
	private int finalTerm; // 기말고사

	
	
	
	// 위 변수들은 개별 객체가 따로따로 관리하는 변수들입니다.
	
	// 공용 발표점수인 presentationScore를 static으로 만들어주세요.
	// 이 점수는 19점입니다.
	// public으로 설정하면 바로 System.out.println()으로 조회 가능하고
	// private인 경우는 오로지 static 메서드를 통해서만 조회할 수 있습니다.
	private static int persentationScore = 19;
	public static void showPersentationScore() {
		System.out.println("Asean조 발표점수는 : " + persentationScore + "점 입니다.");
	}
	
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만 받아서 초기화합니다.
	public Asean(String name,int check, int midTerm, int finalTerm) {
		this.name = name;
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		
	}
	// 일반 메서드로 showAseanInfo()를 생성해주시되 성적 전체를 콘솔에 조회하게 해주세요. 
	public void showAseanInfo() {
	    System.out.println(this.name+"의 성적입니다.");
		System.out.println("중간고사 : " + this.midTerm +", 기말고사 : " + this.finalTerm);	
	}
	// ex) 중간고사 : xx점 , 기말고사 : xx점, .....
	
	// priavte static 같은 static영역에서 접근하도록 만들어야 합니다.
	
	
	// 위 요소 정의 후 Main01P276.java를 생성해서 구성원 4명을 만들어 활용해보세요. 
	
}
