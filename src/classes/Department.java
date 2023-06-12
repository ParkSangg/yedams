package classes;

public class Department {

	private int departmentId;
	private String deparmentName;
	private int managerId;
	
	Department() {
		
	}
	
	Department(int departmentId){
		this.departmentId = departmentId;
	}
	// 부서번호. 부서명.부서장 초기화
	Department(int departmendId, String departmentName, int managerId){
		this.departmentId = departmentId;
		this.deparmentName = departmentName;
		this.managerId = managerId;
	}
	Department(int departmendId,String departmentName){
		this.departmentId = departmentId;
		this.deparmentName = departmentName;
	}
	
	void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	void setDepartmentName(String departmentName) {
		this.deparmentName = departmentName;
	}
	void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	int getDepartmentId() {
		return departmentId;
		}
	String getDepartmentName() {
		return deparmentName;
	}
	int getManagerId() {
		return managerId;
	}
	//부모 클래스의 기능 상속
	@Override
	public String toString() {
		//return super.toString(); 부모 object의 toString()실행.
		return"부서번호: " + departmentId +", 부서명:"
				+ deparmentName + ", 부서장Id: " + managerId;
	}
}
