package com.ac_pic.model;

import java.io.Serializable;

public class AcPicVO implements Serializable {
	private Integer ac_pic_no;
	private Integer ac_no;
	private byte[] ac_pic_img;
	
	public Integer getAc_pic_no() {
		return ac_pic_no;
	}
	public void setAc_pic_no(Integer ac_pic_no) {
		this.ac_pic_no = ac_pic_no;
	}
	public Integer getAc_no() {
		return ac_no;
	}
	public void setAc_no(Integer ac_no) {
		this.ac_no = ac_no;
	}
	public byte[] getAc_pic_img() {
		return ac_pic_img;
	}
	public void setAc_pic_img(byte[] ac_pic_img) {
		this.ac_pic_img = ac_pic_img;
	}
	
}
