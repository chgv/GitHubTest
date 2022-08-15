package com.emp.model;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class TestEmp {
	public static void main(String[] args) {
		I_EmpDAO iemp = new EmpJdbcDAO();
		EmpVO emp = new EmpVO();

//	insert()
//		emp.setEmp_acc("bbbb");
//		emp.setEmp_pwd("123");
//		emp.setEmp_name("陳");
//		emp.setEmp_email("chens11111s@gmail.com");
//		emp.setEmp_state(false);
//		iemp.insert(emp);
//
//		System.out.println("新增成功");

//	update()
		emp.setEmp_acc("bbbbbbb");
		emp.setEmp_pwd("12345");
		emp.setEmp_name("劉德華");
		emp.setEmp_email("chenrr@gmail.com");
		emp.setEmp_state(false);
		emp.setEmp_no(28);
		iemp.update(emp);

		System.out.println("修改成功");

//  getOne()
//		EmpVO empno = iemp.getOne(1);
//		System.out.println("#=" + empno.getEmp_no());
//		System.out.println("帳號=" + empno.getEmp_acc());
//		System.out.println("密碼=" + empno.getEmp_pwd());
//		System.out.println("姓名=" + empno.getEmp_name());
//		System.out.println("信箱=" + empno.getEmp_email());
//		System.out.println("狀態=" + empno.getEmp_state());
//
//		System.out.println("查詢成功");

//	getAll()
//		List<EmpVO> emps = iemp.getAll();
//		for(EmpVO aemp : emps) {
//			System.out.println("#="+aemp.getEmp_no());
//			System.out.println("帳號="+aemp.getEmp_acc());
//			System.out.println("密碼="+aemp.getEmp_pwd());
//			System.out.println("姓名="+aemp.getEmp_name());
//			System.out.println("信箱="+aemp.getEmp_email());
//			System.out.println("狀態="+aemp.getEmp_state());
//		}
//		System.out.println("成功查詢"+emps.size()+"筆資料");
		
//	login()
//		try {
//			emp = iemp.login("aaaaaa", "12345");
//			
//			System.out.println("#="+emp.getEmp_no());
//			System.out.println("帳號="+emp.getEmp_acc());
//			System.out.println("密碼="+emp.getEmp_pwd());
//			System.out.println("姓名="+emp.getEmp_name());
//			System.out.println("信箱="+emp.getEmp_email());
//			System.out.println("狀態="+emp.getEmp_state());
//			System.out.println("帳密無誤,登入成功");
//		} catch (Exception e) {
//			System.out.println("帳密錯誤,登入失敗");
//			
//			e.printStackTrace();
//		}
		
		
	}
}
