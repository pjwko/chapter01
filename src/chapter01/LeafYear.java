package chapter01;

public class LeafYear {
	
	public static void main(String[] agrs) {
		int year = 2000;
		
		//1. 4로 나누어 떨어지지 않으면 윤년
		if( year % 4 !=0) {
			System.out.println( "윤년이 아닙니다." );
		}
		else if ( year % 100 !=0 ){// 4로 나누어 떨어지는 년도 중, 100으로 나누어 떨어지지 않는 년도
			System.out.println("윤년입니다.");
		}
		else if ( year % 400 !=0 ) {//위 두조건에 만족하지 않는 년도 중, 400으로 나누어 떨어지지 않는 년도
			System.out.println( "윤년이 아닙니다." );
		} 
		else {
			System.out.println( "윤년입니다." );
		}
	}
}
