package com.ac_type.model;

import java.util.List;


public interface I_AcTypeDAO {
	
	public void insert(AcTypeVO acTypeVO);  // 新增

	public void update(AcTypeVO acTypeVO);  // 修改

	public AcTypeVO getOne(Integer ac_type_no); // 查詢一筆
	
	public List<AcTypeVO> getAll(); // 查詢全部
}
