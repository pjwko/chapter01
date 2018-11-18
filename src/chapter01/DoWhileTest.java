package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		//DoWhile문은 조건이 뒤에있음(탈출조건)
		int sum = 0;
		int value = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("숫자입력[0 to quit]>");
			value = scanner.nextInt();
			sum = sum+ value;
		}while(value != 0);
		
		System.out.println(sum);
	}
}