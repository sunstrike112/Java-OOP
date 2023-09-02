package com.laptrinhjavaweb;

public class JavaCoreMain {
	public static void main(String[] args) {
		CaChuon caChuon = new CaChuon("black children", "yellow children", "black parent", "yellow parent");
		System.out.println("Color eye children: " + caChuon.getColorEye());
//		System.out.println("Color eye parent: " + caChuon.getColorEye());
	}
}
