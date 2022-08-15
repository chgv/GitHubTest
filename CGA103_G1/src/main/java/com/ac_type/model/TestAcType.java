package com.ac_type.model;

import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;


public class TestAcType {
public static void main(String[] args) {
	I_AcTypeDAO iac = new AcTypeJdbcDAO();
	AcTypeVO ac = new AcTypeVO();
//	insert()
//	ac.setAc_type_name("恐怖");
//	iac.insert(ac);
	
//	update()
//	ac.setAc_type_name("奇異");
//	ac.setAc_type_no(10);
//	iac.update(ac);
	
//	getOne()
//	AcTypeVO acone = iac.getOne(1);
//	System.out.println("文章種類編號="+acone.getAc_type_no());
//	System.out.println("文章種類名稱="+acone.getAc_type_name());
	
//	getAll()
//	List<AcTypeVO> list = iac.getAll();
//	for(AcTypeVO acs : list) {
//		System.out.println("文章種類編號="+acs.getAc_type_no());
//		System.out.println("文章種類名稱="+acs.getAc_type_name());
//	}
//	System.out.println("成功查詢"+list.size()+"筆資料");
	}
}

