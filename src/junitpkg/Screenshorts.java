package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshorts {
	ChromeDriver driver;
	String baseurl="http://www.facebook.com";
	@Before
	
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}

	@Test
	public void screen()throws IOException 
	 {  
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);              //takes screenshot of entire page
	FileHandler.copy(src, new File("D://fbcreenshot1.png"));               //saves screenshot on local disk
		
		
		WebElement loginbutton=driver.findElement(By.name("login"));   //define a webelement with an entity on the screen
		File src1=loginbutton.getScreenshotAs(OutputType.FILE);       // takes screenshot of that entity
		FileHandler.copy(src1, new File("./Screenshot/loginbutton.png"));   //saves screenshot on celenium
				
	 }
}
