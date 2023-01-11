package com.Sara.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	@BeforeEach
	void beforeEach() {
		System.out.println("this is a before each");
	}

	@AfterEach
	void afterEach() {
		System.out.println("this is after each method");
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("this is before all");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("this is after all");
	}

	@Test
	void Test1() {
		System.out.println("hello");
	}

	@Test
	void Test2() {
		System.out.println("hello goodmorning");
	}

	@Test
	void Test3() {
		System.out.println("hello sara");
	}
}
