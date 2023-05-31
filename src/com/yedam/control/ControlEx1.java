package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		//0~1 사이의 임의의 수 생성 = Math.random()
		/*int result = (int) (Math.random() * 10); //(int) = 정수값으로 형태변환시킨다.
		System.out.println(result);
		if (result % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}*/
		int result = (int) (Math.random() * 91)+10;
		String grade = "";
		System.out.println("랜덤 숫자 값은"+result);
		if (result<=100 && result>=90) {
			grade = "A";
		}
		else if (result<=89 && result>=80) {
			grade = "B";
		}
		else if (result<=79 && result>=70) {
			grade = "C";
		}
		else {
			grade = "D";
		}
		System.out.print("생성된 값의 등급은 "+grade+"입니다");
	}//main
}//class
// Math.random을 활용해 10~100 까지의 임의의 수.
// 생성된 값이 100~90 A 