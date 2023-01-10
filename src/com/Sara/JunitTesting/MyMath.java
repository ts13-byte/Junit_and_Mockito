package com.Sara.JunitTesting;

public class MyMath {

	public int calculateSum(int[] numbers) {
		int sum=0;
		for(int num:numbers) {
			sum+=num;
		}
		return sum;
	}
	public int calculateSum_ThreeMember(int[] arr) {
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		return sum;
	}
}
