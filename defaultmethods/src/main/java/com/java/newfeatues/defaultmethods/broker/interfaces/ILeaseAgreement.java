/**
 * 
 */
package com.java.newfeatues.defaultmethods.broker.interfaces;

/**
 * @author dsamarasiri
 *
 */
public interface ILeaseAgreement {
	
	default String getOwnerDeatils() {
		return "sample lease Owner";
	}
}
