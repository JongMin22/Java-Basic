package game.polymorphism;

public class Main02 {
public static void main(String[] args) {
	
	Commoner c1 = new Commoner("초보자");
	Monster o1 = new OrangeMushroom();
	Monster d1 = new Drake();
	Monster s1 = new Snail();
	
	c1.hunt(s1);
	c1.hunt(o1);
	c1.hunt(d1);
	
}
}
