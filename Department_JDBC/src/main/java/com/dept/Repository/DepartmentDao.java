package com.dept.Repository;

import com.dept.Entity.Department;

public interface DepartmentDao {

	Department addDept(Department department);
	Department getDept(int deptId);
	Department updateDept(Department department,int id);
	int deleteDept(int id);
}
