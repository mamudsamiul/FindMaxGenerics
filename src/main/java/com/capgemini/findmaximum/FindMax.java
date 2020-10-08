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
		return find(list);
	}

	public static <E extends Comparable<E>> E find(ArrayList<E> list) {
		return Collections.max(list);
	}
}
