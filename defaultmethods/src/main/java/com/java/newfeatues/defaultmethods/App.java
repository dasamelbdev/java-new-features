package com.java.newfeatues.defaultmethods;

import com.java.newfeatues.defaultmethods.broker.pojo.BrokerAgent;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BrokerAgent brokerAgent = new BrokerAgent();
		brokerAgent.processCommision();
		brokerAgent.processAgreement();
		System.out.println(brokerAgent.getOwnerDeatils());
	}
}
