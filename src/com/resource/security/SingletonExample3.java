package com.resource.security;

public enum SingletonExample3 {

	INSTANCE;

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		SingletonExample3.INSTANCE.setAge(1);
		System.out.println(SingletonExample3.INSTANCE.getAge());
	}
}
