package com.yedam.insa;

public class Employee {
	private int employeeId; //사번
	private String Name;//이름
	private int departmentId;//부서번호 : 10(인사) 20(개발) 30(영업:디폴트값)
	private String departmentName;//부서명
	private int salary; //급여
	
	//기본 생성자
	Employee(){};
	
//	Employee(int empId, String name, int deptId, int salary){
//		
//	} >> 불가능(인식불가)
	//정수, 문자열, 정수, 정수.
	Employee(int employeeId, String Name, int salary , int departmentId){
		this.employeeId = employeeId;
		this.Name = Name;
		this.salary = salary;
		this.departmentId = departmentId;
		if (departmentId == 10) {
			departmentName = "인사";
		}else if (departmentId == 20) {
			departmentName = "개발";
		}else {
			departmentName = "영업";
		}
	}
	Employee(int employeeId, String name){
		this(employeeId, name , 0 , 30); //급여:0 부서:영업
	}
	Employee(int employeeId, String name, int salary){
		this(employeeId, name, salary , 30); //급여 , 부서:영업
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	
}
