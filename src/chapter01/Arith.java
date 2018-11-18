package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
//들여쓰기 맞춤. 컨트롤 시프트 f
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(-a);
		System.out.println(++a);
		System.out.println(--b); 	System.out.println(a++);
		System.out.println(b--);
		
		//int op int => int
		System.out.println( 10 / 3 );
		
		//int op double => double
		System.out.println( 10 / 3.0 );
		//주의
		System.out.println((double)10 / 3 );
		System.out.println((double)(10 / 3));
		//증감
		a = 1;
		a++; //오로지 1증가할 때만 쓸수 잇음
		// a = a + 1, a += 1
		
		System.out.println(a);
		a++;
		System.out.println(a);
		
		a--; // a = a - 1, a -= 1, a-- 는 1씩 감소 할 때만 가능
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
		a = 1;
		//실행순서의 차이
		System.out.println(++a);
		// ++a;
		// system.out.println(a);
		System.out.println(a++);
		//system.out.println(a);
		//a++
		System.out.println(a);
		
	}

}
