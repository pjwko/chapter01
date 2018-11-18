package chapter01;

public class Triangle {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			int j = 0;
			if (j < i) {
				for (; j <= i - 1; j++) {
					System.out.print("x");
				}
				System.out.println("\n");

			}
		}

	}
}
