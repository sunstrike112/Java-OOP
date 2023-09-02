package com.laptrinhjavaweb;

public class CaChuon extends LopCa {
	private String colorEye;
	private String colorSkin;
	
	
	// Contructor có 2 chức năng : Khởi tạo đối tượng và thiết lập giá trị
	public CaChuon() {
		
	}
	
	
	// Từ khoá this đại diện cho class CaChuon
	public CaChuon(String colorEye, String colorSkin) {
		this.colorEye = colorEye;
		this.colorSkin = colorSkin;
	}

	public String getColorEye() {
		return colorEye;
	}

	public String getColorSkin() {
		return colorSkin;
	}
	
}
