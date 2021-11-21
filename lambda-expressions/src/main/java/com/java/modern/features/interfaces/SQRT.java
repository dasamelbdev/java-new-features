package com.java.modern.features.interfaces;

//This is a functional interface-it can have one and only one abstract method but can have any number of default and static methods. Also any number of inherited abstract methods can be there in a functional interface

@FunctionalInterface
public interface SQRT {
	double calculateSqrt(double value);

}
