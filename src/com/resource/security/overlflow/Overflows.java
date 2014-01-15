package com.resource.security.overlflow;

public class Overflows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		byte b1 = 126;
		byte b2 = 3;

		// Not casting automatically gives you a an int
		System.out.println((byte) (b1 + b2));
	}
}
