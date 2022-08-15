package com.emp.model;

import java.io.Serializable;

public class EmpVO implements Serializable{
	private Integer emp_no;
	private String emp_acc;
	private String emp_pwd;
	private String emp_name;
	private String emp_email;
	private Boolean emp_state;
	

	public Integer getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(Integer emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_acc() {
		return emp_acc;
	}

	public void setEmp_acc(String emp_acc) {
		this.emp_acc = emp_acc;
	}

	public String getEmp_pwd() {
		return emp_pwd;
	}

	public void setEmp_pwd(String emp_pwd) {
		this.emp_pwd = emp_pwd;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public Boolean getEmp_state() {
		return emp_state;
	}

	public void setEmp_state(Boolean emp_state) {
		this.emp_state = emp_state;
	}
	
	

}
