package constructor;

public class Webtoon {

	public String name;// 제목
	public int series; // 회차
	public String painter; // 작가
	public boolean complete; //완결여부

public Webtoon(String n,String p) {
	name =n;
	series = 0;
	painter = p;
	complete = false;
	System.out.println(name +" 웹툰의 정보 입니다.");
	
}
public void getInfo() {
	System.out.println(painter+" 작가님의 작품으로 "+series+"회차로 구성되있으며 "+
"연재상황은 : "+complete+" 입니다." );	
}
public void upload() {
	series +=1;
}	
public void completeWebtoon() {
	complete = !complete;  
}
}
