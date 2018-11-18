package chapter01;

public class ContinueTest02 {

	public static void main(String[] args) {
		// continue때문에 조건을 안가서 무한 루프 가능성 높음
		//int i = 0;
		//while (i<10) {
			//if (i>5) {//6부턴 계속 올라감 6인상태로 무한 반복 이거 하려면 if구절에 i++넣어야됨
				//continue;
		//	}
		//}
		//System.out.println(i);
		//i++;
		
		for ( int i = 0; i < 10; i++) {
			if (i >5) {
				continue;
			}
		}
	}

}
