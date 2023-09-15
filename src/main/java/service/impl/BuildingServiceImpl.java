package service.impl;

import java.util.ArrayList;
import java.util.List;

import dao.BuildingDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.impl.BuildingDaoImpl;
import input.BuildingSearchInput;
import output.BuildingOutput;
import service.BuildingService;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingDao buildingDao = new BuildingDaoImpl();

	@Override
	public List<BuildingOutput> findBuilding(BuildingSearchInput buildingSearchInput) {
		List<BuildingOutput> buildingOutputs = new ArrayList<>();
		List<BuildingAnhyeuem> anhyeuems =  buildingDao.findBuilding(
				buildingSearchInput.getFloorArea(), 
				buildingSearchInput.getName(),
				buildingSearchInput.getWard(), 
				buildingSearchInput.getStreet(),
				buildingSearchInput.getDistrict());

		//		int i = 0;
		for (BuildingAnhyeuem item: anhyeuems) {
			BuildingOutput buildingOutput = new BuildingOutput();
			buildingOutput.setName(item.getName());
			buildingOutput.setAddress(item.getStreet() + " - " + item.getWard() + " - " + item.getDistrict());
			
			buildingOutputs.add(buildingOutput);
			
//			buildingEmyeuanhs[i] = buildingEmyeuanh;
//			i++;
		}
		return buildingOutputs;
	}
	
}
