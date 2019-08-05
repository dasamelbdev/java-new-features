package com.java.newfeatues.defaultmethods.broker.interfaces;

public interface ICommision {

	/**
	 * In java 8 we can include this kind of default methods. Implementation codes
	 * of the interfaces can override these methods if needed.
	 * 
	 */
	default double calculateCommision() {
		return 3.5;
	}

	/**
	 * In java 8 we can include static methods in interface.
	 */
	static String getCommisionCode() {
		return "Y2019";
	}

	/**
	 * old style implicitly public abstract interface method.
	 */
	boolean checkCommisioncomplience();
}
