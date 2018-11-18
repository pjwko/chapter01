package chapter01;

public class TypeCast {

	public static void main(String[] args) {
        //implicity(암시적) type casting
		int i = 10;
        long l = i;//사실 (long)i 지만 큰 쪽이라서 생략 해도 됨 
        System.out.println(i + ":" + l);
        
        //explicity(명시적) type casting
        long l2 = 123456789L;
        //int i2 =l2; 만 하면 값이 짤리 위험이 있어서 경고 띄워줌
        int i2 = (int)l2;
	}

}
