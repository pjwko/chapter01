package chapter01;

public class WhileTest {
	//while 문제는 로직이 많아질수록 루프를 한눈에 보기 힘듦, 그래서 증감부분 감빡할 수 있음

	public static void main(String[] args) {
		
		int i = 0;//초기화
				
		while (i < 3) {//조건
			System.out.println("test");//로직, 수행코드
			i = i + 1;//증감
		}
	}
}
