package com.java.newfeatues.defaultmethods.broker.pojo;

import com.java.newfeatues.defaultmethods.broker.interfaces.ICommision;
import com.java.newfeatues.defaultmethods.broker.interfaces.ILeaseAgreement;
import com.java.newfeatues.defaultmethods.broker.interfaces.IRentAgreement;
import com.java.newfeatues.defaultmethods.broker.interfaces.ISellingAgreement;

public class BrokerAgent implements ICommision, ISellingAgreement, IRentAgreement, ILeaseAgreement {

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

	/**
	 * we can invoke default methods of interfaces using super keyword
	 */
	public void processAgreement() {
		System.out.println("selling owner :" + ISellingAgreement.super.getOwnerDeatils());
		System.out.println("rent owner :" + IRentAgreement.super.getOwnerDeatils());
		System.out.println("lease owner :" + ILeaseAgreement.super.getOwnerDeatils());

	}

	/**
	 * 
	 * In order to get rid of errors regarding to multiple inheritance we have to
	 * override the common default method of interfaces.
	 * 
	 */
	@Override
	public String getOwnerDeatils() {
		return "we won against multiple inheritance";
	}

}
