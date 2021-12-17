import javax.swing.plaf.multi.MultiPanelUI;

public class EnhancedFor02 {
public static void main(String[] args) {
   
	// 다음은 학생들의 과목별 성적입니다.
	// math = 96 23 52 82 72 31 58
	// eng = 62 42 68 31 80 77 45
	// com = 10 28 39 74 65 90 98
	// 위 3개의 명칭으로 array를 만들어 담고
	// 과목별 평균점수를 enhanced for구문을 이용해 구해서
	// 콘솔창에 출력해주세요.
   int[] math = {96, 23, 52, 82, 72, 31, 58};
   int[] eng = {62, 42, 68, 31, 80, 77, 45};
   int[] com = {10, 28, 39, 74, 65, 90, 98};
 
        int total = 0;
        
 
   for(int a : math) {
	  
	   total += a;
		 
	 }   
   System.out.println("수학 평균점수 = " + total/math.length);

   total = 0;
  for(int i=1; i<eng.length; i++) {
		total += eng[i]; 
	  
	 }
  System.out.println("영어 평균점수 = "+ total/eng.length);
	total =0; 
  for(int c : com)
		total += c; 
	  System.out.println("사회 평균점수 = "+ total/com.length);
	 }      
}









