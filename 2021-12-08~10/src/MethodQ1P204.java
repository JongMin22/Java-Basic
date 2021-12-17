import java.util.Scanner;

public class MethodQ1P204 {

 
	// 섭씨온도를 입력하면 화씨온도로 바꿔주는 메서드를 작성해보겠습니다.
	// 메서드 이름은 FToC이고, double을 리턴합니다.
	// 리턴받은 결과값은 main메서드에 System.out.println()으로 출력.
	// 화씨 = (섭씨 x 1.8) + 32
	// 섭씨 = (화씨 - 32)/1.8
	public static double FToc(double f) {
		return (f - 32)/1.8;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("오늘의 화씨온도를 입력해주세요.");
     
	double f = scan.nextDouble();
	double result = FToc(f);
	System.out.println("오늘의 섭씨온도는 : " + 
	Math.round((result)*100)/100.0 + "도 입니다.");
     
   scan.close();
   
     
	
	}
}
