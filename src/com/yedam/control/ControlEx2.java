package com.yedam.control;
import java.util.Scanner;

public class ControlEx2 {
	/*public static void method1(String[] args) {
		int result = (int) (Math.random() * 3) + 1;
		switch(result) {
		case 1:
			System.out.println("가위."); break;
		case 2:
			System.out.println("바위."); break;
		case 3:
			System.out.println("보."); break;
		}
		System.out.println("end of prog.");*/
		/*int result = (int) (Math.random() * 91) + 10;
		switch(result/10) {
		case 10:
			System.out.println("A++");break;
		case 9:
			System.out.println("A");break;
		case 8:
			System.out.println("B");break;
		case 7:
			System.out.println("C");break;
		default:
			System.out.println("D");
		}*/
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month = scn.nextInt();
		System.out.println(month+"월달의 마지막날은" + getLastDate(month));
	}
	public static int getLastDate(int day) {
		int result = 0;
		switch(day) {
		case 1: result = 31;break;
		case 2: result = 28;break;
		case 3: result = 31;break;
		case 4: result = 30;break;
		case 5: result = 31;break;
		case 6: result = 30;break;
		case 7: result = 31;break;
		case 8: result = 31;break;
		case 9: result = 30;break;
		case 10: result = 31;break;
		case 11: result = 30;break;
		case 12: result = 31;
		}
		return result;
	}
}