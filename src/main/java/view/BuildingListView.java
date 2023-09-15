package view;

import controller.BuildingController;
import model.BuildingModel;

public class BuildingListView {
	public static void main(String[] args) {
		String name = null;
		String street = null;
		String dicstrict = null;
		String ward = null;
		Integer floorArea = null;
		
		BuildingModel buildingSearch = new BuildingModel();
		buildingSearch.setFloorArea(floorArea);
		buildingSearch.setName(name);
		buildingSearch.setWard(ward);
		buildingSearch.setDicstrict(dicstrict);
		
		BuildingController buildingController = new BuildingController();
		BuildingModel[] buildings = buildingController.findBuilding(buildingSearch);
		
		for (BuildingModel item: buildings) {
			
		}
	}
}
