package com.capgemini.findmaximum;

import java.util.ArrayList;
import java.util.Collections;

public class FindMax<E extends Comparable<E>> {
	ArrayList<E> list = new ArrayList<E>();

	public FindMax(E... values) {
		for (E value : values)
			this.list.add(value);
	}

	public E maximum() {
		E max = find(list);
		toPrint(max);
		return max;
	}

	public static <E extends Comparable<E>> E find(ArrayList<E> list) {
		return Collections.max(list);
	}

	private void toPrint(E max) {
		System.out.println("Maximum element is : " + max);
	}
}
