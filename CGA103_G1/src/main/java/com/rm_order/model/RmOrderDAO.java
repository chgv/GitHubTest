package com.rm_order.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import com.util.JDBCUtil;

public class RmOrderDAO implements I_RmOrderDAO {
	private static final String INSERT = "INSERT INTO rm_order(mem_no, store_no, order_date, rm_order_status, rm_charge, rm_review)VALUES(?,?,NOW(),?,?,?)";
	private static final String UPDATE = "UPDATE rm_order SET mem_no=?, store_no=?, order_date=?, rm_order_status=?, rm_charge=?, rm_review=? WHERE rm_order_no=?";
	private static final String UPDATESTATUS = "UPDATE rm_order SET rm_order_status=?, rm_charge=? WHERE rm_order_no=?";
	private static final String GET_ONE = "SELECT * FROM rm_order WHERE rm_order_no=?";
	private static final String GET_ALL = "SELECT * FROM rm_order";
	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public RmOrderVO insert(RmOrderVO rmOrderVO) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(INSERT);

			ps.setInt(1, rmOrderVO.getMem_no());
			ps.setInt(2, rmOrderVO.getStore_no());
			ps.setInt(3, rmOrderVO.getRm_order_status());
			ps.setInt(4, rmOrderVO.getRm_charge());
			ps.setInt(5, rmOrderVO.getRm_review());
			ps.setInt(6, rmOrderVO.getRm_order_no());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rmOrderVO;
	}

	@Override
	public void update(RmOrderVO rmOrderVO) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(UPDATE);

			ps.setInt(1, rmOrderVO.getMem_no());
			ps.setInt(2, rmOrderVO.getStore_no());
			ps.setObject(3, rmOrderVO.getOrder_date());
			ps.setInt(4, rmOrderVO.getRm_order_status());
			ps.setInt(5, rmOrderVO.getRm_charge());
			ps.setInt(6, rmOrderVO.getRm_review());
			ps.setInt(7, rmOrderVO.getRm_order_no());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateStatus(RmOrderVO rmOrderVO) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(UPDATESTATUS);

			ps.setInt(1, rmOrderVO.getRm_order_status());
			ps.setInt(2, rmOrderVO.getRm_charge());
			ps.setInt(3, rmOrderVO.getRm_order_no());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public RmOrderVO getOne(Integer rm_order_no) {
		ResultSet rs = null;
		RmOrderVO rm = null;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(GET_ONE);

			ps.setInt(1, rm_order_no);
			rs = ps.executeQuery();
			while (rs.next()) {
				rm = new RmOrderVO();
				rm.setRm_order_no(rs.getInt("rm_order_no"));
				rm.setMem_no(rs.getInt("mem_no"));
				rm.setStore_no(rs.getInt("store_no"));
				rm.setOrder_date(rs.getDate("order_date"));
				rm.setRm_order_status(rs.getInt("rm_order_status"));
				rm.setRm_charge(rs.getInt("rm_charge"));
				rm.setRm_review(rs.getInt("rm_review"));
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
		return rm;
	}

	@Override
	public List<RmOrderVO> getAll() {
		List<RmOrderVO> rmAll = new ArrayList<>();
		ResultSet rs = null;
		RmOrderVO rm = null;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ds.getConnection();
			ps = con.prepareStatement(GET_ALL);

			rs = ps.executeQuery();
			while (rs.next()) {
				rm = new RmOrderVO();
				rm.setRm_order_no(rs.getInt("rm_order_no"));
				rm.setMem_no(rs.getInt("mem_no"));
				rm.setStore_no(rs.getInt("store_no"));
				rm.setOrder_date(rs.getDate("order_date"));
				rm.setRm_order_status(rs.getInt("rm_order_status"));
				rm.setRm_charge(rs.getInt("rm_charge"));
				rm.setRm_review(rs.getInt("rm_review"));

				rmAll.add(rm);
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
		return rmAll;
	}
}
