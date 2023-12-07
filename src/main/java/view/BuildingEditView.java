package view;

import java.util.List;

import controller.BuildingController;
import dto.BuildingDTO;
import input.BuildingSearchInput;
import output.BuildingOutput;

public class BuildingEditView {

	public static void main(String[] args) {
		String name = "toa nha 3";
		String street = "duong so 3";
		String dicstrict = null;
		String ward = null;
		Integer floorArea = null;
		String rentAreas = "100,200,300";

		BuildingDTO newBuilding = new BuildingDTO();
		newBuilding.setName(name);
		newBuilding.setStreet(street);
		newBuilding.setWard(ward);
		newBuilding.setDistrict(dicstrict);
		newBuilding.setFloorArea(floorArea);
		newBuilding.setRentAreas(rentAreas);

		BuildingController buildingController = new BuildingController();
		buildingController.insert(newBuilding);
	}
}
