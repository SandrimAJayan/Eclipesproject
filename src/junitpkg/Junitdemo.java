package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	@Before
	public void setUp()
	{
	 driver=new ChromeDriver();
	driver.get(baseurl);
	} 

	@Test
	public void titleveroification()
	{
	String exp="facbook";
	String acualtitle=driver.getTitle();
	if (acualtitle.equals(exp))
	{
	System.out.println("pass");
	}
	else
	{
	System.out.println("fail");
	}
	}
	@After
	public void tearDown()
	{
	driver.quit();
	}

}