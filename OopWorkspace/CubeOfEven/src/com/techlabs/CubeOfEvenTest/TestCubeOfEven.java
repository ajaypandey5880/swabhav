package com.techlabs.CubeOfEvenTest;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.omg.IOP.ExceptionDetailMessage;

import com.techlabs.CubeOfEven.CubeOfEven;

public class TestCubeOfEven {
	@Test
	void passingEvenNo() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.evenCube(2);
		assertEquals(8, result);
	}

	@Test
	void passingNeagtiveEvenNo() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.evenCube(-2);
		assertEquals(-8, result);
	}

	@Test
	void passingOddNo() {
		CubeOfEven cube = new CubeOfEven();
		try {
		int result = cube.evenCube(3);
		fail("this should throw excepion");
		}catch(RuntimeException e) {
			assertEquals(e.getMessage(),"Pass A Even No");
		}

	}
	@Test
	void PassingNegativeOddNo() {
		CubeOfEven cube = new CubeOfEven();
		try {
			int result = cube.evenCube(-1);
			fail("this should throw excepion");
			}catch(RuntimeException e) {
				assertEquals(e.getMessage(),"Pass A Even No");
			}
	}
	@Test
	void passingLongint() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.evenCube(10000);
		//assertEquals(1,000,000,000,000 , result);
	}
	
	@Test
	void passingZero() {
		CubeOfEven cube = new CubeOfEven();
		int result = cube.evenCube(0);
		assertEquals(0, result);
	}
}
