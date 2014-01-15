package com.resource.security;

public class SingletonExample1 {

	private static final SingletonExample1 INSTANCE = new SingletonExample1();

	private SingletonExample1() {
		// Initialize
	}

	public SingletonExample1 getInstance() {
		return INSTANCE;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
