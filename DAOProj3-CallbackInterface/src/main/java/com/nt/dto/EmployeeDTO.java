package com.nt.dto;

public class EmployeeDTO {
	private int no;
	private String ename;
	private String job;
	private int sal;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [no=" + no + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}
	
	

}
