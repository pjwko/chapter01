package chapter01;

public class GugudanPretty {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (i * j) + "    ");
				if (j > 2) {
					if (i < 5) {
						if (i * j < 10) {
							System.out.print(" ");
							if (j == 3) {
								if (i < 5) {
									System.out.print(" ");

								}
							}
						}
					}
				}
			}
			System.out.println();
		}

	}
}
