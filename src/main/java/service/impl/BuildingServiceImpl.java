package service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import constant.SystemConstant;
import dao.BuildingDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.impl.BuildingDaoImpl;
import input.BuildingSearchInput;
import output.BuildingOutput;
import service.BuildingService;
import utils.StringUtils;

public class BuildingServiceImpl implements BuildingService {
	
	private BuildingDao buildingDao = new BuildingDaoImpl();
	
	private static Map<String, String> typeMapping = StringUtils.createTranslationMap();
    
    public static String convertString(String inputStr) {
        String[] words = inputStr.split(",");
        StringBuilder translatedWords = new StringBuilder();

        for (String word : words) {
            String trimmedWord = word.trim();
            translatedWords.append(typeMapping.getOrDefault(trimmedWord, trimmedWord)).append(", ");
        }

        return translatedWords.toString().replaceAll(", $", "");
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
