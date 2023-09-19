package service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.BuildingDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.impl.BuildingDaoImpl;
import input.BuildingSearchInput;
import output.BuildingOutput;
import service.BuildingService;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingDao buildingDao = new BuildingDaoImpl();
	
    private static Map<String, String> typeMapping = new HashMap<>();

    static {
    	typeMapping.put("tang_tret", "tầng trệt");
    	typeMapping.put("nguyen_can", "nguyên căn");
    }
    
    public static String convertString(String input) {
        StringBuilder result = new StringBuilder();
        String[] parts = input.split(",");

        for (String part : parts) {
            String trimmedPart = part.trim();
            if (typeMapping.containsKey(trimmedPart)) {
                result.append(typeMapping.get(trimmedPart));
            } else {
                result.append(trimmedPart);
            }
            result.append(", ");
        }
        if (result.length() > 2) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }

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
			buildingOutput.setType(convertString(item.getType()));
			
			buildingOutputs.add(buildingOutput);
			
//			buildingEmyeuanhs[i] = buildingEmyeuanh;
//			i++;
		}
		return buildingOutputs;
	}
	
}
