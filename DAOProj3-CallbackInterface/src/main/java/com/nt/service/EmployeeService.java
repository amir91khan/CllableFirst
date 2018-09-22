package com.nt.service;

import java.util.List;

import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public EmployeeDTO fetchEmployeeByNo(int empno);
	//public List<EmployeeDTO>  fetchEmployeeByDesg(String desg);

}
