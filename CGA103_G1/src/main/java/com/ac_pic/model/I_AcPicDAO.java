package com.ac_pic.model;

import java.util.List;

public interface I_AcPicDAO {
	
	public void insert(AcPicVO acPicVO);   // 新增

	public void update(AcPicVO acPicVO);      // 修改

	public void delete(Integer ac_pic_no);    // 刪除
	
	public AcPicVO getOne(Integer ac_pic_no); // 查詢一筆
	
	public List<AcPicVO> getAll();  // 查詢全部
	
}
