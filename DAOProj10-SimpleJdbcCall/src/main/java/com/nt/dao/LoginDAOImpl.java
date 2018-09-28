package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
@Repository("dao")
public class LoginDAOImpl implements LoginDAO {
	@Autowired
	private SimpleJdbcCall sjc;

	@Override
	public Map<String, Object> p_authenticate(String uname, String password) {
	Map<String,Object> inParams=null;
	Map<String,Object> outParams=null;
	sjc.setProcedureName("p_authenticate");
	inParams=new HashMap();
	inParams.put("user", uname);
	inParams.put("pass", password);
	outParams=sjc.execute(inParams);
	System.out.println(outParams);
		return outParams;
	}

}
