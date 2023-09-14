package dao;

import dao.anhyeuem.BuildingAnhyeuem;

public interface BuildingDao {
	BuildingAnhyeuem[] findBuilding(Integer floorArea, String name, String ward, String district, String street);
}
