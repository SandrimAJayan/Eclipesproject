package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest {
	
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
	Fbloginpage ob=new Fbloginpage(Driver);
	ob.setvalues("adjsh@gmail.com", "adadc");
	ob.login();
}
}
