package com.java.modern.features;

import java.util.function.Supplier;

import com.java.modern.features.interfaces.SQRT;

/**
 * Hello world!
 *
 */
public class App {

	public static void performCalculation(SQRT sqrt) {
		System.out.println(sqrt.calculateSqrt(49));
	}

	public static void main(String[] args) {

		performCalculation(n -> Math.sqrt(n));

		Supplier<Integer> supplier = () -> 80;
		System.out.println(supplier.get());

	}
}