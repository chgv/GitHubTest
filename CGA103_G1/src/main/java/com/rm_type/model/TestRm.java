package com.rm_type.model;

import java.util.List;

import com.emp.model.EmpVO;

public class TestRm {
public static void main(String[] args) {
	I_RmTypeDAO irm = new RmTypeJdbcDAO();
	RmTypeVO rm = new RmTypeVO();
	
//	insert()
//	rm.setStore_no(1);
//	rm.setRm_name("情趣套房");
//	rm.setRm_total(3);
//	rm.setRm_people(2);
//	rm.setRm_price(4600);
//	rm.setRm_area(8);
//	rm.setRm_intro("八爪椅");
//	rm.setRm_rate_sum(5);
//	rm.setRm_eval_sum(1);
//	rm.setRm_update(true);
//	
//	irm.insert(rm);
//	System.out.println("新增成功");
	
//	update()
//	rm.setStore_no(1);
//	rm.setRm_name("悠閒套房");
//	rm.setRm_total(3);
//	rm.setRm_people(2);
//	rm.setRm_price(3600);
//	rm.setRm_area(8);
//	rm.setRm_intro("按摩浴缸");
//	rm.setRm_rate_sum(5);
//	rm.setRm_eval_sum(2);
//	rm.setRm_update(true);
//	rm.setRm_type_no(15);
//	irm.update(rm);
//	System.out.println("更新成功");
	
//	changeState()
//	irm.changeState(1, false);
//	System.out.println("更新成功");
	
//	getOne()
//	RmTypeVO rmone = irm.getOne(1);
//	System.out.println("廠商=" + rmone.getStore_no());
//	System.out.println("房型=" + rmone.getRm_name());
//	System.out.println("房間數=" + rmone.getRm_total());
//	System.out.println("人數=" + rmone.getRm_people());
//	System.out.println("價格=" + rmone.getRm_price());
//	System.out.println("坪數=" + rmone.getRm_area());
//	System.out.println("介紹=" + rmone.getRm_intro());
//	System.out.println("評價=" + rmone.getRm_rate_sum());
//	System.out.println("評價人數=" + rmone.getRm_eval_sum());
//	System.out.println("狀態=" + rmone.getRm_update());
//
//	System.out.println("查詢成功");
	
//	getAll()
//	List<RmTypeVO> list = irm.getAll();
//	for(RmTypeVO rms : list) {
//		System.out.println("房型編號=" + rms.getRm_type_no());
//		System.out.println("廠商=" + rms.getStore_no());
//		System.out.println("房型=" + rms.getRm_name());
//		System.out.println("房間數=" + rms.getRm_total());
//		System.out.println("人數=" + rms.getRm_people());
//		System.out.println("價格=" + rms.getRm_price());
//		System.out.println("坪數=" + rms.getRm_area());
//		System.out.println("介紹=" + rms.getRm_intro());
//		System.out.println("評價=" + rms.getRm_rate_sum());
//		System.out.println("評價人數=" + rms.getRm_eval_sum());
//		System.out.println("狀態=" + rms.getRm_update());
//	}
//	System.out.println("成功查詢"+list.size()+"筆資料");
	
//	getAllRsv()
//	List<RmTypeVO> list = irm.getAllRsv();
//	for(RmTypeVO rms : list) {
//		System.out.println("房型編號=" + rms.getRm_type_no());
//		System.out.println("廠商=" + rms.getStore_no());
//		System.out.println("房型=" + rms.getRm_name());
//		System.out.println("房間數=" + rms.getRm_total());
//		System.out.println("人數=" + rms.getRm_people());
//		System.out.println("價格=" + rms.getRm_price());
//		System.out.println("坪數=" + rms.getRm_area());
//		System.out.println("介紹=" + rms.getRm_intro());
//		System.out.println("評價=" + rms.getRm_rate_sum());
//		System.out.println("評價人數=" + rms.getRm_eval_sum());
//		System.out.println("狀態=" + rms.getRm_update());
//	}
//	System.out.println("成功查詢"+list.size()+"筆資料");
}
}
