package com.Sara.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Sara.JunitTesting.MyMath;

class MyMathTest {
	private MyMath math= new MyMath();
	@Test
	void test() {
		int[] numbers= {1,2,3};
	    int res=math.calculateSum(numbers);
		System.out.println(res);
		int expected=6;
		assertEquals(expected, res);
	}
	@Test
	void calculateSum_ThreeMemberTest1() {
		assertEquals(6, math.calculateSum_ThreeMember(new int[] {1,2,3}));
	}
	@Test
	void calculateSum_ThreeMemberTest2() {
		assertEquals(0, math.calculateSum_ThreeMember(new int[] {}));
	}
	

}
