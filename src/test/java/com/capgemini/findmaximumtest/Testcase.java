/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgemini.findmaximumtest;

import org.junit.Test;

import com.capgemini.findmaximum.Executer;
import com.capgemini.findmaximum.FindMax;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class Testcase {
	@Test
	public void testCaseOneInt() {
		FindMax findMax = new FindMax(5, 4, 1, 0, 1, 2);
		Integer data = (Integer) findMax.maximum();
		Assert.assertEquals((Integer) 5, data);
	}

	@Test
	public void testCaseTwoInt() {
		FindMax findMax = new FindMax(3, 4, 1, 10);
		Integer data = (Integer) findMax.maximum();
		Assert.assertEquals((Integer) 10, data);
	}

	@Test
	public void testCaseThreeInt() {
		FindMax findMax = new FindMax(5, 4, 9);
		Integer data = (Integer) findMax.maximum();
		Assert.assertEquals((Integer) 9, data);
	}

	@Test
	public void testCaseOneFloat() {
		FindMax findMax = new FindMax(5.6f, 4.9f, 1.0f);
		Float data = (Float) findMax.maximum();
		Assert.assertEquals((Float) 5.6f, data);
	}

	@Test
	public void testCaseTwoFloat() {
		FindMax findMax = new FindMax(3.1f, 4.2f, 1.3f);
		Float data = (Float) findMax.maximum();
		Assert.assertEquals((Float) 4.2f, data);
	}

	@Test
	public void testCaseThreeFloat() {
		FindMax findMax = new FindMax(5.4f, 4.2f, 9.3f);
		Float data = (Float) findMax.maximum();
		Assert.assertEquals((Float) 9.3f, data);
	}

	@Test
	public void testCaseOne() {
		FindMax findMax = new FindMax("d", "c", "b", "a");
		String data = (String) findMax.maximum();
		Assert.assertEquals("d", data);
	}

	@Test
	public void testCaseTwo() {
		FindMax findMax = new FindMax("b", "c", "a");
		String data = (String) findMax.maximum();
		Assert.assertEquals("c", data);
	}

	@Test
	public void testCaseThree() {
		FindMax findMax = new FindMax("b", "a", "c");
		String data = (String) findMax.maximum();
		Assert.assertEquals("c", data);
	}
}
