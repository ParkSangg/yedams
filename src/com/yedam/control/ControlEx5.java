package com.yedam.control;

public class ControlEx5 {
	public static void main(String[] args) {
		// 1부터 100까지의 수중 3의 배수의 합계 method1
		//Math.random()의 2번실행 > 두 수의 합이 5가 되는 경우
		//1,4, 2,3, 3,2 > 반복 회수 중단. method2()
		//반복분 for를 활용.
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		System.out.print(sum);
		}
	}
	/*public static void method1() {
		
	}*/
}
