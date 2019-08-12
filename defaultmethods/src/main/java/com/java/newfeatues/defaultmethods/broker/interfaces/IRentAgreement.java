package com.java.newfeatues.defaultmethods.broker.interfaces;

public interface IRentAgreement {

	default String getOwnerDeatils() {
		return "sample rent Owner";
	}
}
