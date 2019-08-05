package com.java.newfeatues.defaultmethods.broker.pojo;

import com.java.newfeatues.defaultmethods.broker.interfaces.ICommision;

public class BrokerAgent implements ICommision {

	@Override
	public boolean checkCommisioncomplience() {
		return false;
	}

	public void processCommision() {

		// accessing interface static methods.
		String code = ICommision.getCommisionCode();
		System.out.println("code :" + code);
		// accessing default method.
		double rate = calculateCommision();
		System.out.println("rate :" + rate);
	}

}
