package com.coding.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st= "Occurance";  
		Map<String, Long> result = Arrays.stream(st.split(""))
				.map(String::toLowerCase) // if Capital letters are present then use this line else no need
				.collect(Collectors.groupingBy(sa -> sa, LinkedHashMap::new, Collectors.counting()));  
		System.out.println(result);
	}

}
