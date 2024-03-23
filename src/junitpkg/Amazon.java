package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
ChromeDriver driver;
String baseurl="https://www.amazon.in/";
  
@Before
public void setUp()

{
	driver=new ChromeDriver();
	driver.get(baseurl);
	
}
@Test
public void amazonsite()
{
	 driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[2]/div[1]/input")).sendKeys("mobiles");
    driver.findElement(By.xpath(" //form[@id='nav-search-bar-form']/div[3]/div/span/input")).click();
    driver.findElement(By.xpath(" //div[@id='nav-xshop")).click();
	
}




}
