package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class CallbackInterface {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		EmployeeService service=ctx.getBean("empService", EmployeeService.class);
		EmployeeDTO dto=service.fetchEmployeeByNo(7499);
		System.out.println(dto.getNo()+"\t"+dto.getEname()+"\t"+dto.getJob()+"\t"+dto.getSal());
	
	}

}
