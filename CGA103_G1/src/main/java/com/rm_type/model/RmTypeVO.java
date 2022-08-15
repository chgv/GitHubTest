package com.rm_type.model;

import java.io.Serializable;

public class RmTypeVO implements Serializable {
	private Integer rm_type_no;
	private Integer store_no;
	private String rm_name;
	private Integer rm_total;
	private Integer rm_people;
	private Integer rm_price;
	private Integer rm_area;
	private String rm_intro;
	private Integer rm_rate_sum;
	private Integer rm_eval_sum;
	private Boolean rm_update;
	
	public Integer getRm_type_no() {
		return rm_type_no;
	}
	public void setRm_type_no(Integer rm_type_no) {
		this.rm_type_no = rm_type_no;
	}
	public Integer getStore_no() {
		return store_no;
	}
	public void setStore_no(Integer store_no) {
		this.store_no = store_no;
	}
	public String getRm_name() {
		return rm_name;
	}
	public void setRm_name(String rm_name) {
		this.rm_name = rm_name;
	}
	public Integer getRm_total() {
		return rm_total;
	}
	public void setRm_total(Integer rm_total) {
		this.rm_total = rm_total;
	}
	public Integer getRm_people() {
		return rm_people;
	}
	public void setRm_people(Integer rm_people) {
		this.rm_people = rm_people;
	}
	public Integer getRm_price() {
		return rm_price;
	}
	public void setRm_price(Integer rm_price) {
		this.rm_price = rm_price;
	}
	public Integer getRm_area() {
		return rm_area;
	}
	public void setRm_area(Integer rm_area) {
		this.rm_area = rm_area;
	}
	public String getRm_intro() {
		return rm_intro;
	}
	public void setRm_intro(String rm_intro) {
		this.rm_intro = rm_intro;
	}
	public Integer getRm_rate_sum() {
		return rm_rate_sum;
	}
	public void setRm_rate_sum(Integer rm_rate_sum) {
		this.rm_rate_sum = rm_rate_sum;
	}
	public Integer getRm_eval_sum() {
		return rm_eval_sum;
	}
	public void setRm_eval_sum(Integer rm_eval_sum) {
		this.rm_eval_sum = rm_eval_sum;
	}
	public Boolean getRm_update() {
		return rm_update;
	}
	public void setRm_update(Boolean rm_update) {
		this.rm_update = rm_update;
	}
	
	
}
