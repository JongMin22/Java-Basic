package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto02 {
	public static void main(String[] args) {
		// List 역시 참조형 변수이기 때문에 비교시 주소값끼리 비교합니다.
		// 따라서 단순 == 비교가아닌 리스트1.equals(리스트2)
		// 를 이용해 주소값이 아닌 실제힙에 저장된 데이터 비교를 해줘야 
		// 로또복권 리스트 내부 숫자가 일치하는지 비교할 수 있습니다.
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		System.out.println("주소값 비교 : "+ (l1 == l2));
		// 둘 다 빈 리스트이므로 내부에 든 자료끼리만 비교했을때는 true임
		System.out.println("" + l1 + l2);
		System.out.println("내부에 든 자료 비교 : " + l1.equals(l2));

		// l1과 l2에 각각 요소를 입력하되, 순서에 따른 결과를 확인하기.
		// l1과 l2에 여러분들이 같은 자료를 넣어주시되, (중복된 번호를 같은 리스트에 넣지 말기 => 1, 1 X )
		l1.add(6);
		l1.add(5);
		l1.add(4);
		Collections.sort(l1);
		l2.add(6);
		l2.add(5);
		l2.add(4);
		Collections.sort(l2);
		System.out.println("l1 = "+ l1 + " l2 = "+ l2+ " 내부 자료 비교 : "+ l1.equals(l2));
		
	}

}
