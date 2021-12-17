package structure;


public class Structure03P190 {
	public static void getCatinfo(Cat i) {
	System.out.println(i.name+ "의 정보입니다");
	System.out.println("고양이 색상은 "+ i.color + "이고 고양이 나이는 " + 
	i.age + "살 입니다");}

	public static void main(String[] args) {
Cat a = new Cat();
a.name = "메리";
a.color ="White";
a.age = 3;
Cat b = new Cat();
b.name = "크리스";
b.color ="Brown";
b.age = 2;
getCatinfo(a);
getCatinfo(b);

}
 

}
