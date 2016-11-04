package com.simple.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

/**
	* @author: WangY
	* @date  : 2016年11月4日 下午1:45:47
*/
public class FirstDayAtSchoolTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };

	@Test
	public void testPreMyBag() {
		System.out.println("Inside testPreMyBag()");
		assertArrayEquals(bag1, school.preMyBag());
	}
	///@Ignore 在测试过程中不测试该代码
	@Ignore
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}

	
	
}
