package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.RentAreaDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.anhyeuem.RentAreaAnhyeuem;
import utils.ConnectionUtils;
import utils.StringUtils;

public class RentAreaDaoImpl implements RentAreaDao {

	@Override
	public void insert(RentAreaAnhyeuem areaAnhyeuem) {
		try (Connection conn = ConnectionUtils.getConnection(); Statement stmt = conn.createStatement();) {
			String sql = "INSERT INTO rentarea(value,buildingid) VALUES ("+areaAnhyeuem.getValue()+","+areaAnhyeuem.getBuildingId()+")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
