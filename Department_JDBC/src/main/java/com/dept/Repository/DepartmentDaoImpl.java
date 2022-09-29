package com.dept.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dept.Entity.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Department addDept(Department department) {
		jdbcTemplate.update("insert into department value(?, ?, ?, ?)", new Object[]{
			department.getDeptId(),department.getDeptName(),department.getDeptAddress(),
			department.getDeptCode()
		});
		return department;
	}

	@Override
	public Department getDept(int id) {
		Department department = jdbcTemplate.queryForObject("select * from department where dept_id=?",
				new BeanPropertyRowMapper<Department>(Department.class),id);
		return department;
	}

	@Override
	public Department updateDept(Department department, int id) {
		jdbcTemplate.update("update department set dept_name=?,dept_address=?,dept_code=? where dept_id="+id+"",
				new Object[] {department.getDeptName(),department.getDeptAddress(),department.getDeptCode()});
		return department;
	}

	@Override
	public int deleteDept(int id) {
		
		return jdbcTemplate.update("delete from department where dept_id="+id+"");
	}
}
