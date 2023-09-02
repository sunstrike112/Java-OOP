package com.laptrinhjavaweb;

public abstract class LopCa {
	protected String colorEye;
	protected String colorSkin;
	
	protected abstract void boi(); 
//	{
//		System.out.println("Cá nào mà chả biết bơi");
//		String result = "Cá nào mà chả biết bơi";
//		System.out.println(result);
//	}
	
	protected void boi(String style) {
		System.out.println(style);
	}

	public String getColorEye() {
		return colorEye;
	}

	public String getColorSkin() {
		return colorSkin;
	}
	
}
