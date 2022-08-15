package com.rm_order.model;

import java.util.List;

public interface I_RmOrderDAO {

	public RmOrderVO insert(RmOrderVO rmOrderVO); // 新增

	public void update(RmOrderVO rmOrderVO); // 修改狀態(check in)

	public void updateStatus(RmOrderVO rmOrderVO); // 修改狀態 金額(取消金額=0)   ps:訂房預約->已預定數量-1

	public RmOrderVO getOne(Integer rm_order_no); // 查詢一筆

	public List<RmOrderVO> getAll(); // 查詢全部
	
}
