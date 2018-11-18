package chapter01;

import java.util.Scanner;

public class InfiniteLoop {
	public static void main(String[] args) {
		// DoWhile 대신 가능
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(;;) {
			System.out.print("숫자입력[0 to quit]>");
			int value = scanner.nextInt();
			
			if( value == 0) {
				break;
			}
			sum += value;
		}
		System.out.println(sum);

	}

}
