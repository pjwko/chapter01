package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("판별할 숫자");
		int number = scanner.nextInt();
		int divine = 2;
		//처리(소수인지 판별)
		boolean isprime = true;
//		while(divine < number) {
//			if (number % divine != 0) {
//				divine++;
//			}else {
//				isprime = false;
//				divine++;
//			}
//		}
		
		while(divine < number) {
			if(number % divine == 0) {
				isprime = false;
				break;//break; 안쓰면 조건만족할 때까지 계속 돌아감, 이거쓰면 조건 만족하면 멈춤
			}
			divine++;
		}
		
		//출력
		if(isprime) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		//리소스 정리
		scanner.close();

	}

}
