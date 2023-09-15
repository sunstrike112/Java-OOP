package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import dao.BuildingDao;
import dao.anhyeuem.BuildingAnhyeuem;
import utils.ConnectionUtils;
import utils.StringUtils;

public class BuildingDaoImpl implements BuildingDao {
	
	@Override
	public BuildingAnhyeuem[] findBuilding(Integer floorArea, String name, String ward, String district, String street) {
		
		BuildingAnhyeuem[] results = new BuildingAnhyeuem[] {};
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			StringBuilder query = new StringBuilder("SELECT * FROM building WHERE 1 = 1");
			if (floorArea != null) {
				query.append(" AND floorarea = "+floorArea+"");
			}
			if (!StringUtils.isNullOrEmpty(name)) {
				query.append(" AND name like '%"+name+"%'");
			}
			if (!StringUtils.isNullOrEmpty(street)) {
				query.append(" AND street like '%"+street+"%'");
			}
			if (!StringUtils.isNullOrEmpty(district)) {
				query.append(" AND district like '%"+district+"%'");
			}
			if (!StringUtils.isNullOrEmpty(ward)) {
				query.append(" AND ward like '%"+ward+"%'");
			}

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = ConnectionUtils.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query.toString());
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int i = 0;
			while (rs.next()) {
				BuildingAnhyeuem buildingAnhyeuem = new BuildingAnhyeuem();
				buildingAnhyeuem.setName(rs.getString("name"));
				buildingAnhyeuem.setStreet(rs.getString("street"));
				buildingAnhyeuem.setWard(rs.getString("ward"));
				buildingAnhyeuem.setDistrict(rs.getString("district"));
				buildingAnhyeuem.setFloorArea(rs.getInt("floorarea"));
				
				results[i] = buildingAnhyeuem;
				i++;
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
		return null;
	};
}