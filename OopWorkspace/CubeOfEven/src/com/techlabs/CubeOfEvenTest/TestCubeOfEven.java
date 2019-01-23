package com.techlabs.CubeOfEvenTest;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.omg.IOP.ExceptionDetailMessage;

import com.techlabs.CubeOfEven.CubeOfEven;

public class TestCubeOfEven {
	@Test
	void test1() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.even(2);
		assertEquals(8, result);
	}

	@Test
	void test2() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.even(-2);
		assertEquals(-8, result);
	}

	@Test
	void test3() {
		CubeOfEven cube = new CubeOfEven();
		try {
		int result = cube.even(3);
		fail("this should throw excepion");
		}catch(RuntimeException e) {
			assertEquals(e.getMessage(),"Pass A Even No");
		}

	}
	@Test
	void test4() {
		CubeOfEven cube = new CubeOfEven();
		try {
			int result = cube.even(-1);
			fail("this should throw excepion");
			}catch(RuntimeException e) {
				assertEquals(e.getMessage(),"Pass A Even No");
			}
	}
	@Test
	void test5() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.even(10000);
		//assertEquals(1,000,000,000,000 , result);
	}
}
