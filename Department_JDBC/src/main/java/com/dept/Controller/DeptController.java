package com.dept.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dept.Entity.Department;
import com.dept.Repository.DepartmentDao;

@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	DepartmentDao dao;
	
	@PostMapping("/add")
	public Department addDept(@RequestBody Department department) {
		System.out.println(department);
		return dao.addDept(department);
	}
	
	@GetMapping("/get/{id}")
	public Department getDeptById(@PathVariable int id) {
		return dao.getDept(id);
	}
	
	@PutMapping("/update/{id}")
	public Department updateDept(@RequestBody Department department, @PathVariable int id) {
		Department dept = dao.updateDept(department, id);
		return dept;
	}
	
	@DeleteMapping("/delete/{id}")
	public int deleteDept(@PathVariable int id) {
		
		return dao.deleteDept(id);

	}

}