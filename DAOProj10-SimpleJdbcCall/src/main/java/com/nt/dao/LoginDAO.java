package com.nt.dao;

import java.util.Map;

public interface LoginDAO {
public Map<String,Object> p_authenticate(String uname,String password);
}
