package com.capgemini.findmaximum;

public class FindMax {
	public static Integer find(Integer numberOne, Integer numberTwo, Integer numberThree) {
		Integer max = numberOne;
		if (numberTwo.compareTo(max) > 0)
			max = numberTwo;
		if (numberThree.compareTo(max) > 0)
			max = numberThree;
		return max;
	}
}
