package heapmemory;

import java.util.Arrays;

public class arrayComparison {
public static void main(String[] args) {
	int[] arr1 = {1, 2, 3, 4, 5};
	int[] arr2 = arr1;
	int[] arr3 = {1, 2, 3, 4, 5};
	arr1[0] = 10;
	System.out.println(arr1[0]);
	System.out.println(arr2[0]);
	System.out.println(arr3[0]);

	// 그냥 출력하면 주소값이 나옴
	System.out.println(arr1);
	System.out.println(arr2);
	System.out.println(arr3);
	
	// 주소에 접근했을때 나오는 자료조회시
	// Arrays.toString(자료); 로 조회합니다.
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println(Arrays.toString(arr3));

	// 기본 타입의 경우 한번 선언된 값이 고정된다.
	int a = 1;

	int b = a;

	a=3;

	System.out.println(a+b);


}
}
