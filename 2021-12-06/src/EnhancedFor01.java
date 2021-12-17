
public class EnhancedFor01 {
public static void main(String[] args) {
	// 향상된 for문은 반복문 진행시 타겟으로 배열을 적습니다.
	// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
	
	// 7개의 요소를 묶어서 arr1에 저장.
	int[] arr1 = {100, 211, 339, 475, 591, 600, 700, 888};
	// arr1[순번]을 입력해서 내부 요소를 하나만 꺼낼 수 있음(순번은 0부터 시작)
    System.out.println(arr1[2]);
   String[] arr2 = {"2000", "2001"};
     System.out.println(arr2[0]);
     // 향상된 for문 이전 방식
     for(int i=0; i<7; i++) {
    	 System.out.print(arr1[i]);
     }        
     System.out.println();
     // 향상된 for문 
     for (int item: arr1) {
    	 System.out.print(item);
     }
     System.out.println();
     // 배열명.length는 내부 요쇼의 갯수를 대신해 쓸 수 있다.
     for (int i=0; i<arr1.length; i++) {
    	  System.out.print(arr1[i]); 
    	
     }


}   


}
