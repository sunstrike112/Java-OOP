package com.laptrinhjavaweb;

public class CaChuon extends LopCa {
	private String colorEye;
	private String colorSkin;
	
	
	// Contructor có 2 chức năng : Khởi tạo đối tượng và thiết lập giá trị
	public CaChuon() {
		
	}
	
	
	// Từ khoá this đại diện cho class CaChuon, chỉ tham chiếu đến các giá trị trong class đó
	// Từ khoá super tham chiếu đến các giá trị ở class cha
	public CaChuon(String colorEye, String colorSkin, String colorEyeParent, String colorSkinParent) {
		this.colorEye = colorEye;
		this.colorSkin = colorSkin;
		super.colorEye = colorEyeParent;
		super.colorSkin = colorSkinParent;
	}

	public String getColorEye() {
		return "Children: " + colorEye + " - Parent: " + super.getColorEye();
	}

	public String getColorSkin() {
		return colorSkin;
	}
	
}
