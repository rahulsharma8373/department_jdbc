package com.dept.Entity;



public class Department {

	private int deptId;
	private String deptName;
	private String deptAddress;
	private String deptCode;
	
	public Department() {
		
	}
	
	public Department(int deptId, String deptName, String deptAddress, String deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.deptCode = deptCode;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptAddress=" + deptAddress
				+ ", deptCode=" + deptCode + "]";
	}
	
	
	
	
}
