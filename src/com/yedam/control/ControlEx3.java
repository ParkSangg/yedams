package com.yedam.control;

import java.util.Scanner;

public class ControlEx3 {
	/*public static void method2(String[] args) {
		for (int num2 = 2; num2 <= 9; num2 ++) {
			int num = num2;
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n",num,i,(num*i));
			}
		}
	}
	
	public static void method1() {
		for (int i = 0; i <10; i++) {
			if(i % 2 == 0) {
				System.out.printf("i의 값은 %d \n", i);
			}
		}
	}*/
	/*public static void main(String[] args) {
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.printf("%15s ", "");
		for (int day = 1; day <=30; day++) {
			System.out.printf("%3d ",day);
			if(day % 7 == 3) {
				System.out.println();
			}
		}
	}//main*/
	// 4,5,6월 달력 . switch ~ case 구문
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month = scn.nextInt();
		int date = getLastDate(month);
		int blank = getBlank(month);
		int k = 0;
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		for(int j =0; j<= getBlank(month); j++) {
		System.out.printf("%3s ", "");
		}
		for (int i = 1; i <=date; i++) {
			System.out.printf("%3d ",i);
			if((getBlank(month) + i) % 7 == 6) {
				System.out.println();
			}
		}
	}
	
	public static int getLastDate(int month) {
		int result = 0;
		switch (month) {
			case 1: result=31;break;
			case 2: result=28;break;
			case 3: result=31;break;
			case 4: result=30;break;
			case 5: result=31;break;
			case 6: result=30;break;
			case 7: result=31;break;
			case 8: result=31;break;
			case 9: result=30;break;
			case 10: result=31;break;
			case 11: result=30;break;
			case 12: result=31;
		}
		return result;
	}
	public static int getBlank(int month) {
		int result = 0;
		switch (month) {
		case 1: result=0;break;
		case 2: result=3;break;
		case 3: result=3;break;
		case 4: result=6;break;
		case 5: result=1;break;
		case 6: result=4;break;
		case 7: result=6;break;
		case 8: result=2;break;
		case 9: result=5;break;
		case 10: result=0;break;
		case 11: result=3;break;
		case 12: result=5;
		}
		return result;
	}
}
