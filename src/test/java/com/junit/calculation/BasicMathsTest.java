package com.junit.calculation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BasicMathsTest {
	BasicMaths bm = new BasicMaths();

	@Test
	public void calculationTest() {

		assertEquals(2, bm.add(1, 1));
	}

	@Test
	public void areaTest() {
		assertEquals(6, bm.areaRectangle(2, 3));
	}

	@Test
	public void checkTrueFalse() {

		assertTrue(2 == bm.add(1, 1));
		assertFalse(2 == bm.subtract(4, 3));
	}

	@Test
	public void checkAarrayEquality() {
		assertArrayEquals(bm.ar1, bm.ar2);
		assertArrayEquals(bm.ar1, bm.ar3);

	}

	@Before
	public void myName() {
		System.out.println("Saurabh");
	}

}
