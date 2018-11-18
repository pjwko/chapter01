package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
		// continue는 조건에 맞으면 다시 올라감
		for (int i = 0; i<20; i++) {
			if (i%2 == 0 || i%3 == 0) {
				continue;//2의 배수나 3의 배수면 내려오지 않고 올라감  즉 2와 3의 배수는 출력 되지 않음
			}
			//if( i % 2== 0 ){
			//continue;
			//}
			//if( i % 3 == 0){
			//continue;
			//}
			
			System.out.println(i);
			
			//if(i % 2 != 0 && i % 3 != 0){
			//System.out.println(i);
			//}
		}

	}

}
