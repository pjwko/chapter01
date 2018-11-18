package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		// Break; 는 중지해라 for문도 가능
		int sum = 0;
		int num = 0;
		while(true) {
			sum += num;
			if(sum > 5000) {
				break;
			}
			num++;
		}
		System.out.println(num + ":" +sum);
	}

}
