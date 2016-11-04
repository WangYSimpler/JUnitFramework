package com.simple.test;

import org.junit.Test;

/**
	* @author: WangY
	* @date  : 2016年11月4日 下午2:57:34
*/
public class JUnitTestThrowException {
	
	
	/*在上述例子中，divisionWithException()方法将抛出ArithmeticException异常，
	因为这是一个预期的异常，因此单元测试会通过。*/
	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	}  

}
