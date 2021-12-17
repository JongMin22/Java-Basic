package structure;

public class ClassMain02P196 {
public static void main(String[] args) {

	Car a = new Car();
	a.model = "메르세데스-벤츠 E클래스";
	a.price = 108300000;
	a.owner = "변종민";
	
	Car b = new Car();
	b.model = "제네시스 g80";
	b.price = 62000000;
    b.owner = "변광성";

    						
	a.getinfo(); 		
	b.getinfo();	
						
						
}
}
