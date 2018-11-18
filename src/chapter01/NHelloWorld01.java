package chapter01;

import java.util.Scanner;//스캐너 인포트된 것

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// 기본생성자 scanner 은 이클립스에서 땡겨(인포트 ctrl+shift+o)와 줘야됨, 스트링은 자동으로 인포트 됨
		//system.in은 키보드와 연결된 객체  
		//Scanner scanner는 new scanner를 변수 할당 시켜준것.안시켜주면 사라짐
		int count = scanner.nextInt();//nextint -> int값을 읽어 들여서 변수 count로 반환해 주는 역할
									 //입력값이 두개 넣을 경우  함수 netxint를 두개 넣으며 된다
		
		int a = 0;
		while (a < count) {
			System.out.println("HelloWorld");
			 a = a + 1;
		}
		
		scanner.close();//키보드 닫기, 굳이 안써도 자바에서 자동적으로 꺼주긴 하는데 , 무한적으로 돌아갈 경우도 있기때문에 명시적으로 해주는게 좋음
	                    //리소스 자원은 마지막에 넣어주는게 좋음, 안닫으면 다른 프로그램이 키보드를 못 쓰는 겨웅 발생
	}
}