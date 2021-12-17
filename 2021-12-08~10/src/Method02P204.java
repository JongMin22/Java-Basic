
public class Method02P204 {

	// 리턴구문에 int 자료를 입력해야 에러가 나지 않음.
	public static int add2(int a ) { 
		return a +1;
	}
	
	
	
	
	
	public static void main(String[] args) {
      int b = add2(10);
      // int b = 11;
      System.out.println(b);
}
}
