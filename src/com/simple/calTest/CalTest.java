package com.simple.calTest;
import org.junit.Test;
import static org.junit.Assert.*;
/**
	* @author: WangY
	* @date  : 2016年11月3日 下午2:10:35
*/
public class CalTest {

	Cal cal = new Cal();
	int sum = cal.sum(2, 7);
	
	@Test
	public void testSum()
	{
		System.out.println("@test sum() = " +  sum );
		assertEquals(sum, 9);
	}


}
