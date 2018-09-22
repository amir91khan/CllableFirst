package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_BY_N0 = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	//private static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	private JdbcTemplate jt;
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public EmployeeBO getEmployeeDetailsByNo(int no) {
		EmployeeBO bo=null;
		bo=jt.queryForObject(GET_EMP_BY_N0, new RowMapper<EmployeeBO>() {
			@Override
			public EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
				EmployeeBO bo=null;
				
				  bo=new EmployeeBO();
				  bo.setNo(rs.getInt(1));
				  bo.setEname(rs.getString(2));
				  bo.setJob(rs.getString(3));
				  bo.setSal(rs.getInt(4));
				 
				return bo;
			}
			
		}, no);
		return bo;
		
}//method
}
	/*@Override
	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg) {
		List<EmployeeBO> listBO = null;
		listBO = jt.query(GET_Emps_BY_DESG, new ResultSetExtractor<List<EmployeeBO>>() {

			@Override
			public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				System.out.println("extractData(-)");
				List<EmployeeBO> listBO = null;
				listBO = new ArrayList();
				EmployeeBO bo = null;
				while (rs.next()) {
					bo = new EmployeeBO();
					bo.setEid(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setDesg(rs.getString(3));
					bo.setSalary(rs.getInt(4));
					bo.setDeptNo(rs.getInt(5));
					listBO.add(bo);
				}
				return listBO;
			}
		}, desg);
		return listBO;
	}

	
	*/


