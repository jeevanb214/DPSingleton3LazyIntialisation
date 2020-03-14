package com.singleton;

public class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Singleton(); //we calling the method by requesting only here we can also use try catch

		return INSTANCE;

	}

}
