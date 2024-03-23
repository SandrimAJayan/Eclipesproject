package tetsngpkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	//@beforesuite
	//@beforetest
	//@beforeclass
	//@beforemethod
	//@test
	//@aftermethod
	//@afterclass
	//@aftertest
	//@aftersuite
	@BeforeTest
	public void setUp()
	{
		System.out.println("browser open");
		
	}
	@BeforeMethod
	public void setup()
	{
		System.out.println("url loading");
		
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
@Test
public void test2()
{
	System.out.println("test2");
}
}
