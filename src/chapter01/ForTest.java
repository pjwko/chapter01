package chapter01;

public class ForTest {

	public static void main(String[] args) {
		//for (초기화; 조건검사; 증감연산) 이기때문에 보기 쉬워서 while 보다 많이씀
		for(int i = 0; i < 3; i = i + 1 ) {
			//int i = 0
			// for(; i < 3;)
			//  i= i+1 처럼 초기화 부분을 밖으로, 증감연산을 포문 안으로 들여놓으면 while과 비슷
			System.out.println("test");
		}

	}
}
