package com.simple.test;

import java.util.Arrays;

import org.junit.Ignore;

/**
	* @author: WangY
	* @date  : 2016年11月4日 下午1:42:14
*/
public class FirstDayAtSchool {
	

	public String[] preMyBag() {
		String[] schoolbag = { "Books", "Notebooks", "Pens" };
		System.out.println("My school bag contains: "
				+ Arrays.toString(schoolbag));
		return schoolbag;
	}
	
	public String[] addPencils() {
		String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
		System.out.println("Now my school bag contains: "
				+ Arrays.toString(schoolbag));
		return schoolbag;
	}
}
