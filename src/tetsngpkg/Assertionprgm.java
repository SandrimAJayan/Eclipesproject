package tetsngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionprgm {
	WebDriver d;
	String baseurl="https://www.facebook.com/";

	@BeforeTest
	public void beforeTest() {
		
		d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
	}

	@Test
	public void titleverification()
	{	
		String exp="Facebook – log in or sign up";
		String acualtitle=d.getTitle();
		System.out.println(acualtitle);
		Assert.assertEquals(acualtitle,exp);
		System.out.println("test1");
	
	}
}
