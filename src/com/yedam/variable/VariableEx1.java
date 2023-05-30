package com.yedam.variable;

public class VariableEx1 {
	public static void main (String[] args) {
		// 변수 : 변하는 값을 저장.
		int num1; // - 음의 정수, 0 , 양의 정수
		num1 = 100;
		num1 = -100;
		
		double num2 = -1.2;
		num2 = 12.3;
		num2 = 123.0; // 정수 > 실수 내붝으로 형변한
		
		double result = 0;
		result = (double) num1 + num2 ; // 변수의 범위
		
		System.out.print(num1);
		System.out.print("결과 = " + result);
		
		//변수의 종류
		//정수 : byte, (1byte) , short(2byte), int (4byte), long (8 byte)
		//실수 : float (4byte) , (double(8byted)
		//객체(클래스) : 8bite -> 2*2*2*2*2*2*2*2 : -128~127
		System.out.println(Integer.MAX_VALUE); // -2147483648, 0 , 2147483647
		byte b1 = 127;
		short s1 = 128;
		long l1 = 2147483648L; // <<인트의 최대값 넘음. 정수의 기준은 int.
		// 자바에서 정수연산을 하면 기준이 int.
		long result1 = (long) b1 + (long) s1 + l1;
		
		b1++; // b1 = b1 + 1;
		System.out.println("b1의 값:" + b1);
	}
}
