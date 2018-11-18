package chapter01;

public class IfElse {

	public static void main(String[] args) {
	int a = 10;
	int b = 15;
    int diff = 0;
	
    if (a > b) {
		diff = a = b;
	}
	else {//a <= b
		diff = b - a;
	}
	System.out.println(diff);
	}

}
