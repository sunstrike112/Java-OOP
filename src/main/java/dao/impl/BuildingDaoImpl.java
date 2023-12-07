package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.BuildingDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.anhyeuem.RentAreaAnhyeuem;
import utils.ConnectionUtils;
import utils.StringUtils;

public class BuildingDaoImpl implements BuildingDao {

	@Override
	public List<BuildingAnhyeuem> findBuilding(Integer floorArea, String name, String ward, String street,
			String district) {

//		BuildingAnhyeuem[] results = new BuildingAnhyeuem[] {};
		List<BuildingAnhyeuem> results = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			StringBuilder query = new StringBuilder("SELECT * FROM building WHERE 1 = 1");
			if (floorArea != null) {
				query.append(" AND floorarea = " + floorArea + "");
			}
			if (!StringUtils.isNullOrEmpty(name)) {
				query.append(" AND name like '%" + name + "%'");
			}
			if (!StringUtils.isNullOrEmpty(street)) {
				query.append(" AND street like '%" + street + "%'");
			}
			if (!StringUtils.isNullOrEmpty(district)) {
				query.append(" AND district like '%" + district + "%'");
			}
			if (!StringUtils.isNullOrEmpty(ward)) {
				query.append(" AND ward like '%" + ward + "%'");
			}

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = ConnectionUtils.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query.toString());
			ResultSetMetaData rsmd = rs.getMetaData();

//			int i = 0;
			while (rs.next()) {
				BuildingAnhyeuem buildingAnhyeuem = new BuildingAnhyeuem();
				buildingAnhyeuem.setName(rs.getString("name"));
				buildingAnhyeuem.setStreet(rs.getString("street"));
				buildingAnhyeuem.setWard(rs.getString("ward"));
				buildingAnhyeuem.setDistrict(rs.getString("district"));
				buildingAnhyeuem.setFloorArea(rs.getInt("floorarea"));
				buildingAnhyeuem.setType(rs.getString("type"));

//				results[i] = buildingAnhyeuem;
//				i++;
				results.add(buildingAnhyeuem);
			}

			return results;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		return new ArrayList<>();
	}

	@Override
	public Long insert(BuildingAnhyeuem buildingAnhyeuem, String rentAreas) {
		ResultSet resultSet = null;
		Long buildingId = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConnectionUtils.getConnection();
			stmt = conn.createStatement();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO building(name, street) VALUES ('" + buildingAnhyeuem.getName() + "','"
					+ buildingAnhyeuem.getStreet() + "')";
			int flag = stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			resultSet = stmt.getGeneratedKeys();
			if (flag > 0) {
				while (resultSet.next()) {
					buildingId = resultSet.getLong(1);
				}
			}

			if (rentAreas.length() > 0) {
				for (String item : rentAreas.split(",")) {
					String sql2 = "INSERT INTO rentarea(value,buildingid) VALUES (" + Integer.parseInt(item) + ","
							+ buildingId + ")";
					stmt.execute(sql2);
				}
			}

			conn.commit();
			return buildingId;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
				stmt.close();
				resultSet.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}
}
