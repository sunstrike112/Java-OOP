package utils;

import java.util.HashMap;
import java.util.Map;

import constant.SystemConstant;

public class StringUtils {
	public static boolean isNullOrEmpty(String value) {
		if (value != null && value != "")
			return false;
		return true;
	}

	public static Map<String, String> createTranslationMap() {
		Map<String, String> map = new HashMap<>();
		map.put(SystemConstant.CODE_TANG_TRET, SystemConstant.NAME_TANG_TRET);
		map.put(SystemConstant.CODE_NGUYEN_CAN, SystemConstant.NAME_NGUYEN_CAN);
		map.put(SystemConstant.CODE_NOI_THAT, SystemConstant.NAME_NOI_THAT);
		return map;
	}
}
