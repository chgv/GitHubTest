package com.rm_order.model;

import java.io.Serializable;
import java.util.Date;

public class RmOrderVO implements Serializable {
	private Integer rm_order_no;
	private Integer mem_no;
	private Integer store_no;
	private Date order_date;
	private Integer rm_order_status;
	private Integer rm_charge;
	private Integer rm_review;

	public Integer getRm_order_no() {
		return rm_order_no;
	}

	public void setRm_order_no(Integer rm_order_no) {
		this.rm_order_no = rm_order_no;
	}

	public Integer getMem_no() {
		return mem_no;
	}

	public void setMem_no(Integer mem_no) {
		this.mem_no = mem_no;
	}

	public Integer getStore_no() {
		return store_no;
	}

	public void setStore_no(Integer store_no) {
		this.store_no = store_no;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public Integer getRm_order_status() {
		return rm_order_status;
	}

	public void setRm_order_status(Integer rm_order_status) {
		this.rm_order_status = rm_order_status;
	}

	public Integer getRm_charge() {
		return rm_charge;
	}

	public void setRm_charge(Integer rm_charge) {
		this.rm_charge = rm_charge;
	}

	public Integer getRm_review() {
		return rm_review;
	}

	public void setRm_review(Integer rm_review) {
		this.rm_review = rm_review;
	}

}
