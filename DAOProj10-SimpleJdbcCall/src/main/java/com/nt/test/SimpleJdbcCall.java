package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoginService;

public class SimpleJdbcCall {

	public static void main(String[] args) {
		LoginService service=null;
		ApplicationContext ctx=null;
		//Scanner sc=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service=ctx.getBean("service",LoginService.class);
		System.out.println("Resutl:::"+service.validate("raja","rani"));
		/*System.out.println("enter user");
		String uname=sc.nextLine();
		System.out.println("enter pwd");
		String password=sc.nextLine()*/
		((AbstractApplicationContext) ctx).close();
		
	}

}
