package Sel_Java_Maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Test 
{
	@Test
	public static void TestCase1()
	{
		System.out.println("Testcase1");
	}
	
	@BeforeSuite
	public static void bs()
	{
		System.out.println("bs");

	}
	@BeforeTest
	public static void bt()
	{
		System.out.println("bt");

	}
	@BeforeClass
	public static void bc()
	{
		System.out.println("bc");

	}
	@BeforeMethod
	public static void bm()
	{
		System.out.println("bm");

	}
	@AfterMethod
	public static void am()
	{
		System.out.println("am");

	}
	@AfterClass
	public static void ac()
	{
		System.out.println("ac");

	}
	@AfterTest
	public static void at()
	{
		System.out.println("at");

	}
	@AfterSuite
	public static void as()
	{
		System.out.println("as");

	}
	@Test
	public static void TestCase2()
	{
		System.out.println("Testcase2");

	}
	@Test
	public static void TestCase3()
	{
		System.out.println("Testcase3");

	}
	

}
