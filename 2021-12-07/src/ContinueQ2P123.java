
public class ContinueQ2P123 {
public static void main(String[] args) {
	//다음은 학생들의 과목별 성적입니다.
	//math = 96 23 52 82 72 31 58
	//eng = 62 42 68 31 80 77 45
	//com = 10 28 39 74 65 90 98
	//각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요
	// 합격점수는 60점 이상입니다.
int[] math = {96, 23, 52, 82, 72, 31, 58};
int[] eng = {62, 42, 68, 31, 80, 77, 45};
int[] com = {10, 28, 39, 74, 65, 90, 98};
 // 1. 총점 변수와 합격자수 변수 생성
 // 2. 반복문 실행 (향상된 for문 권장)
 // 3. 검사해서 60점 미만이면 continue
 // 4. 60점 이상이면 합격자수 +1, 총점에 합격점수 더하기
 // 5. 다 돌고 나오면 총점 / 합격자수 로 합격자 평균 내기
int total =0;
int c =0;
for(int a : math) {
	
	if(a < 60) {continue;}
	else if(a >=60) {c++;}
	total+= a;
	}
System.out.println("수학 합격자의 평균은 "+
	Math.round((float)total/c *100)/100.0+ " 입니다");

total = 0;
c = 0;
for(int i : eng) {
	
	if( i < 60) {continue;}
	else if(i >=60) {c++;}
    total += i;
}
System.out.println("영어 합격자의 평균은 "+
		Math.round((float)total/c *100)/100.0+ " 입니다");
total = 0;
c = 0;
for(int j : com) {
	
	if( j < 60) {continue;}
	else if(j >=60) {c++;}
    total += j;
}
System.out.println("컴퓨터 합격자의 평균은 "+
		Math.round((float)total/c *100)/100.0+ " 입니다");




}
}
