package com.coding.test;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,5,3,7,8,9,1,4,9};
		
		int secondLargestNumber = Arrays.stream(array).distinct().boxed()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Array does not have a second smallest element"));
		
		System.out.println("Second Largest Number in Array: " + secondLargestNumber);
	}

}
