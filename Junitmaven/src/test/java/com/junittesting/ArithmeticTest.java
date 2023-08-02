package com.junittesting;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmeticTest {
	private int fno;
	private int sno;
	private int result;
	private Arithmetic arithmetic;
	public ArithmeticTest(int fno, int sno, int result) {
		this.fno = fno;
		this.sno = sno;
		this.result = result;
	}
	@Before
	public void before()
	{
		arithmetic=new Arithmetic();
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{10,20,30}});
	}
	@Test
	public void test() {
		System.out.println("Sum Of Numbers : "+result);
		assertEquals(result, arithmetic.sum(fno, sno));
	}
	
	
}
