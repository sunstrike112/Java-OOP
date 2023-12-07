package utils;

import java.util.ArrayList;
import java.util.List;

import enums.BuildingTypeEnums;

public class BuidingTypeUtils {
	public static String getType(String oldType) {
		List<String> newTypes = new ArrayList<>();
		if (oldType != null) {
			for (String item: oldType.split(",")) {
				newTypes.add(BuildingTypeEnums.valueOf(item).getValue());
			}
			return String.join(",", newTypes);
		}
		return null;
	}
}
