package service;

import model.BuildingModel;
import service.emyeuanh.BuildingEmyeuanh;

public interface BuildingService {
	
	BuildingEmyeuanh[] findBuilding(BuildingModel buildingModel);
}
