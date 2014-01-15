package com.resource.security.overlflow;

public class FloatingPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float pi = (float) (Math.PI * Math.pow(10, -37));
		for (int i = 0; i < 100; i++) {

			// Underflow, ultimately becomes 0 around i = 1
			// With a double around i=71
			pi = (float) (pi / 10000);
			System.out.println(i + ":" + pi);
		}
	}
}
