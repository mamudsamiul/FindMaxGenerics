package com.capgemini.findmaximum;

public class FindMax {
	public static <E extends Comparable<E>> E find(E numberOne, E numberTwo, E numberThree) {
		E max = numberOne;
		if (numberTwo.compareTo(max) > 0)
			max = numberTwo;
		if (numberThree.compareTo(max) > 0)
			max = numberThree;
		return max;
	}
}
