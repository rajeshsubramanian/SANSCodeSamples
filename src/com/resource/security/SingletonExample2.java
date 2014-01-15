package com.resource.security;

public class SingletonExample2 {

	// Use volatile
	private volatile SingletonExample2 singletonExample2;

	public SingletonExample2 getInstance() {
		if (singletonExample2 == null) {
			synchronized (this) {
				singletonExample2 = new SingletonExample2();
			}
		}
		return singletonExample2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
