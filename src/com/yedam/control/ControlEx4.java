package com.yedam.control;
import java.util.Scanner;

public class ControlEx4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month = scn.nextInt();
		int date = getLastDate(month);
		int k = 0;
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.printf("%3s ", "");
		for (int i = 1; i <=date; i++) {
			System.out.printf("%3d ",i);
			if(i % 7 == 3) {
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
}
