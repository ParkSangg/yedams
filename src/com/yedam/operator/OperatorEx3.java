package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		// while (condition){}
		// 변수 balance 선언.
		// 입력값을 판단 
		// 1 > balance 값을 추가
		// 2 > balance 값을 빼기.
		// 3 > 현재 balance 값을 콘솔 출력.
		// 4 > 종료.
		method2();
	}
		public static void method2() {
			Scanner scn = new Scanner(System.in);
			int balance = 0;
			int num = 1;
			while(true) {
				System.out.println("1)추가 2)차감 3)출력 4)종료");
				int menu = scn.nextInt();
				if(menu == 1) {
					System.out.println("더할값은?");
					int acct = scn.nextInt();
					if(balance+acct<=100000) {
						balance = balance + acct;
						System.out.printf("balance는 현재 %d입니다\n", balance );
					}
					else {
						System.out.printf("balance는 100,000을 초과할수없습니다.\n %d는 추가할 수 없습니다\n",acct);
					}
				}
				else if(menu == 3) {
					System.out.println("현재값은"+balance);
				}
				else if(menu == 2) {
					System.out.println("차감할 값을 알려주세요");
					int acct = scn.nextInt();
					if(balance-acct>=0) {
						balance = balance - acct;
						System.out.printf("balance는 현재 %d입니다.\n", balance );
					}
					else {
						System.out.printf("balance는 0 미만일 수 없습니다\n %d는 차감할 수 없습니다\n",acct);
					}
				}
				else {
					System.out.println("종료합니다.");
					break;
				}
			}
			System.out.println("end of prog.");
		}
		/*public static void method1() {
		int num1 = 1;
		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while (isOK) {
			System.out.println(num1++); //9
			if (num1 >= 10)
				isOK = false;
		}//while1
		
		Scanner scn = new Scanner(System.in);
		// quit 구문을 입력하면 반복종료.
		isOK = true;
		while(isOK) {
			System.out.println("문장을 입력하세요.");
			String str= scn.nextLine();
			if(str.equals("quit")) {
				//isOK=false;
				break;
			}//if
			System.out.println("입력값은" + str + "입니다.");
		}//while2
		System.out.println("end of program.");
		}//method1
		*/
	}//main
