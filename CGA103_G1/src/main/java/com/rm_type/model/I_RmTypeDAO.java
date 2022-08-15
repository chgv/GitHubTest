package com.rm_type.model;

import java.util.List;

public interface I_RmTypeDAO {

	public RmTypeVO insert(RmTypeVO rmtypeVO);  // 新增

	public RmTypeVO update(RmTypeVO rmtypeVO);  // 修改

	public void changeState(Integer rm_type_no, Boolean rm_update);   // 房型上下架
	
	public RmTypeVO getOne(Integer rm_type_no); // 查詢一筆

	public List<RmTypeVO> getAll();  // 查詢全部
	
	public List<RmTypeVO> getAllRsv();  // 查詢全部已上架
	

}
