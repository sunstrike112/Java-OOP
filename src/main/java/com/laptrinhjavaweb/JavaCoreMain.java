package com.laptrinhjavaweb;

import test.TestMain;

public class JavaCoreMain {
	public static void main(String[] args) {

//		int test = 12345678910; out range int 4 byte
		long test = 12345678910L; // long long 8 byte
		
		// Non primitive type - wrapper class (Integer, Long, Float, Double, Boolean) don't need default value
		Integer testNonPrimitive = null;
		System.out.println(testNonPrimitive);
		// primitive type (int, long, float, double, boolean) MUST have default value - cannot be null
//		int testPrimitive = null;
//		System.out.println(testPrimitive);
//		CaChuon caChuon = new CaChuon("yellow", "black");
		CaChuon caChuon = new CaChuon();
		System.out.println("Color eye: " + caChuon.getColorEye());
		caChuon.boi();
		TestMain testMain = new TestMain();
	}
}
