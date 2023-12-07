package service;

import java.util.List;

import dto.BuildingDTO;
import input.BuildingSearchInput;
import output.BuildingOutput;

public interface BuildingService {
	
	List<BuildingOutput> findBuilding(BuildingSearchInput buildingModel);
	void save(BuildingDTO buildingDTO);
}
