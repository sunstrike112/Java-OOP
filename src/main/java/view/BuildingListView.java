package view;

import java.util.List;

import controller.BuildingController;
import input.BuildingSearchInput;
import output.BuildingOutput;

public class BuildingListView {
	public static void main(String[] args) {
		String name = null;
		String street = null;
//		String name = "building";
//		String street = "bùi thị xuân";
		String dicstrict = null;
		String ward = null;
		Integer floorArea = null;
		
		BuildingSearchInput buildingSearch = new BuildingSearchInput();
		buildingSearch.setName(name);
		buildingSearch.setStreet(street);
		buildingSearch.setWard(ward);
		buildingSearch.setDistrict(dicstrict);
		buildingSearch.setFloorArea(floorArea);

		BuildingController buildingController = new BuildingController();
		List<BuildingOutput> buildings = buildingController.findBuilding(buildingSearch);
		
		for (BuildingOutput item: buildings) {
			System.out.println(item.getName() + " - " + item.getAddress() + " - " + item.getType());
		}
	}
}
