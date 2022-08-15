package com.ac_pic.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class TestAcPic {
	public static void main(String[] args) throws IOException {
		
	I_AcPicDAO iac = new AcPicJdbcDAO();
	AcPicVO ac = new AcPicVO();
	byte[] pic = getPictureByteArray("logo.png");
//	insert()
//	ac.setAc_no(1);
//	ac.setAc_pic_img(pic);
//	iac.insert(ac);
//	System.out.println("新增成功");
//	update()
//	ac.setAc_no(1);
//	ac.setAc_pic_img(pic);
//	ac.setAc_pic_no(1);
//	iac.update(ac);
//	System.out.println("修改成功");
	
//	delete()
//	iac.delete(2);
//	System.out.println("刪除成功");
	
//	getOne()
//	AcPicVO acone = iac.getOne(1);
//	System.out.println("文章編號="+acone.getAc_no());
//	System.out.println("文章圖片="+acone.getAc_pic_img());
	
//	getAll()
	List<AcPicVO> list = iac.getAll();
	for(AcPicVO acs : list) {
		System.out.println("文章編號="+acs.getAc_no());
		System.out.println("文章圖片="+acs.getAc_pic_img());
	}
	System.out.println("成功查詢"+list.size()+"筆資料");
	
	
	}
	
	
	public static byte[] getPictureByteArray(String path) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		byte[] buffer = new byte[fis.available()];
		fis.read(buffer);
		fis.close();
		return buffer;
	}
}
