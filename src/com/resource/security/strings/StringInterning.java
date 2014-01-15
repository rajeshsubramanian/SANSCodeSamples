package com.resource.security.strings;

public class StringInterning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String string1 = new String("hello").intern();
		String string2 = "hello";
		System.out.println(string1 == string2);
	}
}
