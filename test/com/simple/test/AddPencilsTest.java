package com.simple.test;
/**
	* @author: WangY
	* @date  : 2016年11月4日 下午2:53:53
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class AddPencilsTest {

	FirstDayAtSchool school = new FirstDayAtSchool();

	String[] bag = { "Books", "Notebooks", "Pens", "Pencils" };

	@Test
	public void testAddPencils() {

		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag, school.addPencils());

	}

}
