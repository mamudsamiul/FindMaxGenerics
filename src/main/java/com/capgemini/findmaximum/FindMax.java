package com.capgemini.findmaximum;

public class FindMax {
	public static Float find(Float numberOne, Float numberTwo, Float numberThree) {
		Float max = numberOne;
		if (numberTwo.compareTo(max) > 0)
			max = numberTwo;
		if (numberThree.compareTo(max) > 0)
			max = numberThree;
		return max;
	}
}
