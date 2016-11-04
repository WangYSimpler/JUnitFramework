package com.simple.test;
/**
	* @author: WangY
	* @date  : 2016年11月4日 下午2:52:27
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class PrepareMyBagTest {

	FirstDayAtSchool school = new FirstDayAtSchool();

	String[] bag = { "Books", "Notebooks", "Pens" };

	@Test
	public void testPrepareMyBag() {

		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag, school.preMyBag());

	}

}