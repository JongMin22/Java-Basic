package game.interaction;

public class Main03 {
public static void main(String[] args) {
	Archor a1 = new Archor();
	Orc o1 = new Orc();
	Troll t1 = new Troll();
	a1.huntOrc(o1);
	a1.huntTroll(t1);
	a1.huntTroll(t1);
	a1.huntTroll(t1);
	a1.huntTroll(t1);
	Magician m1 = new Magician();
	m1.huntOrc(o1);
	m1.huntTroll(t1);

	
}
}
