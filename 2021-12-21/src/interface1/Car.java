package interface1;

// 인터페이스 구현(상속이 아님!) 하기위해서는
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle{
	
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도 , 현재연료량, 차주
	private String name;
	private int speed;
	private int gas;
	
	public Car(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = MAX_GAS;
		
	}
    @Override
    public void accel()      {
	// 한 번 가속시 속도가 10씩 늘어나도록 해주세요.
    // 연료는 한 번 가속에 1씩 소비합니다.
    // 단 속도는 200을 초과할수 업습니다.
    	if(gas>MIN_GAS) {
    	this.speed += CAR_INCREASED_SPEED;
    	if(speed > CAR_MAX_SPD) {speed =CAR_MAX_SPD; System.out.println("현재 최대속도 입니다.");
    	return;}
    	}this.gas -=CAR_DECREASED_GAS;
    	if(gas <= MIN_GAS) {gas = MIN_GAS; System.out.println("연료가 부족합니다.");}
}   @Override
    public void breasSpeed() {
   	// 한 번 감속할때마다 속도가 10씩 줄도록 해주세요.
   	// 단, 속도가 0 미만이 될 수 없습니다.
	 
       	this.speed -= CAR_DECREASED_SPEED;
       	if(speed <= MIN_SPD) {speed =MIN_SPD; System.out.println("자동차가 멈췄습니다.");}
       	
       	
       	
   	
   	
   			
   }
	  
@Override
    public void reFuel()     {
    	// 연료는 다시 채울때마다 30씩 채워줍니다.
    	// 단, 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
    	if(this.gas +CAR_INCREASED_GAS < MAX_GAS) {gas +=CAR_INCREASED_GAS;}
    	else {gas = MAX_GAS; System.out.println("연료가 최대입니다.");}
		
		
    } 
	public void showStatus() {
		// 자동차의 정보를 조회할 수 있도록 작성해주시면 됩니다.
		 System.out.println("차주 : " + this.name);	
		 System.out.println("현재 속도 : " + this.speed);	
		 System.out.println("연료량 : " + this.gas);	
		 System.out.println("=========================");
				
}
}
