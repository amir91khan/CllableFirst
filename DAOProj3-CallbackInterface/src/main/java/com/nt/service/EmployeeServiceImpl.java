package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;
	public EmployeeServiceImpl(EmployeeDAO dao)
	{
		this.dao=dao;
	}

	public EmployeeDTO fetchEmployeeByNo(int empno) {
		EmployeeBO bo=null;
		EmployeeDTO dto=null;
		bo=dao.getEmployeeDetailsByNo(empno);
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		
		return dto;
	}

	/*public List<EmployeeDTO> fetchEmployeeByDesg(String desg) {
	 List<EmployeeDTO> listDTO=new ArrayList();
	List<EmployeeBO> listBO=null;
	listBO=dao.getEmployeeDetailsByNo(no);
	listBO.forEach(bo->{
		EmployeeDTO dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		listDTO.add(dto);
	});
	
		return listDTO;
	}*/

}
