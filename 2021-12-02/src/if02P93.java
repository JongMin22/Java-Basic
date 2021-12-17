import java.util.Scanner;

public class if02P93 {
public static void main(String[] args) {
   // 교재 93페이지 프로그램 4-1 코드입니다.	
    Scanner scan = new Scanner(System.in);
 
    
    
    System.out.println("정수입력: ");
    int su = scan.nextInt();
    System.out.println("정수입력: " + su);
    // 만약에 if문의 실행문이 한 줄이라면, { }를 생략해도 됩니다.
    
    if(su > 0) {
    	System.out.println("양수");
    }
    
   
    
    
    scan.close();
    
}
}
