package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbxpath {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	
	public void fblogin() {
		driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@ name='pass']")).sendKeys("fsd");
		driver.findElement(By.xpath("//button[@ name='login']")).click();
		
	}
	

}
