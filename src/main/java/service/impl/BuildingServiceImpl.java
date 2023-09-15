package service.impl;

import java.util.List;

import dao.BuildingDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.impl.BuildingDaoImpl;
import model.BuildingModel;
import service.BuildingService;
import service.emyeuanh.BuildingEmyeuanh;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingDao buildingDao = new BuildingDaoImpl();

	@Override
	public BuildingEmyeuanh[] findBuilding(BuildingModel buildingModel) {
		BuildingEmyeuanh[] buildingEmyeuanhs = new BuildingEmyeuanh[3];
		BuildingAnhyeuem[] anhyeuems =  buildingDao.findBuilding(
				buildingModel.getFloorArea(), 
				buildingModel.getName(), 
				buildingModel.getWard(), 
				buildingModel.getDistrict(), 
				buildingModel.getStreet());
		int i = 0;
		for (BuildingAnhyeuem item: anhyeuems) {
			BuildingEmyeuanh buildingEmyeuanh = new BuildingEmyeuanh();
			buildingEmyeuanh.setName(item.getName());
			buildingEmyeuanhs[i] = buildingEmyeuanh;
			i++;
		}
		return null;
	}
	
}
