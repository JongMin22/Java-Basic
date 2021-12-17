package overriding;

public class Main01P265 {
public static void main(String[] args) {
	Horse h1 = new Horse();
	h1.howl();
	Pig p1 = new Pig();
	p1.howl();
 
	h1.name = "메리";
	h1.age = 6;
	h1.food = "밀";
	h1.rank = "2등";
	
	p1.name ="크리스";
	p1.age = 3;
	p1.weight = 5;
	p1.food = "사료";
	
	
h1.getinfo();
p1.getinfo();
}
}
