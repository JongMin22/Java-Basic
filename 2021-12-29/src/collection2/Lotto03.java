package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {
	public static void main(String[] args) {
		        // 로또복권 당첨 시뮬레이터를 만들어주세요.
				// 1. 당첨번호 6개를 뽑습니다.
				// 2. 추첨번호 6개를 뽑습니다.
				// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
				// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
				// 이어서 비교해서 일치여부 검사.
		List<Integer> lotto = new ArrayList<>();
		List<Integer> lottery = new ArrayList<>();
		
		int getNum = 0;
		int getNum2 = 0;
		int count = 0;
		
		while(lotto.size() != 6 ) {
			getNum = (int)(Math.random()* 45 + 1) ;
			if(!lotto.contains(getNum)) { lotto.add(getNum);
		}
		}
		Collections.sort(lotto);
		
		while(!lotto.equals(lottery)) {
		// 6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해 줘야 할지?
			lottery.clear();
			while(lottery.size() != 6 ) {
			
			getNum2 = (int)(Math.random()* 45 + 1) ;
			if(!lottery.contains(getNum2)) {lottery.add(getNum2);
				
			}
		    }
			Collections.sort(lottery);
			System.out.println(""+ lotto + lottery);
			count += 1;
	
		}
		
	System.out.println("축하합니다"+ count +"번 시도하여 당첨되었습니다.");
    System.out.println("당첨번호 : " + lotto );
	System.out.println("추첨번호 : " + lottery ); 
}
}