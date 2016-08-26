package com.sap.junit.parameterized;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciSimpleTest {
	
	public String unusedVariable = "haha";
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 } });
	}

	private int fInput;

	private int fExpected;

	public FibonacciSimpleTest(int input, int expected) {
		try {
			fInput = input;
			fExpected = expected;
			throw new IOException();
		} catch (IOException ex ) {
			
		}
		
	}

	@Test
	public void test() {
		assertEquals(fExpected, Fibonacci.compute(fInput));
	}
}
