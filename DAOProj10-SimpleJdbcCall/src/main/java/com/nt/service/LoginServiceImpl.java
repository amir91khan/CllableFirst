package com.nt.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.LoginDAO;
@Service("service")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO dao;
	public LoginServiceImpl(LoginDAO dao) {
		this.dao=dao;
	}

	@Override
	public String validate(String uname, String password) {
		System.out.println("LoginServiceImpl.validate()");
		Map<String,Object> outParams=null;
		//use DAO
		outParams=dao.p_authenticate(uname, password);
		//Convert OutParams(Map) to String
		return (String)outParams.get("RESULT");
	}

	

}
