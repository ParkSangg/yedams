package classes;

public class Calculator {
	static final double PI = 3.14;
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("더한 결과: "+ result);
	}
	public static void minus(int num1, int num2) {
		int result = num1-num2;
		System.out.println("뺀 결과: "+ result);
		
	}
	public static void getArea(int radius) {
		double result = PI * radius * radius;
		System.out.println("원의 넓이: "+ result);
		
	}
}
