package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드: 함수인데 객체(object)에 소속되어있는 메소드.
	public static void main(String[] args) {
		/*
		 * 사용자의 값을 입력받도록 num1, num2 값을 입력받음
		 * num1~num2 사이의 값의 합계를 구하시오.
		 
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int result = 0;
		String str = null;
		// var, let > int, long
		// for(let i=0; i<3; i++){}
		// for(int i=0; i<3; i++){}
		try {
			str = scn.nextLine(); // 함수가 객체에 소속되어있는것을 메소드.
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다..");
		}
		System.out.println("입력값은" + str);
		
		scn.close(); //resource 환원.
		*/
		Scanner scn = new Scanner(System.in);
				System.out.println("숫자를 입력하세요.");
		int result=0;
		int num1 = 0;
		int num2 = 0;
		try {
			num1 = scn.nextInt();
			num2 = scn.nextInt();
			
		} 
		catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		if (num1<num2 ){for (int i=num1; i<=num2 ; i++){
				if (i%2 == 0) {
					result += i;
				}
				}
		}
		else {for (int i=num2; i<=num1 ; i++){
				if (i%2 == 0) {
				result += i;
			}
			}
		}
		
		
		System.out.println("입력값 내의 합계는" + result + "입니다");
		scn.close();
	}
}
