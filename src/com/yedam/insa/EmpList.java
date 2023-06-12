package com.yedam.insa;

import java.util.Scanner;
//사원정보 배열, 등록/조회.출력 정의.
public class EmpList {
	private int sum;

	
	//정보저장공간.
	Employee[] list;
	int empNum;
	Scanner scn = new Scanner(System.in);
	
	//싱글턴으로 인스턴스 생성(생성자)
	private static EmpList instance = new EmpList();
	public static EmpList getInstance() {
		return instance;
	}
	
	private EmpList() {}
	
	private EmpList(Employee[] list) {
		this.list = list;
		this.empNum = list.length;
	}
	//인스턴스 생성
//	EmpList() {}
//	EmpList(Employee[] list) {
//		this.list = list;
//		this.empNum = list.length;
//	}
	
	
	//초기화
	public void init() {
		System.out.println("사원수> ");
		int num = scn.nextInt(); //3 Enter.
		list = new Employee[num];
	}
	//등록
	public void input() {
		if (empNum >= list.length) {
			System.out.println("입력초과");
			return;
		}
		System.out.printf("%d 사번>",empNum);
		int no = scn.nextInt();
		System.out.print("이름>");
		String name = scn.next(); // Enter.
		System.out.print("급여> ");
		int sal = scn.nextInt();
		list[empNum++] = new Employee(no, name, sal);
	}
	//조회
	public String search(int employeeId) {
		for (int i=0; i<list.length; i++) {
			if(list[i].getEmployeeId() == employeeId) {
				return list[i].getName();
			}
		}
		return "";
	}
	
	//전체출력
	public void print() {
		for (int i=0; i< list.length; i++) {
			System.out.printf("%5d %10s %7d\n",
					list[i].getEmployeeId(), list[i].getName(),
					list[i].getSalary());
		}
	}
	public void sum() {
		for (int i=0; i<list.length; i++) {
		this.sum += list[i].getSalary();
		}
		System.out.printf("급여합계 = %d\n",sum);
	}
}
