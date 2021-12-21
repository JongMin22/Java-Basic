package interface1;

public class Airplane implements Vehicle{
	/*int AIRPLANE_MAX_GAS = 1000;
	int AIRPLANE_MAX_SPD = 1000;
	int AIRPLANE_INCRESED_SPD = 400;
	int AIRPLANE_DECRESED_SPD = 300;
	int AIRPLANE_DECRESED_GAS = 150;
	int AIRPLANE_INCRESED_GAS = 500;*/

	private String name; // 비행기 이름
	private int speed; // 속도
	private int gas;
	public Airplane(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = AIRPLANE_MAX_GAS;
	}
	@Override
	public void accel() {
		if(gas > MIN_GAS) {
			this.speed += AIRPLANE_DECRESED_SPD;
			if(speed >= AIRPLANE_MAX_SPD) {
				speed = AIRPLANE_MAX_SPD; System.out.println("비행기는 현재 최대속도입니다.");
			return;}
		}this.gas -= AIRPLANE_DECRESED_GAS;
		if(gas <= MIN_GAS) {gas = MIN_GAS; System.out.println("연료가 부족합니다.");}
	}
	@Override
	public void breasSpeed() {
		this.speed -= AIRPLANE_DECRESED_SPD;
		if(speed <= MIN_SPD) {System.out.println("비행기가 비행을 멈췄습니다.");}
		
	}
	@Override
	public void reFuel() {
		this.gas += AIRPLANE_INCRESED_GAS;
		if(gas >= AIRPLANE_MAX_GAS) { gas =AIRPLANE_MAX_GAS; System.out.println("연료가 가득 찼습니다.");
		}
		
	}
	@Override
	public void showStatus() {
		System.out.println("파일럿명 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("============================");
		
	} // 연료량



}
