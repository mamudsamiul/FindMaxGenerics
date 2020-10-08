package com.capgemini.findmaximum;

public class FindMax {
	public static String find(String numberOne, String numberTwo, String numberThree) {
		String max = numberOne;
		if (numberTwo.compareTo(max) > 0)
			max = numberTwo;
		if (numberThree.compareTo(max) > 0)
			max = numberThree;
		return max;
	}
}
