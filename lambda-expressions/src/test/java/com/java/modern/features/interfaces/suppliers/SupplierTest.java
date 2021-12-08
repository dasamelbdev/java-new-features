package com.java.modern.features.interfaces.suppliers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupplierTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void whenUsingSupplierFunctionalInterface_thenReturnResult() {
		Supplier<Integer> supplier = () -> 100;
		assertNotNull(supplier.get());
		assertEquals(100, supplier.get().intValue());
	}

	@Test
	void whenUsingIntSupplierFunctionalInterface_thenReturnIntegerResult() {
		IntSupplier supplier = () -> 100;
		assertNotNull(supplier.getAsInt());
		assertEquals(100, supplier.getAsInt());

	}

	@Test
	void whenUsingLongSupplierFunctionalInterface_thenReturnLongResult() {
		LongSupplier supplier = () -> 100L;
		assertNotNull(supplier.getAsLong());
		assertEquals(100, supplier.getAsLong());

	}

	@Test
	void whenUsingDoubleSupplierFunctionalInterface_thenReturnDoubleResult() {
		DoubleSupplier supplier = () -> 10.895d;
		assertNotNull(supplier.getAsDouble());
		assertEquals(10.895d, supplier.getAsDouble());

	}

	@Test
	void whenUsingBooleanleSupplierFunctionalInterface_thenReturnBooleanResult() {
		BooleanSupplier supplier = () -> 8 < 6;
		assertNotNull(supplier.getAsBoolean());
		assertEquals(18 < 16, supplier.getAsBoolean());

	}

}