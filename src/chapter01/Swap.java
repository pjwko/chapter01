package chapter01;

public class Swap {
    public static void main(String[] args){
    	int a = 10;
    	int b = 30;
    	
    	System.out.println("a=" + a);
    	System.out.println("b=" + b);
    	
    	 int temp = a;
    	 a = b;
    	 b = temp;
    	 
    	//Swap algorithm 아니 그냥 교체만 이었다니!
    	System.out.println("a=" + a);
    	System.out.println("b=" + b);

    }
}
