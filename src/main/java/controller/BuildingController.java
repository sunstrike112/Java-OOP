package controller;

import model.BuildingModel;
import service.BuildingService;
import service.impl.BuildingServiceImpl;

public class BuildingController {
	
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public BuildingModel[] findBuilding(BuildingModel buildingSearch) {
		buildingService.findBuilding(buildingSearch);
		return null;
	}
	
}
