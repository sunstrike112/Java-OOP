package service.impl;

import dao.BuildingDao;
import dao.impl.BuildingDaoImpl;
import model.BuildingModel;
import service.BuildingService;
import service.emyeuanh.BuildingEmyeuanh;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingDao buildingDao = new BuildingDaoImpl();

	@Override
	public BuildingEmyeuanh[] findBuilding(BuildingModel buildingModel) {
		buildingDao.findBuilding(
				buildingModel.getFloorArea(), 
				buildingModel.getName(), 
				buildingModel.getWard(), 
				buildingModel.getDistrict(), 
				buildingModel.getStreet());
		return null;
	}
	
}
