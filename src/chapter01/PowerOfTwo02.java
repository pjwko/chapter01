package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// System.out.println("승수:");//프롬프트 만들기 ln은 개행문자(\n)라 줄바뀜, 그래서 빼주면 옆에 쓸수있음
		System.out.print("승수:");// 따옴표 안에서 승수 뒤에 \n 붙이면 ln이랑 같은 효과
		// System.out.println();
		// System.out.print("base:");
		int power = scanner.nextInt();
		// int base = scanner.nextInt();
		int base = 2;
		// 2의 power승을 해서 출력
		int result = 1;

		for (int count = 0; count < power; count += 1) {
			result = result * base;
		}
		System.out.println(base + "의" + power + "제곱근은" + result + "입니다.");
		scanner.close();
	}
}