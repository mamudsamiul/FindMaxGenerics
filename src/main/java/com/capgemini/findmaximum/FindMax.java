package com.capgemini.findmaximum;

public class FindMax<E extends Comparable<E>> {
	E numberOne;
	E numberTwo;
	E numberThree;

	public FindMax(E numberOne, E numberTwo, E numberThree) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = numberThree;
	}

	public E maximum() {
		return find(numberOne, numberTwo, numberThree);
	}

	public static <E extends Comparable<E>> E find(E numberOne, E numberTwo, E numberThree) {
		E max = numberOne;
		if (numberTwo.compareTo(max) > 0)
			max = numberTwo;
		if (numberThree.compareTo(max) > 0)
			max = numberThree;
		return max;
	}
}
