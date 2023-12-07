package service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import converter.BuildingConverter;
import dao.BuildingDao;
import dao.RentAreaDao;
import dao.anhyeuem.BuildingAnhyeuem;
import dao.anhyeuem.RentAreaAnhyeuem;
import dao.impl.BuildingDaoImpl;
import dao.impl.RentAreaDaoImpl;
import dto.BuildingDTO;
import input.BuildingSearchInput;
import output.BuildingOutput;
import service.BuildingService;
import utils.StringUtils;

public class BuildingServiceImpl implements BuildingService {

	private BuildingDao buildingDao = new BuildingDaoImpl();
	private RentAreaDao rentAreaDao = new RentAreaDaoImpl();
	private BuildingConverter buildingConverter = new BuildingConverter();

	private static Map<String, String> typeMapping = StringUtils.createTranslationMap();

//    public static String convertString(String inputStr) {
//        String[] words = inputStr.split(",");
//        StringBuilder translatedWords = new StringBuilder();
//
//        for (String word : words) {
//            String trimmedWord = word.trim();
//            translatedWords.append(typeMapping.getOrDefault(trimmedWord, trimmedWord)).append(", ");
//        }
//
//        return translatedWords.toString().replaceAll(", $", "");
//    }

	@Override
	public List<BuildingOutput> findBuilding(BuildingSearchInput buildingSearchInput) {
		List<BuildingOutput> buildingOutputs = new ArrayList<>();
		List<BuildingAnhyeuem> anhyeuems = buildingDao.findBuilding(buildingSearchInput.getFloorArea(),
				buildingSearchInput.getName(), buildingSearchInput.getWard(), buildingSearchInput.getStreet(),
				buildingSearchInput.getDistrict());

		// int i = 0;
		for (BuildingAnhyeuem item : anhyeuems) {
			// anhyeuem --> output
			BuildingOutput buildingOutput = buildingConverter.convertFromAnhyeuemToOutput(item);
			buildingOutputs.add(buildingOutput);
//			buildingEmyeuanhs[i] = buildingEmyeuanh;
//			i++;
		}
		return buildingOutputs;
	}

	@Override
	public void save(BuildingDTO buildingDTO) {
		if (buildingDTO.getId() == null) {
			// insert
			// DTO --> anhyeuem
			BuildingAnhyeuem buildingAnhyeuem = buildingConverter.convertFromDtoToAnhyeuem(buildingDTO);
//			Long buildingId = buildingDao.insert(buildingAnhyeuem);
//			if (buildingDTO.getRentAreas().length() > 0) {
//				for (String item : buildingDTO.getRentAreas().split(",")) {
//					RentAreaAnhyeuem rentAreaAnhyeuem = new RentAreaAnhyeuem();
//					rentAreaAnhyeuem.setValue(Integer.parseInt(item));
//					rentAreaAnhyeuem.setBuildingId(buildingId);
//					rentAreaDao.insert(rentAreaAnhyeuem);
//				}
//			}
			buildingDao.insert(buildingAnhyeuem, buildingDTO.getRentAreas());
		} else {
			// update
		}
	}

}
