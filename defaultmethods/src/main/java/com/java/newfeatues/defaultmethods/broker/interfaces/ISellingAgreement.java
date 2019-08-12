/**
 * 
 */
package com.java.newfeatues.defaultmethods.broker.interfaces;

/**
 * @author dsamarasiri
 *
 */
public interface ISellingAgreement {

	default String getOwnerDeatils() {
		return "sample selling Owner";
	}
}
