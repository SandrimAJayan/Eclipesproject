package testpkg;
//import pagepkg

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbsignup;

public class Fbsignuptest {

	WebDriver Driver;
	@BeforeTest
	public void setUp()
	{
	Driver=new ChromeDriver();
	Driver.get("https://www.facebook.com/");
	}
@Test
public void testlogin()
{
Fbsignup ob=new Fbsignup(Driver);
ob.cp();
ob.signup();
}
}

