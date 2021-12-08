package com.java.modern.features.interfaces.consumers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsumerTest {

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
	void whenUsingConsumerFunctionalInterface_thenReturnResult() {
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("hello");
		assertTrue(true);
	}

	@Test
	void whenUsingIntConsumerFunctionalInterface_thenReturnResult() {
		IntConsumer consumer = (s) -> System.out.println(s);
		consumer.accept(100);
		assertTrue(true);
	}

	@Test
	void whenUsingDoubleConsumerFunctionalInterface_thenReturnResult() {
		DoubleConsumer consumer = (s) -> System.out.println(s);
		consumer.accept(89.2356959d);
		assertTrue(true);
	}

	@Test
	void whenUsingLongConsumerFunctionalInterface_thenReturnResult() {
		LongConsumer consumer = (s) -> System.out.println(s);
		consumer.accept(56L);
		assertTrue(true);
	}

	@Test
	void whenUsingObjLongConsumerFunctionalInterface_thenReturnResult() {
		ObjLongConsumer<String> consumer = (s, val) -> System.out
				.println("Srtring value :" + s + " long value :" + val);
		consumer.accept("hi", 56L);
		assertTrue(true);
	}

	@Test
	void whenUsingObjIntConsumerFunctionalInterface_thenReturnResult() {
		ObjIntConsumer<String> consumer = (s, val) -> System.out.println("Srtring value :" + s + " int  value :" + val);
		consumer.accept("hi", 9);
		assertTrue(true);
	}

	@Test
	void whenUsingObjDoubleConsumerFunctionalInterface_thenReturnResult() {
		ObjDoubleConsumer<String> consumer = (s, val) -> System.out
				.println("Srtring value :" + s + " double value :" + val);
		consumer.accept("hi", 9.565656d);
		assertTrue(true);
	}

	// ==============Bi-Consumer Example=============//
	@Test
	void whenUsingBiConsumerFunctionalInterface_thenReturnResult() {
		BiConsumer<String, Double> consumer = (s, val) -> System.out
				.println("Bi consumer example ====> Srtring value :" + s + " double  value :" + val);
		consumer.accept("hi", 9.26d);
		assertTrue(true);
	}

	// ==============ForEach method===============//

	@Test
	void whenUsingForEachMethodOnList_thenReturnResult() {

		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Consumer<Integer> consumer = (n) -> {
			System.out.println(n * n);
		};
		numList.forEach(consumer);
		assertTrue(true);

	}

	@Test
	void whenUsingForEachMethodOnMap_thenReturnResult() {

		Map<String, String> envs = System.getenv();
		BiConsumer<String, String> biConsumer = (k, v) -> {
			System.out.println("key: " + k + " " + "value: " + v);
		};

		envs.forEach(biConsumer);
		assertTrue(true);

	}

	// =================connecting two consumers====================//

	@Test
	void whenUsingandThenToCombineConsumers_thenReturnRersult() {

		List<String> personList = Arrays.asList("john", "mary", "david");

		Consumer<String> greetingConsumer = (s) -> {
			System.out.println("Hi " + s);
		};

		Consumer<String> questionConsumer = (s) -> {
			System.out.println(" why are you learninig java functiomnal programming " + s + " ?");
		};

		personList.forEach(greetingConsumer.andThen(questionConsumer));
		assertTrue(true);

	}

	@Test
	void whenUsingandThenToCombineConsumersAffectingSameObject_thenReturnRersult()

	{

		com.java.modern.features.util.Test t1 = new com.java.modern.features.util.Test();
		t1.setAge(24);
		// com.java.modern.features.util.Test t2 = new
		// com.java.modern.features.util.Test();
		// com.java.modern.features.util.Test t3 = new
		// com.java.modern.features.util.Test();

		List<com.java.modern.features.util.Test> numberList = Arrays.asList(t1);

		Consumer<com.java.modern.features.util.Test> add_100 = (n) -> {
			System.out.println("initial age  :" + n.getAge());
			n.setAge(n.getAge() + 100);
		};

		Consumer<com.java.modern.features.util.Test> multiplyBy_2 = (n) -> {
			System.out.println("current  age  :" + n.getAge());
			n.setAge(n.getAge() * 2);
			System.out.println("final age  :" + n.getAge());

		};

		numberList.forEach(add_100.andThen(multiplyBy_2));
		assertTrue(true);

	}

}
