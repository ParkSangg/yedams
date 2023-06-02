package com.yedam.object;

public class ObjectEx5 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = sum(num1, num2);
		System.out.println(result);
		
		double result1 = div(num1,num2);
		result = sum(new int[] {1,2,3});
	
		System.out.println(result1);
		System.out.println(result);
		makePerson("홍길동",20);
		makeAry(10);
		int[] resultAry = makeAry(10);
		showNumber(resultAry);
		/*for(int num : resultAry) {
			System.out.println(num+"/");
		}*/
	}
	
	public static void showNumber(int[] ary) {
		for(int num : ary) {
			System.out.println(num+"*");
		}
	}
	
	public static Person makePerson(String name,int age) {
		return new Person(name,age);
	}
	
	public static int[] makeAry(int size) {
		int[] ary = new int[size];
		for(int i=0;i<ary.length;i++) {
			ary[i] = (int) (Math.random()*10);
		}
		return ary;
	}
	
	
	public static int sum(int a,int b){
		return a + b;
	}
	public static int sum(int[] ary) {
		int result = 0;
		for (int num:ary) {
			result += num;
		}
		return result;
	}
	
	public static double div(int n1, int n2) {
			return (double) n1 / n2;
	}
}
