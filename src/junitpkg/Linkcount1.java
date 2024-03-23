package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount1 {
	ChromeDriver  driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkcount()
	{
	 List<WebElement>	linklist =driver.findElements(By.tagName("a")); 
	 System.out.print(linklist.size());// NO OF ELEMENTS IN ARRAY LINKLIST
	 for(WebElement element:linklist)
		 System.out.println(element.getText());// DISPLAY EACH ELEMENT OF  ARRAY
	
	
	
	}

}
