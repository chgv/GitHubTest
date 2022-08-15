package com.emp.model;

public class EmpService {
	private I_EmpDAO dao;

	public EmpService() {
		dao = new EmpDAO();
	}
}
