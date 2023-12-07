package converter;

import dao.anhyeuem.BuildingAnhyeuem;
import dto.BuildingDTO;
import output.BuildingOutput;
import utils.BuidingTypeUtils;

public class BuildingConverter {
	public BuildingOutput convertFromAnhyeuemToOutput(BuildingAnhyeuem buildingAnhyeuem) {
		BuildingOutput result = new BuildingOutput();
		result.setName(buildingAnhyeuem.getName());
		result.setAddress(buildingAnhyeuem.getStreet() + " - " + buildingAnhyeuem.getWard() + " - " + buildingAnhyeuem.getDistrict());
//		result.setType(convertString(buildingAnhyeuem.getType()));
		result.setType(BuidingTypeUtils.getType(buildingAnhyeuem.getType()));
		return result;
	}
	
	public BuildingAnhyeuem convertFromDtoToAnhyeuem(BuildingDTO buildingDTO) {
		BuildingAnhyeuem result = new BuildingAnhyeuem();
		result.setName(buildingDTO.getName());
		result.setStreet(buildingDTO.getStreet());
		return result;
	}
}
