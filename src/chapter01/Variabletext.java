package chapter01;

public class Variabletext {

    public static void main(String[] args) {
	//변수(변수명은 소문자로)
    	// 정수
    	byte b = 1; //1바이트
		short s = 10; //2바이트
		int i = 2000; //4바이트
		long l = 12345678;  //8바이트
		// 기본적으로 int로 인식함, 롱타입으로 바꿀려면 뒤에 L 넣으면 됨
		//실수
		float f = 3.14f;//f 안붙이면 double값으로 인식해서 오류남, 4바이트
		double d = 3.14;//8바이트
		//문자
		char c = 'A';
		//부울
		boolean bool = true;//변수이름은 매소드 안에서 중복 불가
		
		String str = "hello";
		System.out.println(str.length());
		//String은 기본타입이 아님(char가 모여있는 class의 객체이다) ) 그냥 자바가 편의로 넣어둔 것임, 문자열
		//String str = new String("hello"); -> String str = "hello"; 로  줄여주는 거임 =클래스를 객체로 만듦
		//String 은 char메모리가 뭉쳐있음, 참조값(레퍼런스, 객체ID)이 들어가있음, 
		//str 은 레퍼런스 객체 ( ?+1, 1은 객체 ID), 안의 값에 접근 할려면 str.char변수명 임
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(c);
		
		System.out.println(bool);

		//(지역)변수는  초기화가 되어야 한다.
		//안되어 있는 상태로 사용하면 오류
		//int j;
		//System.out.println(j);
	//상수(변수지만 변하지 않음)
		final int NUMBER = 12345; 
		//(초기화시 final아 븉어있는 변수는 다음에 값을 대임할 수 없다. 상수의 변수명은 전부 대문자로 써야되는게 관례)
	    // 많이 반복해서 쓰는 특정값을 고정으로 써야될 때 사용.
		//number = 54321; 하면 오류남
		System.out.println(NUMBER);
		System.out.println( Math.PI );//PI 처럼 자바내에서 설정된 고정값도 있음
		
		
    } 

}
