package interface1;

public class Train implements Vehicle {

	// 이 클래스는 Vehicle을 구현합니다.
		// 속도 연료량 기관사명을 가집니다.
		// 생성자로 기관사명만 초기화하고, 속도는 0으로 스타트합니다.
		// 속도제한은 300이며, 가속할경우 50씩 증가합니다.
		// 연료는 7씩 잡아먹습니다.
		// 감속도50씩 이뤄집니다.
		// 연료는 70씩채웁니다.
	
	private String name; // 기관사명
	private int speed; // 현재 속도
	private int gas; // 연료량
	
	public Train(String name) {
		this.name = name;
		this.gas = MAX_GAS;
		this.speed = MIN_SPD;
				
	}
	@Override
	public void accel() {
		if(gas>0) {
	    	this.speed += TRAIN_INCREASED_SPEED;
	    	if(speed > TRAIN_MAX_SPEED) {speed =TRAIN_MAX_SPEED; System.out.println("현재 최대속도 입니다.");
	    	return;}}
	    	this.gas -=TRAIN_DECREASED_GAS;
	    	if(gas< MIN_GAS) {gas = MIN_GAS; System.out.println("연료가 부족합니다.");}
	    	else {System.out.println("기차가 정차했습니다.");}		
	}

	@Override
	public void breasSpeed() {
		this.speed -= TRAIN_DECREASED_SPEED;
		if(speed <= MIN_SPD ) {speed = MIN_SPD;}
		
	}

	@Override
	public void reFuel() {
		this.gas += TRAIN_INCREASED_GAS;
		if(gas >= MAX_GAS) {gas = MAX_GAS;}
		
	}

	@Override
	public void showStatus() {
	
		System.out.println("기관사명 : "+ name);
		System.out.println("현재 속도 : "+ speed);
		System.out.println("현재 연료량 : "+ gas);
		
	}
	
	

}
