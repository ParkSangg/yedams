package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		//기본입력. 값이 대문자 소문자 숫자 > 출력
		//q가 113 >> 종료. q != 반복
		System.out.println("값을 입력하세요.");
		while (true) {
			try {
				int result = System.in.read();
				if (result == 13 || result == 10) {
					continue;
				}
				 else if (result >= 48 && result <=57) {
					System.out.println("입력값은 숫자입니다.");
				}else if (result >= 65 && result <= 90) {
					System.out.println("입력값은 대문자입니다.");
				}else if (result >= 97 && result <= 122) {
					System.out.println("입력값은 소문자입니다.");
						if (result == 113) {
						System.out.println("종료.");
						break;
					}
				}else {
					System.out.println("지정되지 않은 키 입니다.");
				}
			}//try
			catch (IOException e) {
				e.printStackTrace();
			}//catch
		}
	}//메인
}
