package com.ac_type.model;

import java.io.Serializable;

public class AcTypeVO implements Serializable {
	private Integer ac_type_no;
	private String ac_type_name;
	public Integer getAc_type_no() {
		return ac_type_no;
	}
	public void setAc_type_no(Integer ac_type_no) {
		this.ac_type_no = ac_type_no;
	}
	public String getAc_type_name() {
		return ac_type_name;
	}
	public void setAc_type_name(String ac_type_name) {
		this.ac_type_name = ac_type_name;
	}
	
}
