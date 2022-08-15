package com.ac_pic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ac_type.model.AcTypeVO;
import com.util.JDBCUtil;

public class AcPicJdbcDAO implements I_AcPicDAO {
	private static final String INSERT = "INSERT INTO ac_pic(ac_no, ac_pic_img)VALUES(?,?)";
	private static final String UPDATE = "UPDATE ac_pic SET ac_no=?, ac_pic_img=? WHERE ac_pic_no=?";
	private static final String DELETE = "DELETE FROM ac_pic WHERE ac_pic_no=?";
	private static final String GET_ONE = "SELECT * FROM ac_pic WHERE ac_pic_no=?";
	private static final String GET_ALL = "SELECT * FROM ac_pic";

	static { // 資料庫連線
		try {
			Class.forName(JDBCUtil.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(AcPicVO acPicVO) {
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(INSERT)) {

			ps.setInt(1, acPicVO.getAc_no());
			ps.setBytes(2, acPicVO.getAc_pic_img());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(AcPicVO acPicVO) {
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(UPDATE)) {

			ps.setInt(1, acPicVO.getAc_no());
			ps.setBytes(2, acPicVO.getAc_pic_img());
			ps.setInt(3, acPicVO.getAc_pic_no());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Integer ac_pic_no) {
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(DELETE)) {

			ps.setInt(1, ac_pic_no);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public AcPicVO getOne(Integer ac_pic_no) {
		ResultSet rs = null;
		AcPicVO ac = null;
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(GET_ONE)) {
			ps.setInt(1, ac_pic_no);
			rs = ps.executeQuery();
			while (rs.next()) {
				ac = new AcPicVO();
				ac.setAc_pic_no(rs.getInt("ac_pic_no"));
				ac.setAc_no(rs.getInt("ac_no"));
				ac.setAc_pic_img(rs.getBytes("ac_pic_img"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ac;
	}

	@Override
	public List<AcPicVO> getAll() {
		List<AcPicVO> acAll = new ArrayList<>();
		ResultSet rs = null;
		AcPicVO ac = null;
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(GET_ALL)) {

			rs = ps.executeQuery();
			while (rs.next()) {
				ac = new AcPicVO();
				ac.setAc_pic_no(rs.getInt("ac_pic_no"));
				ac.setAc_no(rs.getInt("ac_no"));
				ac.setAc_pic_img(rs.getBytes("ac_pic_img"));
				acAll.add(ac);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return acAll;
	}
}
