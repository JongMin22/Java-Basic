package practice;

public class Baseballplayer {

	
	public String name;
	public int height;
	public int power;
	public int weight;
	public int speed;
	
	
	public Baseballplayer(String n, int h , int p, int w,int s) {
		name = n;
		height = h;
		power = p;
		weight = w;
		speed = s;
		System.out.println("야구선수 "+ n+ " 의 정보입니다.");
		System.out.println("키 :"+h+"cm"+" 몸무게 :"+w+"속력 :" +s +" 파워 :"+ p);
		
	}
	public void stolenBase() {
		if(speed > 100) {
			System.out.println("도루에 성공했습니다.");
			
		}else {System.out.println("도루에 실패하였습니다.");}
	}
	

}
