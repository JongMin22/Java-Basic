package practice;

import java.util.Scanner;

public class ccc {
public static void main(String[] args) {
	            // 피라미드형 별을 찍어보겠습니다.
				// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
				//    *
				//   **
				//  ***
				// ****


	for(int i = 0 ; i < 4; i ++) {
		  
			for(int k=3; k>i;k--) {System.out.print(" ");}
			for(int j=0; j<i+1; j++){System.out.print("*");}
	System.out.println();}
	
	
}
}