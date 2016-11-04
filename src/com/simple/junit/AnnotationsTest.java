package com.simple.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;


/**
	* @author: WangY
	* @date  : 2016年11月3日 下午4:47:04
*/

/***
* 		===junit测试注释代码===
	//测试注释指示该公共无效方法它所附着可以作为一个测试用例。
	@Test
	public void method()	
	//Before注释表示，该方法必须在类中的每个测试之前执行，以便执行测试某些必要的先决条件。
	@Before
	public void method()
	//BeforeClass注释指出这是附着在静态方法必须执行一次并在类的所有测试之前。发生这种情况时一般是测试计算共享配置方法(如连接到数据库)。	
	@BeforeClass
	public static void method()	
	//After 注释指示，该方法在执行每项测试后执行(如执行每一个测试后重置某些变量，删除临时变量等)
	@After
	public void method()
	//当需要执行所有的测试在JUnit测试用例类后执行，AfterClass注解可以使用以清理建立方法，(从数据库如断开连接)。注意：附有此批注(类似于BeforeClass)的方法必须定义为静态。	
	@AfterClass
	public static void method()	
	//当想暂时禁用特定的测试执行可以使用忽略注释。每个被注解为@Ignore的方法将不被执行。
	@Ignore
	public static void method()	
 *
 */
public class AnnotationsTest {
	
	private ArrayList testList;
	
	@BeforeClass
	public static void onceExecutedBeforeAll()
	{
		System.out.println("@BeforeClass execute beforeClass!!");
	}
	
	@Before
	public void executeBeforeEach()
	{
		testList = new ArrayList<>();
		System.out.println("@before execute before each ");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		System.out.println("@AfterClass: onceExecutedAfterAll");
	}

	@After
	public void executedAfterEach() {
		testList.clear();
		System.out.println("@After: executedAfterEach");
	}

	@Test
	public void EmptyCollection() {
		assertTrue(testList.isEmpty());
		System.out.println("@Test: EmptyArrayList");

	}

	@Test
	public void OneItemCollection() {
		testList.add("oneItem");
		assertEquals(1, testList.size());
		System.out.println("@Test: OneItemArrayList");
	}

	@Ignore
	public void executionIgnored() {

		System.out.println("@Ignore: This execution is ignored");
	}
}
