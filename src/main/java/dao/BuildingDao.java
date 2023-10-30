package dao;

import java.util.List;

import dao.anhyeuem.BuildingAnhyeuem;

public interface BuildingDao {
	List<BuildingAnhyeuem> findBuilding(Integer floorArea, String name, String ward, String district, String street);
}
