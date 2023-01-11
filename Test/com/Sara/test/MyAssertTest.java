package com.Sara.test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> ls= Arrays.asList("AWS","Java","Python","C++");
	@Test
	void Test() {
		boolean test=ls.contains("AWS");
		assertEquals(true,test);
		assertTrue(test);
		//assertFalse(test);
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		assertEquals(4,ls.size());
		
	}
	
}
