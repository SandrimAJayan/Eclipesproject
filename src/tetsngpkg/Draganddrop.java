package tetsngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	 
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	
@BeforeTest
public  void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void draganddropmthd()
{
	WebElement bank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement b=  driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	
	
	

	  
	
}
}
