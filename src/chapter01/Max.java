package chapter01;

public class Max {

	public static void main(String[] args) {
		int a = 7;
		int b = 7;
		int c = 8;
		
		// 최대값  판별  조건
		if (a >=  b) {
			 if ( a >= c ) {
		       System.out.println("a가 최대값");
			} else {
				System.out.println("c가 최대값");
			 }
		} else {
			if ( b >= c) {
				System.out.println("b가 최대값");
			} else {
				System.out.println("c가 최대값");
			}
		}
       //결과 최대값은  30입니다.
	}

}
