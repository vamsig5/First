package com.exilant.sparkworks;

public class Department {
	private int departId;
	private String deptName;
	
	
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + departId + ", deptName=" + deptName + "]";
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptId, String deptName) {
		super();
		this.departId = deptId;
		this.deptName = deptName;
	}
	

}
