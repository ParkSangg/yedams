package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자");
		int num1 = scn.nextInt();
		System.out.println("숫자");
		int num2 = scn.nextInt();
		//FirstMethod();
		//SecondMethod();
		thirdMethod(num1,num2);
	}//메인
	public static void FirstMethod() {
		// Scanner 사용해서 입력값 2개.
		// 3, 4 => 3의 4제곱에 값을 출력.
		Scanner scn = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
	int result = 0;
	int num1 = 0;
	int num2 = 0;
	try {
		num1 = scn.nextInt();
		num2 = scn.nextInt();
	}// try 끝
	catch(Exception e) {
		System.out.println("올바르지 않은 입력입니다.");
	}//catch 끝
	result = (int) Math.pow(num1,num2);
	System.out.println(result);
	};//퍼스트 메소드
	
	public static void SecondMethod() {
		Scanner scn = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = null;
		int num = 0;
		String result = null;
		try {
			str = scn.nextLine(); // 함수가 객체에 소속되어있는것을 메소드.
			num = scn.nextInt();
			}//트라이 끝
		catch(Exception e) {
			System.out.println("예외가 발생했습니다..");
			}//캐치 끝
		for(int i=1; i<=num; i++) {
				System.out.println(str);
			}//for문 끝
		scn.close();
	}; //세컨드 메소드 끝
	
	public static void thirdMethod(int num1, int num2) {
		//매개로 받은 2개의 수를 더하고 결과출력
			int result = num1 + num2;
			System.out.print("값:"+result);
		}//서드 메소드 끝
	}
