package arrays1;

import java.util.Arrays;

public class Arrays06 {
	public static void main(String[] args) {
		// 유니코드를 활용하는 모든 문자
		// 이모지가 가장 마지막으로 소팅됨
		String[] arr = {"변종민", "邊宗民","미국","울릉도","神","😁"};
		//정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}