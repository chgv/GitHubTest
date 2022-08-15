package com.ac_type.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rm_order.model.RmOrderVO;
import com.util.JDBCUtil;

public class AcTypeJdbcDAO implements I_AcTypeDAO {
	private static final String INSERT = "INSERT INTO ac_type (ac_type_name) VALUES (?)";
	private static final String UPDATE = "UPDATE ac_type SET ac_type_name=? WHERE ac_type_no=?";
	private static final String GET_ONE = "SELECT * FROM ac_type WHERE ac_type_no=?";
	private static final String GET_ALL = "SELECT * FROM ac_type";

	static { // 資料庫連線
		try {
			Class.forName(JDBCUtil.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(AcTypeVO acTypeVO) {
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(INSERT)) {

			ps.setString(1, acTypeVO.getAc_type_name());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(AcTypeVO acTypeVO) {
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(UPDATE)) {

			ps.setString(1, acTypeVO.getAc_type_name());
			ps.setInt(2, acTypeVO.getAc_type_no());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public AcTypeVO getOne(Integer ac_type_no) {
		ResultSet rs = null;
		AcTypeVO ac = null;
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(GET_ONE)) {
			ps.setInt(1, ac_type_no);
			rs = ps.executeQuery();
			while (rs.next()) {
				ac = new AcTypeVO();
			ac.setAc_type_no(rs.getInt("ac_type_no"));
			ac.setAc_type_name(rs.getString("ac_type_name"));
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
	public List<AcTypeVO> getAll() {
		List<AcTypeVO> acAll = new ArrayList<>();
		ResultSet rs = null;
		AcTypeVO ac = null;
		try (Connection con = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
				PreparedStatement ps = con.prepareStatement(GET_ALL)) {

			rs = ps.executeQuery();
			while (rs.next()) {
				ac = new AcTypeVO();
				ac.setAc_type_no(rs.getInt("ac_type_no"));
				ac.setAc_type_name(rs.getString("ac_type_name"));
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
