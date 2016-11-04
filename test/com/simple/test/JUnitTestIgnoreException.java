package com.simple.test;

import org.junit.Ignore;
import org.junit.Test;

/**
	* @author: WangY
	* @date  : 2016年11月4日 下午3:01:14
*/
public class JUnitTestIgnoreException {

	//@Ignore("Not Ready to Run")  
	@Test
	public void divisionWithException() {  
	  System.out.println("Method is not ready yet");
	}  
}
